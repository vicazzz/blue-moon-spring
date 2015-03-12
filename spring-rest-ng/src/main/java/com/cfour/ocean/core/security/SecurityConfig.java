package com.cfour.ocean.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AuthenticationFailure authenticationFailure;
	
	@Autowired
	private AuthenticationSuccess authenticationSuccess;
	
	@Autowired
	private EntryPointUnauthorizedHandler entryPoint;
	
	@Autowired
    private UserDetailsServiceImpl userDetailService;
	
	@Autowired
    public void configAuthBuilder(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(userDetailService);
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		
			.exceptionHandling()
				.authenticationEntryPoint(entryPoint)
				.and()
			.csrf().disable()
			.formLogin()
				.successHandler(authenticationSuccess)
				.failureHandler(authenticationFailure)
				.loginProcessingUrl("/auth")
				.usernameParameter("username")
				.passwordParameter("password")
				.permitAll()
				.and()
			.authorizeRequests()
				.antMatchers("/**").permitAll();		
		
						
	}

}
