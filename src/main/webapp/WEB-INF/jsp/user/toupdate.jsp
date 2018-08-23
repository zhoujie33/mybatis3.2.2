<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/15
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html;charset=UTF-8"
         isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <base href="<%= basePath %>"/>
    <title>修改用户密码</title>
</head>
<body>
<form action="doupdate.action" method="post">
    <input type="hidden" name="uid" value="${ybUser.uid}">
    <input type="hidden" name="upwd" value="${ybUser.upwd}">
    <p>用户：<input name="uname" id="n" value="${ybUser.uname}" readonly/></p>
    <p>原密码：<input name="oldupwd" id="op"></p>
    <p>新密码：<input name="newupwd" id="np"></p>
    <p>确认密码：<input name="reupwd" id="rp"/></p>
    <p><input type="submit" value="确认修改"/></p>
</form>
</body>
</html>