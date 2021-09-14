package com.example.Assignemnt1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "second", value = "/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest req,final HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter writer = resp.getWriter();
        String ID = req.getParameter("ID");
        Cookie[] cookies = req.getCookies();
        HttpSession session = req.getSession(true);
        RequestDispatcher rd = req.getRequestDispatcher("ID.jsp");
        rd.include(req, resp);
        if (cookies == null) {
            writer.println("No cookies found");
        } else {
                if (ID.equals(session.getAttribute("ID")) ){
                    resp.getWriter().println(session.getAttribute("name"));
                }
            }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");


    }
}