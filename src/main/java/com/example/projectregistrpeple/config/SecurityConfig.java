package com.example.projectregistrpeple.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Класс в котором мы настраиваем конфигурацию нашего спринга

    @Override
    protected void configure(HttpSecurity http) throws Exception {


        http.authorizeRequests(ar->{
                ar.antMatchers("/register").permitAll(); // Тут мы указываем фильтр на какие страницы (адреса) мы даём доступ
                ar.anyRequest().authenticated();// Это строка обозначат что все остальные запросы требуют авторизации
            }).csrf().disable(); // тут мы отключили токен стандартный

    }




}
