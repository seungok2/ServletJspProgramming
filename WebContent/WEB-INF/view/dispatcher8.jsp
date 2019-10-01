<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.mycompany.web.dto.Counter" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<%-- <h4>dispatcher5.jsp</h4> jsp의 주석	 --%><!-- responed -->
		
		<!--  How1 - 클라이언트로 감-->	
		<%-- How1 --%>
		<%Counter applicationCounter =(Counter) application.getAttribute("applicationCounter"); %> 
		applicationCounter : <%=applicationCounter.getValue() %><br/>
		<%Counter sessionCounter =(Counter) session.getAttribute("sessionCounter"); %>
		sessionCounter :  <%=sessionCounter.getValue() %><br/>
		<%Counter requestCounter =(Counter) request.getAttribute("requestCounter"); %> 
		requestCounter : <%=requestCounter.getValue() %><br/>
		
		<%-- how2(Expression Language) --%>
		<%-- Arrribute로 저장해야 쓸 수 있음 --%>
		
		applicationCounter :  ${applicationCounter.value} <br/>
		sessionCounter : ${sessionCounter.value} <br/>
		requestCounter : ${requestCounter.value} <br/>
		
	</body>
</html>