package com.maharjan.amit.web.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Enumeration;

public class AccessLogListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Request Method: " + request.getMethod());
        System.out.println("Request Date: " + new Date());
        System.out.println("User Agent: " + request.getHeader("User-Agent"));
        System.out.println("Request Address: " + request.getRemoteAddr());

        Enumeration<String> params = request.getParameterNames();
        System.out.println("Parameters:");
        while(params.hasMoreElements()) {
            String key = params.nextElement();
            System.out.println(key + "=" + request.getParameter(key));
        }
    }
}
