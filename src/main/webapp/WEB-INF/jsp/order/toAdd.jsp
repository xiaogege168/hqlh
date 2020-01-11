<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/5 0005
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加學生</title>
</head>
<body>

<form action="/stu/add">
    <table border="1px solid">
        <th>名字</th><th>密碼</th><th>年齡</th><th>性別</th><th>課程</th>
        <th>家長電話</th><th>收款</th><th>分店</th><th>備註</th>
        <tr>
            <td><input type="text" name="stuName"></td>
            <td><input type="password" name="stuPassword"></td>
            <td><input type="text" name="age"></td>
            <td><input type="radio" name="gender" value="男">男
                <input type="radio" name="gender" value="女">女</td>
            <td><input type="text" name="courseId"></td>
            <td><input type="text" name="parentNum"></td>
            <td><input type="text" name="realPrice"></td>
            <td><select name="shopId">
                <option value="1">杏坛店</option>
                <option value="2">龙江店</option>
                <option value="3">天佑城店</option>
                <option value="4">西樵店</option>
                <option value="5">风度广场店</option>
                <option value="6">小塘店</option>
                <option value="7">九江店</option>
                <option value="8">丹灶店</option> 

            </select>
            <td><input type="text" name="others"></td>

        </tr>
    </table>
    <input type="submit" value="確認添加"/>
</form>

</body>
</html>
