package com.svg.java.jee.jee001.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletFormMultiSelectFields extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] selectedValues = request.getParameterValues("courses");
		PrintWriter printWriter = response.getWriter();
		 
		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("Courses chosen were: ");
		printWriter.println("<form method='post' action='ServletFormHiddenFields'>");
		printWriter.println("<input type='hidden' name='user' value='serge'/>");
		printWriter.println("<input type='hidden' name='numberOfCoursesSelected' value='" + selectedValues.length + "'/>");
		for (int i = 0; i < selectedValues.length; i++) {
			printWriter.println("<input type='hidden' name='courses' value='" + selectedValues[i] + "'/>");
			printWriter.println("-" + selectedValues[i]);
		}
		printWriter.println("<input type='submit' value='Send results'>");
		printWriter.println("</form>");
		printWriter.println("</body>");
		printWriter.println("</html>");
		
	}

}
