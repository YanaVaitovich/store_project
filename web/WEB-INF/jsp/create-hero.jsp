<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Hero Form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/create-hero" method="post">
    <p>Псевдоним:</p>
    <input type="text" name="name"><br>
    <p>Реальное имя:</p>
    <input type="text" name="identity"><br>
    <p>Возраст:</p>
    <input type="number" name="age"><br><br>
    <input type="radio" name="gender" value="MALE" checked>Мужчина
    <input type="radio" name="gender" value="FEMALE">Женщина
    <br>
    <br>
    <select name="abilityId">
        <c:forEach var="ability" items="${requestScope.abilities}">
            <option value="${ability.id}">${ability.name}</option>
        </c:forEach>
    </select>
    <br>
    <br>
    <button type="submit">Create Hero</button>
</form>
</body>
</html>
