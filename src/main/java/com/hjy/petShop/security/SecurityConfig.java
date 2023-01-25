package com.hjy.petShop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // 권한에 따라 허용하는 url 설정
        // /login, /signup 페이지는 모두 허용, 다른 페이지는 인증된 사용자만 허용
        http.authorizeRequests()
                .antMatchers("/login", "/signup", "/", "/css/**", "/*").permitAll()
                .anyRequest().authenticated();

        // login 설정
        http.formLogin()
                .loginPage("/login") // GET요청 (login form을 보여줌)
                .usernameParameter("id")
                .passwordParameter("password")
                .defaultSuccessUrl("/"); // login에 성공하면 /로 redirect

        // logout 설정
        http.logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/"); // logout에 성공하면 /로 redirect

        return http.build();
    }

    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic().disable();
    }
}