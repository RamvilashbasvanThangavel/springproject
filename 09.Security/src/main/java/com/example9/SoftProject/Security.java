package com.example9.SoftProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class Security extends WebSecurityConfigurerAdapter {

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("Ramvilash")
//				.password("Ram1804").roles("trainer");
//	}

//	@Bean
//	public PasswordEncoder getPassword() {
//		return NoOpPasswordEncoder.getInstance();
//	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Ramvilash")
				.password("$2a$12$VOvwj/OL9i8lGqNymXTpVOKzc1hP24qVlvWLNbfqSPwnCgrc9dZ.a").roles("student").and()
				.withUser("Arun").password("$2a$10$QLR3/hbjoXJwOavtkxGHz.E1uCwi3cZdQByIwh0kXffl5I1SYNc4K")
				.roles("trainer").and().withUser("Muthu")
				.password("$2a$10$oLZSrwLvI/Tg5XBHwFLJq.Q1MalAY6eolbmKd3qP0DEv7SxAoVXze").roles("manager");
	}

	//$2a$12$VOvwj/OL9i8lGqNymXTpVOKzc1hP24qVlvWLNbfqSPwnCgrc9dZ.a - Link generated from online Bcrypt.
	// password-Ramvilash-Ramvilash1804
	// password-Arun-Arun
	// password-Muthu-Muthu

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/manager").hasRole("manager");
		http.authorizeRequests().antMatchers("/trainer").hasAnyRole("manager", "trainer");
		http.authorizeRequests().antMatchers("/student").hasAnyRole("manager", "trainer", "student").and().formLogin();
	  // http.authorizeRequests().antMatchers("/student").permitAll().and().formLogin();
	}

	@Bean
	public PasswordEncoder getPassword() {
		return new BCryptPasswordEncoder(10);
	}

}
