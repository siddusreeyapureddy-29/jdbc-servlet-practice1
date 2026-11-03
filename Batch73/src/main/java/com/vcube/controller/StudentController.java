package com.vcube.controller;

import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.model.StudentModel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("WELCOME TO DO GET");
        response.getWriter().println("Servlet is working");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Welcome to Servlets");

        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmpassword");

        System.out.println(fullname + ":" + email + ":" + password);

        StudentModel sm = new StudentModel();

        sm.setFullname(fullname);
        sm.setEmail(email);
        sm.setPassword(password);
        sm.setConfirmpassword(confirmPassword);

        StudentDAO s = new StudentDAO();

        String status = s.insertStudents(sm);

        if (status.equals("success")) {
            RequestDispatcher rd=request.getRequestDispatcher("login.html");
            rd.forward(request, response);
        } else {
        	RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.forward(request, response);
        }
    }
}