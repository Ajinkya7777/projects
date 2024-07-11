package com.easybytes.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // during the startup it is going to scan all the beans declared inside this
				// class
public class ProjectSecurityConfig {

	@Bean
	@Order(SecurityProperties.BASIC_AUTH_ORDER)
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
	http.csrf().disable().authorizeHttpRequests().requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
				.requestMatchers("/notices", "/contact","/register").permitAll().and().formLogin().and().httpBasic();
		// .anyRequest().authenticated();
		// http.formLogin();
		// http.httpBasic();
		return http.build();
	}

	@Bean
	public PasswordEncoder passwrodEncoder() {
		return new BCryptPasswordEncoder();
	}
}
