<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <jsp:include page="template/meta.jsp"></jsp:include>
  <title>用户登录</title>
  <script type="text/javascript">
	$(function(){
		$(window).resize(function(){
			var height = $(window).height();
			var loginHeight = $(".login-box").height();
			$(".login-box").css("margin-top",(height-loginHeight)/2);
		});
		$(window).resize();
	});
  </script>
  
</head>
<body class="hold-transition login-page">
	<div class="login-box">
	  <div class="login-logo">
	    <a href="../../index2.html"><b>NIIT</b>教务管理系统</a>
	  </div>
	  <!-- /.login-logo -->
	  <div class="login-box-body">
	    <p class="login-box-msg">Sign in to start your session</p>
	
	    <form action="${basePath}login" method="post">
	      <div class="form-group has-feedback">
	        <input type="text" name="account" class="form-control" placeholder="账号">
	        <span class="glyphicon glyphicon-user form-control-feedback"></span>
	      </div>
	      <div class="form-group has-feedback">
	        <input type="password" name="password" class="form-control" placeholder="Password">
	        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
	      </div>
	      <div class="row">
	        <div class="col-xs-8">
	          
	        </div>
	        <!-- /.col -->
	        <div class="col-xs-4">
	          <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
	        </div>
	        <!-- /.col -->
	      </div>
	    </form>
	   </div>
	</div>
</body>
</html>
