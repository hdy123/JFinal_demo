<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加员工界面</title>
</head>
<body>
   <form action="/user/addUser" method="post">
      姓名：<input name="user.username" type="text"><br>
      性别：<input name="user.sex" type="radio" value="0">男 
         <input name="user.sex" type="radio" value="1">女<br>
   出生年月：<input name="user.birthday" type="text"><br>  
   电子邮件:<input name="user.email" type="text"><br>   
   <input name="提交" type="submit"> 
   </form>
</body>
</html>