<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-9-25-0025
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<table>
    <form action="/registy.do" method="post">
        <tr>
            <td>昵称:</td>
            <td><input type="text" name="nickName"/></td>
        </tr>
        <tr>
            <td>账号:</td>
            <td><input type="text" name="userNo"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>手机号:</td>
            <td><input type="text" name="phoneNumber"/></td>
        </tr>
        <tr>
            <td>邮箱号:</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr><td colspan="2"><input type="submit" value="提交"/></td></tr>
    </form>
</table>
</body>
</html>
