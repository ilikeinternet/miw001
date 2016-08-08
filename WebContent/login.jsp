<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
	<title>MIW</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css"/>
</head>
<body>
	<h1>${errorMsg}     LOGIN</h1>
	<div class="wrapper">
		<form action="login" method="post">
		<div class="loginBox">
			<div class="loginBoxCenter">
				<p><label for="uid">用户名：</label></p>
				<p><input type="text" id="uid" name="uid" class="loginInput" autofocus="autofocus" required="required" autocomplete="off" placeholder="请输入用户名/ID" value="" /></p>
				<p><label for="password">密码：</label><a class="forgetLink" href="#">忘记密码?</a></p>
				<p><input type="password" id="password" name="password" class="loginInput" required="required" placeholder="请输入密码" value="" /></p>
			</div>
			<div class="loginBoxButtons">
				<input id="remember" type="checkbox" name="remember" />
				<label for="remember">记住登录状态</label>
				<button class="loginBtn">登录</button>
			</div>
		</div>
		</form>
	</div>
</body>
</html>