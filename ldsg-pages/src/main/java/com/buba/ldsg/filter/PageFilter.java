package com.buba.ldsg.filter;

import com.buba.ldsg.pojo.User;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
@WebFilter(filterName = "login", urlPatterns = "/*")
public class PageFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----------------------->过滤器被创建");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String requestURL = req.getRequestURL().toString();
        HttpSession session = req.getSession();
        String token = (String) session.getAttribute("token");
        User user = (User) session.getAttribute(token);
        if ((!("".equals(token)) && token != null) || requestURL.contains("/css/") || requestURL.contains("/js/") || requestURL.contains("/fonts/") || requestURL.contains("/img/") || requestURL.contains("login") || requestURL.contains("/toLogin") || requestURL.contains("/register")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletRequest.getRequestDispatcher("404.html").forward(servletRequest,
                    servletResponse);
        }
    }

    public void destroy() {
        System.out.println("----------------------->过滤器被销毁");
    }
}
