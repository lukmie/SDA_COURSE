<%@ page import="java.util.Locale" %>
<%@ page import="javax.servlet.*, javax.servlet.http.*" %>
<%@ page import="java.text.DateFormat, java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
    String title = "Lokalna specyficzna data";
    Locale locale = request.getLocale();
    String date = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, locale).format(new Date());
    %>

    <h1><% out.print(title); %></h1>
    <h1>Local date: <% out.print(date); %></h1>
</body>
</html>
