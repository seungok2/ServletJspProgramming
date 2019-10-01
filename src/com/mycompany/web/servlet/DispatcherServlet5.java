package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet5 extends HttpServlet{	// 상속받아 재정의
	
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name"); 	//web client 고유의 객체만 사용
		String age = request.getParameter("age");
		int intAge = Integer.parseInt(age);
		
		 request.setAttribute("name", name);	// 키와 값
		 request.setAttribute("age", intAge);	// jsp에 저장해서 넘겨줌
		/*
		ServletContext servletContext = request.getServletContext();	//application(ServletContext)
		servletContext.setAttribute("name", name);
		servletContext.setAttribute("age", age);
		*/
		RequestDispatcher rd = 	//jsp의 name과 age를 가져오는 경로
				request.getRequestDispatcher("/WEB-INF/view/dispatcher5.jsp");
		rd.forward(request, response);	
		
	}
	
	

	
}
