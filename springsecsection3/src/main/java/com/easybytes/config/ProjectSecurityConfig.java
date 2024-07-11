package com.easybytes.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
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

	
	/*
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		/*
		 * Approach 1 where we use withDefaultPasswrodEndoder() method while creating
		 * the user details
		 */

		/*
		 * UserDetails admin = User.withDefaultPasswordEncoder() .username("admin")
		 * .password("12345") .authorities("admin") .build();
		 * 
		 * UserDetails user = User.withDefaultPasswordEncoder() .username("user")
		 * .password("12345") .authorities("read") .build();
		 * 
		 * return new InMemoryUserDetailsManager(admin,user);
		 */

		/*Approach 2 where we use NoOpPasswordEncoder() method while creating the user details*/
		
		/*UserDetails admin = User.withUsername("admin").password("12345").authorities("admin")
				.build();

		UserDetails user = User.withUsername("user").password("12345").authorities("read")
				.build();

		return new InMemoryUserDetailsManager(admin, user);

	} */
	
	/*@Bean
	public UserDetailsService userDetailsService(DataSource datasource) {
		return new JdbcUserDetailsManager(datasource);
	}*/
	
	
	
	
	/* NoOpPasswordEncoder is not recommended for production usage
	 *  usage for only non-prod 
	 */
	
	@Bean
	public PasswordEncoder passwrodEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
