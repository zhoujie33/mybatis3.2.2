<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/15
  Time: 16:07
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
    <title>right</title>
</head>
<body>
<h3>请在左侧选择服务</h3>
</body>
</html>