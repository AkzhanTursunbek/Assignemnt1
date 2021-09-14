package com.example.Assignemnt1;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String ID = req.getParameter("ID");
        HttpSession session = req.getSession(true);
        session.setAttribute("name", name);
        session.setAttribute("ID", ID);
        Cookie cname = new Cookie("User_name", name);
        Cookie cid = new Cookie("ID", ID);
        resp.addCookie(cname);
        resp.addCookie(cid);
        session.setAttribute("name", name);
        session.setAttribute("ID", ID);

            out.println("<h2>Saved</h2>"+ "<br>");
            resp.getWriter().println("Welcome " + session.getAttribute("name") + "<br>");
            resp.getWriter().println("Your id is " + session.getAttribute("ID") + "<br>");


        }

    }








