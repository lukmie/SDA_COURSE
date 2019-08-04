<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--http://localhost:8080/exercises.ServletExe6?przyczyna=kuba--%>
<p>Pierwsza strona JSP</p>
    <jsp:include page="/zadania/menu.jsp">
        <jsp:param name="nameUser" value="${param.user}"/>
    </jsp:include>

    <%
        request.setAttribute("przyczyna", "SDA przyczyna bledu");
        application.setAttribute("przyczyna2", "SDA");
    %>

    <jsp:forward page="/zadania/blad.jsp">
        <jsp:param name="przyczyna" value="${requestScope.przyczyna}"/>
        <jsp:param name="przyczyna2" value="${applicationScope.przyczyna}"/>
    </jsp:forward>
</body>
</html>
