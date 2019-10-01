<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
		<meta charset = "UTF-8">
		<title>Insert title here</title>
	
		<style type = "text/css">
			body, html{
				height: 100%
				margin: 0;
			}
			
			#wrapper{
				width:100%;
				height:80vh;
				/* position:fixed;
				top:0px;
				right:0px;
				bottom:0px;
				left:0px; */
			}
			
			
			#header{
				border-bottom:1px solid black;
				margin-bottom:10px;
			}
			
		
			#content{
				flex-grow:1;
				display:flex;
				min-height:0;
			}
			
			#sideBar{
				height : 85vh;
				width: 300px;
				background-color: lightblue;
				padding-right: 10px;
				border-right: 1px solid black;
				overflow-y: scroll;
			}
			
			#center{
				height : 85vh;
				flex-grow:1;
				padding:10px;
			}
			
			#center iframe{
				margin-top:0px;
				width:100%;
				height:100%;
				
			}
			
			
			#footer {
				border-top: 1px solid black;
				margin-top: 10px;
			}
			
			
			
		</style>
		
	</head>


	<body>
	
		<div id="warpper">
			<div id="header">
				<h3>ServeltJspProgramming</h3>
			</div>
			
			<div id = "content">
				<div id="sideBar">
				<ul>
					<li><a href="dispatcher1" target="iframe">서블릿 작성과 URL 매핑</a></li>
					<li><a href="dispatcher2" target="iframe">서블릿 초기화</a></li>
					<li><a href="dispatcher3?name=hongkildong&age=25&tel=0101234567" target="iframe">GET 방식으로 요청</a></li>
					<li>
						<form action="dispatcher3" method="get" target=iframe>
							<input type = "text" name="name" value="honggildong"/>
							<input type = "number" name="age" value="25"/>
							<input type = "tel" name="tel" value="0101234567"/>
							<input type = "submit" value = "Get 방식으로 요청"/>
						</form>
					</li>
					<li>
						<form action="dispatcher3" method="post" target=iframe>
							<input type = "text" name="name" value="honggildong"/>
							<input type = "number" name="age" value="25"/>
							<input type = "tel" name="tel" value="0101234567"/>
							<input type = "submit" value = "POST 방식으로 요청"/>
						</form>
					</li>
					
					<li><a href="dispatcher4" target="iframe" src="http://tomcat.apache.org">응답 보내기</a></li>
					<li><a href="dispatcher5?name=hongkildong&age=25" target="iframe" src="http://tomcat.apache.org">요청 파라미터 받기</a></li>	<!--  파마미터 두개를 넘김 get DispatcherServlet5요청 -->
					<li>
						<form action="dispatcher5" method="get" target=iframe>
							<input type = "text" name="name" value="honggildong"/>
							<input type = "number" name="age" value="25"/>
							<input type = "submit" value = "Get 방식으로 요청"/>
						</form>
					</li>	
					<li>
						<form action="dispatcher5" method="post" target=iframe>
							<input type = "text" name="name" value="honggildong"/>
							<input type = "number" name="age" value="25"/>
							<input type = "submit" value = "POST 방식으로 요청"/>
						</form>
					</li>
					
					<li>
						<p>요청 파라미터 전달</p>
						<form action="dispatcher6" method="get" target=iframe>
							<input type = "text" name="title"/>
							<input type = "text" name="content">
							<input type = "submit" value = "Get 방식으로 요청"/>
						</form>
					</li>	
					<li>
						
						<form action="dispatcher6" method="post" target=iframe>
							<input type = "text" name="title"/>
							<input type = "text" name="content">
							<input type = "submit" value = "POST 방식으로 요청"/>
						</form>
					</li>
					
					<li>
						<p>객체 사용 법칙</p>
						<a href = "dispatcher7" target = "iframe"> 객체 저장하기</a> 
						<a href = "dispatcher8" target = "iframe"> 객체 가져오기</a>
					</li>
					
				</ul>
				</div>
				<div id="center">
					<iframe name="iframe" src = "http://tomcat.apache.org"></iframe>
			</div>
			</div>
			<div id = "footer"></div>
		

		<div id = "footer">2019. IoT. S.S.O </div>
		</div>
	</body>

</html>