package com.indranil.auth2.facebook.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

	@EnableOAuth2Sso
	@Configuration
	public class Outh2Authintication extends WebSecurityConfigurerAdapter {

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .antMatcher("/**")
	                .authorizeRequests()
	                .antMatchers("/", "/login**", "/webjars/**", "/error**")
	                .permitAll()
	                .anyRequest()
	                .authenticated();
	    }
}
