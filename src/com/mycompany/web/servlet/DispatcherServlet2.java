package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet2 extends HttpServlet{
	
	@Override	// 초기화 할때 객체 생성
	public void init(ServletConfig config) throws ServletException {
		String contextConfigLocation = config.getInitParameter("contextConfigLocation");
		System.out.println("contextConfigLocation: " + contextConfigLocation);	// Parameter이름은 여기서 사용된 이름이 xml에 사용되어야 함
		System.out.println("네 알겠습니다. 나는" + 
						contextConfigLocation + " 이 경로에 있는 파일의 경로를 읽고 적용을 하겠습니다.");
	}
	
	@Override	// 최초 요청시 객체 생성
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet2 service run...");
		
	
	}

}
