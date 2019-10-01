package com.mycompany.web.contextlistener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener{	//Listener 사용
	
	@Override	// deploy
	public void contextInitialized(ServletContextEvent sce) {	//context가 식별
		System.out.println("contextInitialized run...");		
		ServletContext application= sce.getServletContext();
		String contextConfigLocation = application.getInitParameter("contextConfigLocation");
		System.out.println(contextConfigLocation + 
				"을 읽고 Spring WebApplicationContext를 구합니다");
	}
	
	@Override	// undeploy
	public void contextDestroyed(ServletContextEvent sce) {	// 종료할떄 실행
		System.out.println("ServletContext run...");
		
	
	}
	
	
	
	
}
