package com.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/session-test"})
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpS = req.getSession();
        httpS.setAttribute("name", "Phu Anh");

        resp.setContentType("text/html");

        PrintWriter pt = resp.getWriter();
//        pt.println(httpS.getAttribute("name"));
    }
}
