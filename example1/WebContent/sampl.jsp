<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.Date" %>
<%@ page import= "java.text.SimpleDateFormat" %>
<%
	//運勢をランダムで決定
	String[] luckArray = {"超スッキリ", "スッキリ", "最悪"};
	String luck = luckArray[(int)(Math.random() * 3)];

	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日HH:mm");
	String today = sdf.format(date);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
	<p><%= today %>の運勢は「<%= luck %>」です。</p>
</body>
</html>