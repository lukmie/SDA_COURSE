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

                if (cookie.getName().compareTo("first_name") == 0) {
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    out.print("Usunieto cookie: " + cookie.getName() + "<br>");
                }

                out.print("<br>Name: " + cookie.getName() + ", ");
                out.print("<br>Value: " + cookie.getValue() + "<br>");
            }
        }

%>
</body>
</html>
