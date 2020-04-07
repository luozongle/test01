package com.luozongle.service;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class Login implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("进入方法");
        System.out.println(servletRequest.getProtocol());
        System.out.println(servletRequest.getServletContext().getContextPath());

        servletRequest.getRequestDispatcher("/WEB-INF/success.jsp").forward(servletRequest,servletResponse);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
