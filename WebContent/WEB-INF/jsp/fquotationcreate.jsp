<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新建期货交易信息</title>
</head>
<body>
  <h1>新建期货交易信息</h1> ${user.uname}
  <form action="create" method="post" > 
    <table width="1500" align="center" border="1">
    	<tr>
        <td>交易日期<input type="date" name="marketdate"  required="true"/></td>
      </tr> 
      <tr>
        <td>期货代码<input type="text" name="fcode"  required="true"/>   期货年月<input type="text" name="fyymm" /></td>
      </tr>
      <tr>
        <td>开盘价<input type="number" name="open" /></td>
      </tr>
      <tr>
        <td>最高价<input type="number" name="max" /></td>
      </tr>
      <tr>
        <td>最低价<input type="number" name="min" /></td>
      </tr>
      <tr>
        <td>收盘价<input type="number" name="close" /></td>
      </tr>
      <tr>
        <td>涨跌<input type="number" name="spread" /></td>
      </tr>
      <tr>
        <td>成交量<input type="number" name="volume" /></td>
      </tr>
      <tr>
        <td>持仓量<input type="number" name="interest" /></td>
      </tr>
      <tr>
        <td>备注<input type="text" name="remark" /></td>
      </tr>
      <tr>
        <td><input type="submit" name="提交" /></td>
      </tr>
    </table>
  </form>
</body>
</html>