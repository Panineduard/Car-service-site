<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: volkswagen1
  Date: 29.01.2017
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:url value="/j_spring_security_check" var="loginUrl" />
<form class="form" action="${loginUrl}"  method="post">

  <fieldset class="register-group">

    <label>
      <input type="text" placeholder="Номер диллера" name="j_username">
    </label>

    <label>
      <input type="password" placeholder="Пароль" name="j_password">
    </label>

  </fieldset>


  <button class="btn-default" type="submit">Войти</button>

</form
</body>
</html>
