<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <jsp:include page="../template/meta.jsp"></jsp:include>
  <script type="text/javascript" src="${basePath}static/js/system/moduleList.js"></script>
  <title>NIIT教务管理系统</title>
</head>
<body class="hold-transition skin-blue fixed sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
  <jsp:include page="../template/header.jsp"></jsp:include>
  <!-- Left side column. contains the sidebar -->
  <jsp:include page="../template/aside.jsp"></jsp:include>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
                模块管理
        <small>此功能实现对系统模块的添加，删除，修改，查询和查看功能</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li class="active">模块管理</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
    	<div class="row">
    		<div class="col-md-12">
    			<button id="btn-add" type="button" class="btn btn-primary">增加</button>
    		</div>
    	</div>
		<table id="moduleTable" class="table table-striped table-hover">
	        <thead>
	            <tr>
	                <th>模块ID</th>
	                <th>模块名称</th>
	                <th>操作</th>
	                
	            </tr>
	        </thead>
	    </table>
    </section>
    <!-- /.content -->
  </div>
  <!-- <form action="system/module" method="post">
  	<input type="hidden" name="_method" value="delete"/>
  </form> -->
  <jsp:include page="../template/footer.jsp"></jsp:include>
</div>
</html>
