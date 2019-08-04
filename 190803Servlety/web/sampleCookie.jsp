<%
    Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
    Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));

    firstName.setMaxAge(60*160);
    lastName.setMaxAge(60*160);

    response.addCookie(firstName);
    response.addCookie(lastName);
%>

<html>
<body>
<p>First Name: <%=request.getParameter("first_name")%></p>
<br/>
<p>Last Name: <%=request.getParameter("last_name")%></p>
</body>
</html>
