package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet3 extends HttpServlet{
	
	
	/*
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Dispatcher3 service run..");	// 객체가 호출 될때마다 실행
	}
	*/
	
	@Override	// doGet방법으로 시작행에 값을 넣어 통신
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet service run..");
	}
	
	@Override	// body에 값을 넣어 통신
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost service run..");
	}
	
}
