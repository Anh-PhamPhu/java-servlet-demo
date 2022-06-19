package com.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(
//        urlPatterns = {"/test-servlet-config"},
//        initParams = {
//                @WebInitParam(name="name", value="Anh Pham Phu")
//        }
//)
public class ServletConfigDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = super.getServletConfig().getInitParameter("name");
        resp.setContentType("text/html");

        PrintWriter pt = resp.getWriter();

        pt.println("Hello : " + name);
    }
}
