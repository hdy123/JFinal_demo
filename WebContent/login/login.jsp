<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登入界面</title>
</head>
<body>
 <form action="/user/findUser" method="get">
    username:<input name="username" type="text">
    password:<input name="password" type="password">
    <input value="提交" type="submit">
 </form>
 
</body>
</html>