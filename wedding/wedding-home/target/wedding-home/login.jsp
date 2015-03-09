<%--
  Created by IntelliJ IDEA.
  User: tank
  Date: 14-9-15
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script>
        function loginPwd(){
            alert("00000");
        }
    </script>
</head>
<body>
    <form action="user/login.do">
    用户名：<input type="text" id="accountName" name="accountName"/>
    密码：<input type="text" id="pwd" name="pwd"/>
    <input type="submit" value="login" onclick="javascript:loginPwd();"/>
    </form>
</body>
</html>
