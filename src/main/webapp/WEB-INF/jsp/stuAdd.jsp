<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/3 0003
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<table>
    <form action="add" method="post">
        <tr>
            <td>姓名</td>
            <td><input type="text" name="stuname"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="radio" value="男" name="gender"></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" name="parentnum"></td>
        </tr>
        <tr>
            <td>收款</td>
            <td><input type="text" name="realprice"></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input type="text" name="others"></td>
        </tr>
        <tr>
            <td>报名时期</td>
            <td><input type="text" name="createtime"></td>
        </tr>

        <input type="submit" value="提交">
    </form>


</table>

</body>
</html>
