<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import= "lesson4.Employee" %>
<%Employee emp = new Employee("0001", "湊　雄輔"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>プロフィール</title>
</head>
<body>
	<p>IDは<%= emp.getId()%>、名前は<%= emp.getName()%>です。</p>
</body>
</html>