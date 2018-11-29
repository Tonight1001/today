<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	request.setAttribute("basePath", basePath);
%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${basePath}static/css/bootstrap.min.css">
<link rel="stylesheet" href="${basePath}static/css/leo-skin-blue.css">
<link rel="stylesheet" href="${basePath}static/adminLTE/dist/css/font-awesome.min.css">
<link rel="stylesheet" href="${basePath}static/adminLTE/dist/css/ionicons.min.css">
<link rel="stylesheet" href="${basePath}static/adminLTE/dist/css/skins/skin-blue.min.css">
<link rel="stylesheet" href="${basePath}static/adminLTE/dist/css/AdminLTE.min.css">
<link rel="stylesheet" href="${basePath}static/adminLTE/plugins/datatables/dataTables.bootstrap.css">
<link rel="stylesheet" href="${basePath}static/adminLTE/plugins/jquery-confirm/css/jquery-confirm.css">



<script src="${basePath}static/js/jquery-3.3.1.min.js"></script>
<script src="${basePath}static/js/bootstrap.min.js"></script>

<!-- SlimScroll -->
<script src="${basePath}static/adminLTE/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${basePath}static/adminLTE/plugins/fastclick/fastclick.js"></script>
<!-- dataTables -->
<script src="${basePath}static/adminLTE/plugins/datatables/jquery.dataTables.js"></script>
<!-- jqueryConfirm -->
<script src="${basePath}static/adminLTE/plugins/jquery-confirm/js/jquery-confirm.js"></script>

<script src="${basePath}static/adminLTE/dist/js/app.min.js"></script>
<script type="text/javascript">
	var basePath = "${basePath}";
</script>

