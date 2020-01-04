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
        <th>名字</th><th>年龄龄</th><th>价格</th><th>日期</th>
        <th>店址</th><th>月收入</th><th>店长</th><th>店ID</th>
    </tr>
    <c:forEach var="stu" items="${stuList}">
    <tr>
        <td>${stu.stuName}</td>
        <td>${stu.age}</td>
        <td>${stu.realPrice}</td>
        <td>${stu.createTime}</td>
        <td>${stu.skShop.address}</td>
        <td>${stu.skShop.monthIncome}</td>
        <td>${stu.skShop.leaderId}</td>
        <td>${stu.skShop.shopId}</td>
    </tr>
    </c:forEach>
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