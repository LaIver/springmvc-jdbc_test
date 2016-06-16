<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2016/6/15
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Allen's blog</title>
</head>
<body>
    <h1>Welcome to Allen's blog</h1>
    <form action="login" method="post">
        UserName:   <input type="text" name="UserName" /><br/><br />
        Password:   <input type="password" name="Password" /><br/>
        <input type="submit" value="submit">
        <a href="register">注册</a>
    </form>

</body>
</html>
