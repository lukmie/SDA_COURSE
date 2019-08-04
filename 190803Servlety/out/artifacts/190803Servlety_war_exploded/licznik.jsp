<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Integer liczbaWejsc = (Integer) application.getAttribute("liczbaWejsc");
    if (liczbaWejsc == null || liczbaWejsc == 0) {
        out.println("First visit.");
        liczbaWejsc = 1;
    } else {
        out.println("Welcome back!");
        liczbaWejsc += 1;
    }

    application.setAttribute("liczbaWejsc", liczbaWejsc);
%>

<p>Visit count: <%= liczbaWejsc%></p>

</body>
</html>
