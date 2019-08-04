<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>

<%
    Date createTime = new Date(session.getCreationTime());
    Date lastAccessTime = new Date(session.getLastAccessedTime());
    String title = "Welcome back";
    String visitCountKey = "visitCount";
    Integer visitCount = null;

    String userIDKey = "userID";
    String userID = "javaID";

    if (session.isNew()) {
        title = "Hello";
        session.setAttribute(userIDKey, userID);
        session.setAttribute(visitCountKey, visitCount);
    }

    visitCount = (Integer) session.getAttribute(visitCountKey);
    if (visitCount == null) {
        visitCount = 0;
    }

    visitCount = visitCount + 1;
    session.setAttribute(visitCountKey, visitCount);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>


<p>ID: <% out.print(session.getId()) ;%></p>
<p>Created at: <% out.print(createTime) ;%></p>
<p>Last access time: <% out.print(lastAccessTime) ;%></p>
<p>Visit count: <% out.print(visitCount) ;%></p>
<p>User ID: <% out.print(userID) ;%></p>
<p>Max brak aktywności: <% out.print(session.getMaxInactiveInterval()) ;%></p>
<p>Atributes names: <% out.print(session.getAttributeNames()) ;%></p>

</body>
</html>
