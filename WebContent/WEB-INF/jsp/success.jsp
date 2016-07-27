<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MAIN</title>
</head>
<body>
  <h1>MAIN</h1>
  <table width="700" align="center" border="1">
  	<tr>
      <th>USER ID</th><th>USER NAME</th><th>REALNAME</th><th>GENDER</th><th>POINTS</th><th>ACTIVE</th><th>REMARK</th>
    <tr>
      <td>${user.uid }</td>
      <td><a href="${user.uid }">${user.uname }</a></td><td>${user.realname }</td><td>${user.gender }</td><td>${user.points }</td><td>${user.active }</td><td>${user.remark }</td>
    </tr>
  </table>
</body>
</html>