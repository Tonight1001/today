<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html>
	<head>
		<jsp:include page="template/meta.jsp"></jsp:include>
		<title>test页面</title>
	</head>
	<body>
		<form action="${basePath}add" method="post">
			内容：<input name="text" type="text"/><br>
			<input type="submit" value="提交"/>
		</form>
		${info}
		<br><br>
		<form action="${basePath}search" method="post">
			内容：<input name="text" type="text"/>
			<input type="submit" value="查询"/>
		</form>
		
		<table>
			<tr>
				<th>ID</th>
				<th>内容</th>
				<th>时间</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${tvList}" var="tv">
				<tr>
					<td>${tv.testId }</td>
					<td>${tv.text }</td>
					<td>${tv.createTime }</td>
					<td>
						<a href="${basePath}del?id=${tv.testId}">删除</a>
						<a href="${basePath}get?id=${tv.testId}">修改</a>
					</td>
				</tr>
			</c:forEach>
			
		</table>
		${result }
		
		<label>修改</label>
		<form action="${basePath}update" method="post">
			<input type="hidden" name="testId" value="${tv.testId }"/>
			内容：<input name="text" type="text" value="${tv.text }"/><br>
			<input type="submit" value="提交"/>
		</form>
		
		${updateInfo }
	</body>
</html>