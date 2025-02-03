package com.zeus.common.interceptor;

import java.lang.reflect.Method;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.java.Log;

@Log
public class AccessLoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 요청을 컨트롤러로 넘기기 전 동작
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String requestURL = request.getRequestURI();
        log.info("requestURL : " + requestURL);

        // handler가 HandlerMethod인 경우에만 처리
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            Class<?> clazz = method.getDeclaringClass();
            String className = clazz.getName();
            String classSimpleName = clazz.getSimpleName();
            String methodName = method.getName();

            log.info("[ACCESS CONTROLLER] " + className + "." + methodName);
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 요청이 완료된 후 실행 (예: 예외 처리 로깅 등)
        if (ex != null) {
            log.warning("Exception occurred: " + ex.getMessage());
        }
    }
}
