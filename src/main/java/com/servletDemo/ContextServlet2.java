package com.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/servlet2"})
public class ContextServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter pt = resp.getWriter();

        String name = (String) getServletContext().getAttribute("name");
        String mysql = (String) getServletContext().getAttribute("mysql");
        pt.println("Hello " + name);
        pt.println("Hello " + mysql);
    }
}
