package com.bnp.sprbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.GET, "/api/**")
						.hasAnyRole("USER", "ADMIN").requestMatchers(HttpMethod.POST, "/api/**").hasRole("ADMIN")
						.requestMatchers(HttpMethod.PUT, "/api/**").hasRole("ADMIN")
						.requestMatchers(HttpMethod.DELETE, "/api/**").hasRole("ADMIN").anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults());

		return http.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.builder().username("user").password("{noop}user123").roles("USER").build();

		UserDetails admin = User.builder().username("admin").password("{noop}admin234").roles("ADMIN").build();

		return new InMemoryUserDetailsManager(user, admin);

	}
}
