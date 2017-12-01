package com.hw.sec;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.frameoptions.WhiteListedAllowFromStrategy;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;

@Configuration 
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests() 
			.antMatchers("/admin/**").hasAuthority("ADMIN")  
			.antMatchers("/**").permitAll()                  
        .and()
		.formLogin()
			.loginPage("/login") // 로그인 페이지로 이동시킴
			.permitAll()
			.and().exceptionHandling().accessDeniedPage("/denied");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("admin").password("1234").authorities("ADMIN");
		auth
		.inMemoryAuthentication()
			.withUser("user").password("1234").authorities("USER");
				
	}
	
	
	
}