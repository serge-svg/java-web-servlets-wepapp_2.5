package com.svg.java.jee.jee001.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFormHiddenFields extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numberOfCoursesSelected = Integer.parseInt(request.getParameter("numberOfCoursesSelected"));
		String[] selectedValues = request.getParameterValues("courses");
		PrintWriter printWriter = response.getWriter();
		printWriter.printf("Courses chose by the user %s was/were %s %n ", request.getParameter("user"),  numberOfCoursesSelected);
		for (int i = 0; i < numberOfCoursesSelected; i++) {
			printWriter.println(selectedValues[i]);
		}
		
	}


}
