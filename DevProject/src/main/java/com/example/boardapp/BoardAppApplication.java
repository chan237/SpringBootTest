/*
 * package com.example.boardapp;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * import org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * @SpringBootApplication public class BoardAppApplication {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(BoardAppApplication.class, args); }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http,
 * PasswordEncoder passwordEncoder) throws Exception { http
 * .authorizeHttpRequests(authorize -> authorize .requestMatchers("/", "/login",
 * "/resources/**").permitAll() .anyRequest().authenticated() ) .formLogin(form
 * -> form .loginPage("/login") .defaultSuccessUrl("/board", true) .permitAll()
 * ) .logout(logout -> logout .logoutUrl("/logout") .logoutSuccessUrl("/")
 * .permitAll() );
 * 
 * return http.build(); }
 * 
 * @Autowired public void configure(AuthenticationManagerBuilder auth,
 * PasswordEncoder passwordEncoder) throws Exception {
 * auth.inMemoryAuthentication() .withUser("user")
 * .password(passwordEncoder.encode("password")) .roles("USER"); }
 * 
 * }
 */