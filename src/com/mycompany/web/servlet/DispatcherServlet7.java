package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.web.dto.Counter;

public class DispatcherServlet7 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// application 범위
		ServletContext sc = request.getServletContext();
		if(sc.getAttribute("applicationCounter") == null) 	{	//이미 있을 경우 엎어쓰지 않도록
				Counter applicationCounter = new Counter();
				sc.setAttribute("applicationCounter", applicationCounter);
		}
		
		// session 범위
		HttpSession session = request.getSession();
		if(sc.getAttribute("sessionCounter") == null) {	//이미 있을 경우 엎어쓰지 않도록
		Counter sessionCounter = new Counter();
		session.setAttribute("sessionCounter", sessionCounter);
		}
		// request 범위에 객체를 저장
		
		
		if(sc.getAttribute("requestCounter") == null) {	//이미 있을 경우 엎어쓰지 않도록
			Counter requestCounter = new Counter();
			request.setAttribute("requestCounter", requestCounter);
		}
		
		//forward
		RequestDispatcher rd = request.getRequestDispatcher("/dispatcher8");
		rd.forward(request, response);
		
	}

}
