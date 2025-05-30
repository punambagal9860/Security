package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("punam").password("{noop}nia").roles("customer");
//		auth.inMemoryAuthentication().withUser("sutii").password("{noop}hybd").roles("manager");
//		auth.inMemoryAuthentication().withUser("sutaa").password("{noop}banflore").roles("hr");
//	}
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//	http.authorizeRequests().antMatchers("/home").permitAll()
//	                                                .antMatchers("/offer").authenticated()
//	                                                .antMatchers("/balence").hasAnyRole("customer","hr")
//	                                                .antMatchers("/approve").hasRole("hr")
//	                                                .anyRequest().authenticated()
//	                                                .and().httpBasic()
//	                                                .and().exceptionHandling().accessDeniedPage("/error");
//	                                                
	@Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("raja").password("$2a$10$awkC.a6uVvQsJcMYEeFFIuULznwF.ldGqy.4/PV2ZmMDEOTMQ7jpu").roles("CUSTOME");
	        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("Shakti").password("$2a$10$qNU79aZxWWTL.jb4aYCgF.y3vfXfOkbYOvuKYMP.XmzPG/9z8qhLS").roles("MANAGER");
	    auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("nitin").password("$2a$10$AAdeWH7NY55/gHkqi3PitOBLMKbSutqIZAbn7ZDrMqhBHI4DobZry").roles("VISITOR");
	  }
	  
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    //config authrizationRequest
	    http.authorizeRequests().antMatchers("/home").permitAll()
	                             .antMatchers("/offer").authenticated()
	                             .antMatchers("/balence").hasAnyRole("CUSTOME", "MANAGER")
	                             .antMatchers("/approve").hasRole("MANAGER")
	                             .anyRequest().authenticated()
	                       //      .and().formLogin().loginPage("/showLogin")
	                             .and().formLogin()
	                             .and().logout()
	                             .and().exceptionHandling().accessDeniedPage("/error")
	                             .and().sessionManagement().maximumSessions(5).maxSessionsPreventsLogin(true);
	  }
	
	}

	
	
	


