<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>菜鸟教程(runoob.com)</title>
</head>
<body>
${s}
${message}
<br>


<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>名字</th><th>年龄龄</th><th>价格龄</th><th>日期龄</th>
    </tr>
    <tr>
        <td>${stuList.stuname}</td>
        <td>${stuList.age}</td>
        <td>${stuList.realprice}</td>
        <td>${stuList.createtime}</td>
        <td></td>
    </tr>
</table>
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Header Name</th><th>Header Value(s)</th>
    </tr>


    <%
        Enumeration headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String paramName = (String)headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>\n");
            String paramValue = request.getHeader(paramName);
            out.println("<td> " + paramValue + "</td></tr>\n");
        }

    %>

</table>

<%--${list}.code <br/>--%>
<%--${list}.name <br/>--%>
<%--${list}.continent <br/>--%>
<%--${list}.region <br/>--%>
<%--${list}.surfacearea <br/>--%>

</body>
</html>