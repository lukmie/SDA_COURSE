<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*, java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table width="100%" border="1" align="center">
        <tr bgcolor="green">
            <th>Nazwa nagl</th>
            <th>Wart nagl</th>
        </tr>

        <%
            Enumeration headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()){
                String paramName = (String) headerNames.nextElement();
                out.print("<tr><td>" + paramName + "</td>");
                String paramValue = request.getHeader(paramName);
                out.print("<td>" + paramValue + "</td></tr>");
            }
        %>


</body>
</html>
