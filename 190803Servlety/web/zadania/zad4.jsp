<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--http://localhost:8080/exercises.ServletExe5?user=kuba--%>
    <p>Pierwsza strona JSP</p>
    <jsp:include page="/zadania/menu.jsp">
        <jsp:param name="nameUser" value="${param.user}"/>
    </jsp:include>

</body>
</html>
