package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet6 extends HttpServlet{	// 상속받아 재정의
	
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String title = request.getParameter("title"); 
			String content = request.getParameter("content");
			
			request.setAttribute("title", title);	// 키와 값
			request.setAttribute("content", content);	//Jsp는 메소드가 아니라 매계값을 전달하기 위해 키와 내용
			
			RequestDispatcher rd = 
					request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
			
			rd.forward(request, response);
			
		}
	
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				request.setCharacterEncoding("UTF-8");	//꺠지지 않도록
		
				
				String title = request.getParameter("title"); 
				String content = request.getParameter("content");
				
				request.setAttribute("title", title);	// 키와 값
				request.setAttribute("content", content);	//Jsp는 메소드가 아니라 매계값을 전달하기 위해 키와 내용
				
				RequestDispatcher rd = 
						request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
				
				rd.forward(request, response);
		}
	
}
