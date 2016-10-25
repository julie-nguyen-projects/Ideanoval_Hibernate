package com.humanbooster.ideanoval.servlet;

import com.humanbooster.ideanoval.service.IdeaService;
import com.humanbooster.ideanoval.service.impl.IdeaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nea on 25/10/2016.
 */
@WebServlet(name = "WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

    private IdeaService is = new IdeaServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        is.getAllIdeas();
        request.getRequestDispatcher("welcome.jsp").forward(request, response);
    }
}
