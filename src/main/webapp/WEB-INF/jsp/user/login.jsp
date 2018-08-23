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
  <title>Bootstrap的HTML标准模板</title>
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
  <div class="row">
    <div class="col-md-4">

    </div>
    <div class="col-md-4">
        <%--<form action="dologin.action" method="post">
            <p>用户：<input name="uname" id="un"/><span id="msg" style="color: red"></span></p>
            <p>密码：<input name="upwd" id="up"/></p>
            <p><input type="submit" value="登录"/></p>
        </form>--%>
<%----%><span id="msg" style="color: red"></span>
        <form action="login.action" method="post">
            <div class="form-group">
                <label for="user-name-label">用户名</label>
                <input name="uname"type="text" class="form-control" id="user-name-label"  placeholder="请输入用户名">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input name="upwd"type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入密码">
            </div>
            <button type="submit" class="btn btn-primary">登陆</button>
        </form>
    </div>
    <div class="col-md-4">

    </div>
  </div>
</div>
<!-- 如果要使用Bootstrap的js插件，必须先调入jQuery -->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
<script src="bootstrap4.0/js/bootstrap.min.js"></script>
</body>
</html>
