package com.beyond.spring.mvc.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 拦截器，实现HandlerInterceptor接口的三个方法
 */
public class HelloInterceptor implements HandlerInterceptor {

    /*
     * 请求前处理
     * 可以在这里判断是否拦截，初始化某些东西
     */
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        // true：放行    false：拦截，不放行
        return false;
    }

    /*
     * 请求被放行后处理
     */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /*
     * 请求全部结束后处理，
     * 请求前处理时初始化创建的，可以在这里释放
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
