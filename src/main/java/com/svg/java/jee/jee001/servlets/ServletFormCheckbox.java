package com.svg.java.jee.jee001.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFormCheckbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Courses chosen were:");
		if(request.getParameter("java") != null){
			printWriter.printf("- %s %n", request.getParameter("java"));
		}
		if(request.getParameter("net") != null){
			printWriter.printf("- %s %n", request.getParameter("net"));
		}
	}

}
