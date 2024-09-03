package com.koreaIT.jsp.am;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/printDan")
public class PrintDanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8;");
		
		String inputDan = request.getParameter("dan");
		String inputColor = request.getParameter("color");
		
		int dan = Integer.parseInt(inputDan);
		
		response.getWriter().append("<div style='color:" + inputColor + ";'>== " + dan + "단 ==</div>");
		for (int i = 1; i <= 9; i++) {
			response.getWriter().append("<div>" + dan + " * " + i + " = " + (dan * i) + "</div>");
		}
	}
}
