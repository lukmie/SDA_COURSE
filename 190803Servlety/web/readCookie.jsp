<%@ page import="java.util.stream.Stream" %>
<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();

        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                out.print("<br>Name: " + cookie.getName());
                out.print("<br>Value: " + cookie.getValue());
            }
        } else {
            out.print("<h1>Nie ma cookie</h1>");
        }
    %>
</body>
</html>
