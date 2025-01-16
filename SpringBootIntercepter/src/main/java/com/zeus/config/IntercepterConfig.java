package com.zeus.config; 
 
import org.springframework.context.annotation.Configuration; 
import org.springframework.web.servlet.config.annotation.InterceptorRegistry; 
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; 
import com.zeus.common.interceptor.LoginInterceptor;  
//설정파일을 만들기 위한 or Bean을 등록하기 위한애노테이션 
@Configuration 
public class IntercepterConfig implements WebMvcConfigurer { 
 
@Override 
public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(new 
	LoginInterceptor()).addPathPatterns("/login", "/board", "/api/**"); 
	 
	WebMvcConfigurer.super.addInterceptors(registry); 
	} 

}