<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2018/8/22
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <base href="<%= basePath %>"/>
  <title>主页面</title>
  <!-- Bootstrap 样式文件-->
  <link href="bootstrap4.0/css/bootstrap.min.css" rel="stylesheet">
  <!--你自己的样式文件 -->
  <%--<link href="css/your-style.css" rel="stylesheet">--%>
  <!-- 以下两个插件用于在IE8以及以下版本浏览器支持HTML5元素和媒体查询，如果不需要用可以移除 -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body>
<div class="container">
  <div style="padding-left:950px">当前用户:${user.uname}&nbsp;&nbsp;&nbsp;&nbsp;<a href="doexit.action">注销</a></div>
  <div class="row">

    <div class="col-md-2">
      <ul>
        <li><a href="doUM.action" target="right">用户管理</a></li>
        <li><a href="doOM.action" target="right">点餐管理</a></li>
        <li><a href="doReply.action" target="right">评论回复</a></li>
      </ul>
    </div>
    <div class="col-md-10">
      <iframe src="doRight.action" name="right" width="900px"height="700px"></iframe>
  </div>
</div>
<!-- 如果要使用Bootstrap的js插件，必须先调入jQuery -->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
<script src="bootstrap4.0/js/bootstrap.min.js"></script>
</body>
</html>
