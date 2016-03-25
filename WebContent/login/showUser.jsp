<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示用户</title>
</head>
<body>
  <a href="/login/addUser.jsp">添加用户</a>
  <table>
    <tr>
      <th> 姓名 </th><th>性别</th><th>出生年月</th><th>电子邮件</th><th>操作</th>
    </tr>
	<c:forEach items="${user}" var="user" varStatus="vs">
	     <tr>       
		    <td> ${user.username}</td>
		    <c:choose>
		      <c:when test="${user.sex == 0 }"> 
		        <td>男</td>
		      </c:when>
		      <c:otherwise>
		        <td>女</td>
		      </c:otherwise>
		    </c:choose>
		     <td> ${user.birthday}</td> 
		     <td>${user.email}</td>  
		     <td><a href="http://localhost/user/delUser?id=${user.id}">删除</a></td>
		 </tr>
	</c:forEach>
   </table>
   
</body>
</html>