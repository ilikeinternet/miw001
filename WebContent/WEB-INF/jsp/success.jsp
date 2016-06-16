<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SUCCESS</title>
</head>
<body>
  <h1>SUCCESS</h1>
  <table width="700" align="center" border="1">
    <tr>
      <td>${user.uid }</td>
      <td><a href="${user.id }">${user.uname }</a></td>
      <td>${user.realname }</td><td>${user.password }</td><td>${user.email }</td>
    </tr>
  </table>
</body>
</html>