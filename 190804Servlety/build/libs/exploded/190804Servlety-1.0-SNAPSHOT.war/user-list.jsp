<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>System zarzadzania uzytkownikami</title>
</head>
<body>
    <h1>Manager</h1>
    <h2><a href="/new">Dodaj nowego uzytkownika</a> </h2>
    <h2><a href="/l">Lista uzytkownikow</a> </h2>
    <div>

        <table border="1" cellpadding="5">
            <caption><h2>Lista uzytkownikow</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Country</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td><c:out value="${user.id}"/></td>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.email}"/></td>
                    <td><c:out value="${user.country}"/></td>
                    <td>
                        <a href="edit?id=<c:out value='${user.id}'/>">Edytuj</a>
                        <a href="delete?id=<c:out value='${user.id}'/>">Usun</a>
                    </td>

                </tr>
            </c:forEach>
        </table>


    </div>


</body>
</html>
