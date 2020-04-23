package nl.rls.ci.auth;

import nl.rls.ci.aa.domain.AppUser;
import nl.rls.ci.aa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class FirebaseAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UserRepository userRepository;

    public boolean supports(Class<?> authentication) {
        return (FirebaseAuthenticationToken.class.isAssignableFrom(authentication));
    }

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (!supports(authentication.getClass())) {
            return null;
        }

        FirebaseAuthenticationToken authenticationToken = (FirebaseAuthenticationToken) authentication;
        AppUser user = userRepository.findByUsername(authenticationToken.getName());
        if (user == null) {
            throw new FirebaseUserNotExistsException();
        }


        String role = user.getRoles().get(1).getName();

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role));
        authenticationToken = new FirebaseAuthenticationToken(user, authentication.getCredentials(),
                authorities);

        return authenticationToken;
    }
}
