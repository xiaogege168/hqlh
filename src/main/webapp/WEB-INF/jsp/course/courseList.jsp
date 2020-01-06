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
        <th>课程ID</th><th>课长</th><th>价格</th><th>内容</th>
        <th>学生人数</th>
    </tr>
    <c:forEach var="course" items="${courseList}">
    <tr>
        <td>${course.courseID}</td>
        <td>${course.courseTime}</td>
        <td>${course.coursePrice}</td>
        <td>${course.courseContent}</td>
        <td>${course.skStudents.size()}</td>
    </tr>
    </c:forEach>
</table>
<table width="100%" border="1" align="center">
    <tr bgcolor="#949494">
        <th>Header Name</th><th>Header Value(s)</th>
    </tr>


</table>

</body>
</html>