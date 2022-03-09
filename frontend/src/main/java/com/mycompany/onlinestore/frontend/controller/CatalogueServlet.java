package com.mycompany.onlinestore.frontend.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CatalogueServlet", urlPatterns = "/catalogue")
public class CatalogueServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter(); // ouverture flux en écriture
        resp.setContentType("text/html");

        out.println("<html><body>");
        out.println("<h1> Oeuvres au catalogue </h1>");
        out.println("</body></html>");
    }
}
