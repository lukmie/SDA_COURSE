<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--http://localhost:8080/exercises.ServletExe5?user=kuba--%>
    <p>Menu</p>
    <a href="zad3.jsp"> Strona zad3</a>
    <p>Witaj, ${param.user}</p>
    <p>${param.nameUser}, jak sie masz?</p>
</body>
</html>
