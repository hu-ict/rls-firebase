package nl.rls.ci.aa.security;

import nl.rls.ci.auth.FirebaseFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import nl.rls.ci.aa.repository.LicenseRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MyWebSecurity extends WebSecurityConfigurerAdapter {
	private UserDetailsServiceImpl userDetailsService;
    private LicenseRepository licenseRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private FirebaseFilter firebaseFilter;

	public MyWebSecurity(UserDetailsServiceImpl userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder, LicenseRepository licenseRepository) {
		this.userDetailsService = userDetailsService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.licenseRepository = licenseRepository;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterBefore(firebaseFilter, BasicAuthenticationFilter.class).cors().and().csrf().disable().authorizeRequests()
				.antMatchers("/api/v1/ci/messages/**").hasRole("USER")
				.antMatchers("/api/v1/ci/messages**").hasRole("USER")
				.antMatchers("/api/v1/ci/traincompositionmessages/**").hasRole("USER")
				.antMatchers("/api/v1/ci/traincompositionmessages**").hasRole("USER")
				.antMatchers("/aa/owners/").hasRole("ADMIN")
				.antMatchers("/aa/owners").hasRole("ADMIN")
				.antMatchers("/aa/**").hasAnyRole("ADMIN","SUPER_USER")
				.antMatchers("/aa**").hasAnyRole("ADMIN","SUPER_USER")
				.antMatchers(HttpMethod.POST, SecurityConstants.SIGN_UP_URL).permitAll()
				.and()

				// this disables session creation on Spring Security
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}
}