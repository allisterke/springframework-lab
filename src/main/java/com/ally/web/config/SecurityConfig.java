package com.ally.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

/**
 * Created by ally on 7/7/17.
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/index.html").permitAll()
                    .antMatchers("/**").hasRole("USER")
                    .and()
                .csrf()
                    .disable()
                .formLogin()
                    .loginPage("/index.html")
                    .successForwardUrl("/login")
        ;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authBuilder, DataSource dataSource) throws Exception {
        authBuilder
                .jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(new BCryptPasswordEncoder())
                .rolePrefix("ROLE_")
        ;
    }
}
