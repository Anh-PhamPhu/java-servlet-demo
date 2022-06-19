package com.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/req-add-person"})
public class PersonFromServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter pt = resp.getWriter();

        pt.println("<form action='/test-add-person' method='POST'>");
        pt.println("<input type='text' name='name' >");
        pt.println("<input type='text' name='age' >");
        pt.println("<input type='text' name='address' >");
        pt.println("<input type='submit' value='submit' >");
        pt.println("</form>");
    }
}
