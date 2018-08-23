<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/15
  Time: 9:42
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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <base href="<%= basePath %>"/>
    <title>用户管理</title>
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
<a href="exportUser.action" >下载所有用户信息到excel</a>
<span style="margin-left: 20px">修改结果显示：${msg}</span>
<form action="deleteAll.action" method="post">
    <table class="table table-bordered table-hover ">
        <thead>
        <tr>
            <td>序号</td>
            <td>选择</td>
            <td>用户名</td>
            <td colspan="2" align="center">操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="u" varStatus="v">
            <tr>
                <td>${v.index+1}</td>
                <td><input type="checkbox" name="uid" value="${u.uid}"></td>
                <td>${u.uname}</td>
                <td><a href="dotoupdate.action?uid=${u.uid}">修改</a></td>
                <td><a href="dodelete.action?uid=${u.uid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
        <tr>

            <td colspan="5"align="center">
                <input type="checkbox"id="SA" value="">全选
                <button type="submit" class="btn btn-primary"id="sbt" style="margin-left: 20px">批量删除</button>
            </td>
        </tr>

    </table>
    <%--<c:forEach items="${list}" var="u" varStatus="v">
        <div>
            <input type="checkbox" name="uid" value="${u.uid}">
            ${v.index+1}&nbsp;&nbsp;&nbsp;${u.uname}
            <a href="dotoupdate.action?uid=${u.uid}">修改</a>
            <a href="dodelete.action?uid=${u.uid}">删除</a>
        </div>
    </c:forEach>
    <input type="checkbox"id="SA" value="">全选
    <input type="submit" id="sbt" value="批量删除">--%>
</form>
<script src="js/jquery-1.8.3.min.js"></script>
<script>
    $(function () {
        $("#SA").click(function () {
            var a=$("#SA").is(":checked");
            $("input[type=checkbox]").attr("checked",a);
        });
        $("#sbt").click(function () {
            var b=$("input[type=checkbox]:checked").length;
            if(b==0){
                alert("批量删除请至少选中一个！")
                return false;
            }else {
                return true;
            }
        })
    })
</script>
<!-- 如果要使用Bootstrap的js插件，必须先调入jQuery -->
<script src="js/jquery-3.3.1.min.js"></script>
<!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
<script src="bootstrap4.0/js/bootstrap.min.js"></script>
<script>
    $(function () {
        $("#SA").click(function () {
            var a=$("#SA").is(":checked");
            $("input[type=checkbox]").attr("checked",a);
        });
        $("#sbt").click(function () {
            var b=$("input[type=checkbox]:checked").length;
            if(b==0){
                alert("批量删除请至少选中一个！")
                return false;
            }else {
                return true;
            }
        })
    })
</script>
</body>
</html>