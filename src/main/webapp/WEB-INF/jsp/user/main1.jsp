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
    <base href="<%= basePath %>"/>
    <title>main</title>
</head>
<body>

<table>
    <tr>
        <td colspan="3">
            <div style="float: right">当前用户:${user.uname}&nbsp;&nbsp;&nbsp;&nbsp;<a href="doexit.action">注销</a>
            <img src="${user.pic}">
            </div>
        </td>
    </tr>
    <tr>
        <td style="vertical-align: top">
            <div style="float: left">
                <ul>
                    <li><a href="doUM.action" target="right">用户管理</a></li>
                    <li><a href="doOM.action" target="right">点餐管理</a></li>
                    <li><a href="doReply.action" target="right">评论回复</a></li>
                </ul>
            </div>
        </td>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
        <td >
            <div style="float: left;width: 1200px;height: 700px">
                <iframe src="doRight.action" name="right" width="1200px"height="700px"></iframe>
            </div>
        </td>
    </tr>
</table>


</body>
</html>