<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
	<head>
		<jsp:include page="template/meta.jsp"></jsp:include>
		<title>登录页面</title>
		<script type="text/javascript">
			$(function(){
				$(window).resize(function(){
					var height = $(window).height();
					$("#contentWrapper").css("height",height-50);
				});
				$(window).resize();
			});
		</script>
	</head>
	<body class="leo-skin-blue">
		<nav class="navbar">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">
						<i class="glyphicon glyphicon-home"></i> NIIT
					</a>
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#mynavbar" aria-expanded="false">
						<i class="glyphicon glyphicon-menu-hamburger"></i>
					</button>
				</div>
				
				<div class="collapse navbar-collapse" id="mynavbar">
					<ul class="nav navbar-nav">
						<li><a href="#">Link</a></li>
						<li><a href="#">Link</a></li>
						<li><a href="#">Link</a></li>
						<li><a href="#">Link</a></li>
					</ul>
					
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">登录</a></li>
						<li><a href="#">注册</a></li>
						<li class="dropdown">
				          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">客户端 <span class="caret"></span></a>
				          <ul class="dropdown-menu">
				          	  <li>
				          	  	<img class="img-responsive center-block" src="${basePath }static/images/man.png"/>
				          	  </li>
				          </ul>
				        </li>
					</ul>
				</div>
			</div>
		</nav>
		
		<div id="contentWrapper" class="content-wrapper">
			sad<br><br><br><br><br>
		</div>
	</body>
</html>