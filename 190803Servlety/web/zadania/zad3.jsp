<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String user = "Kuba"; %>
<%--polaczenie z ServletExe4--%>
<%--http://localhost:8080/zad3.jsp?user=Kuba--%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%="Witajcie wszyscy" %>
    <%= user%>

    <p>Aktywny user ${param.user}</p>

</body>
</html>
