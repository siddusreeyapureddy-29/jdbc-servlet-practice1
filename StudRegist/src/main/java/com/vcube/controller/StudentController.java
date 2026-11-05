package com.vcube.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.dao.StudentDAO;
import com.vcube.model.StudentModel;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String mobilenumber = request.getParameter("mobilenumber");
		String gender = request.getParameter("gender");
		String course = request.getParameter("course");
		String city = request.getParameter("city");
		System.out.println(username + ":" + email + ":" + mobilenumber + ":" + gender + ":" + course + ":" + city);
		
		StudentModel sm = new StudentModel();
		sm.setUsername(username);
		sm.setEmail(email);
		sm.setMobilenumber(mobilenumber);
		sm.setGender(gender);
		sm.setCourse(course);
		sm.setCity(city);
		
		StudentDAO sd = new StudentDAO();
		
		String status = sd.insertStudent(sm);
		if (status.equals("success")) {
			System.out.println("Student Registration Successful");
		} else {
			System.out.println("Student resgistration not successful");
		}

	}

}
