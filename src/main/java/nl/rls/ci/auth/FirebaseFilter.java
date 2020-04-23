package nl.rls.ci.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import nl.rls.ci.aa.domain.AppUser;
import nl.rls.ci.aa.domain.Role;
import nl.rls.ci.aa.repository.RoleRepository;
import nl.rls.ci.aa.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class FirebaseFilter extends OncePerRequestFilter {
    @Autowired
    private UserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String token = request.getHeader("token");
        if (StringUtils.isBlank(token)) {
            filterChain.doFilter(request, response);
            return;
        } else {
            try {
                FirebaseTokenHolder holder = new FirebaseTokenHolder(FirebaseAuth.getInstance().verifyIdToken(token));
                String uid = holder.getUid();
                String username = holder.getEmail();
                AppUser user = userRepository.findByUsername(username);
                String role = user.getRoles().get(0).getName();
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority(role));
                Authentication auth = new FirebaseAuthenticationToken(uid, holder, authorities);
                SecurityContextHolder.getContext().setAuthentication(auth);

                filterChain.doFilter(request, response);



            } catch (FirebaseTokenInvalidException e) {
                throw new SecurityException(e);
            } catch (FirebaseAuthException e) {
                e.printStackTrace();
            }
        }
    }
}
