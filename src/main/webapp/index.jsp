<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html;charset=UTF-8"
         isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <base href="<%= basePath %>"/>
    <title>Bootstrap的HTML标准模板</title>
    <!-- Bootstrap 样式文件-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--你自己的样式文件 -->
    <link href="css/your-style.css" rel="stylesheet">
    <!-- 以下两个插件用于在IE8以及以下版本浏览器支持HTML5元素和媒体查询，如果不需要用可以移除 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h1>欢迎来到点餐系统，请先<a href="tologin.action">登陆</a><a href="toreg.action" style="margin: 20px 20px 20px 20px">注册</a></h1>

<!-- 如果要使用Bootstrap的js插件，必须先调入jQuery -->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
<script src="bootstrap4.0/js/bootstrap.min.js"></script>

</body>
</html>