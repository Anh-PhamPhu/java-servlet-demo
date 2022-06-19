package com.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/test-add-person"})
public class PersonServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter pt = resp.getWriter();

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address = req.getParameter("address");

        pt.println("Name : " + name);
        pt.println("Age : " + age);
        pt.println("Address : " + address);
    }
}
