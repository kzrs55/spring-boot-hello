<%--
  Created by IntelliJ IDEA.
  User: ${USER}
  Date: ${DATE}
  Time: ${TIME}
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form method="get" action="/user/login">
        用户名:<input type="text" name="name"/><br/>
        密码:<input type="text" name="password"/>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
