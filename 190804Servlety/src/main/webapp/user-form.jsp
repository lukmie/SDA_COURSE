<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>System zarzadzania uzytkownikami</title>
</head>
<body>
<h1>Manager</h1>
<h2><a href="new">Dodaj nowego uzytkownika</a> </h2>
<h2><a href="/">Lista uzytkownikow</a> </h2>

<div>
    <c:if test="${user != null}">
    <form action="update" method="post">
        <c:if test="${user != null}">
        <form action="insert" method="post">
            </c:if>


        </form>


        </c:if>
</div>


</body>
</html>
