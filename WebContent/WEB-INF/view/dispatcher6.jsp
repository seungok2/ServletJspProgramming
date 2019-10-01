<%@ page language="java" contentType="text/html; charset=UTF-8"%>
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
		title : <%=request.getAttribute("title") %> <br/>
		content : <%=request.getAttribute("content") %> <br/> <br/>
		
		<%-- how2(Expression Language --%>
		<%-- Arrribute로 저장해야 쓸 수 있음 --%>
		title: ${title} <br/>
		content: ${content} <br/>
		
	</body>
</html>