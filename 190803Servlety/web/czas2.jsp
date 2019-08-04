<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Date dbNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
        out.print("<h2>" + simpleDateFormat.format(dbNow) + "</h2>");
    %>
</body>
</html>
