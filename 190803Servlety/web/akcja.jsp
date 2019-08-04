<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <jsp:useBean id="text" class="action.TestBean" />
    <%--<jsp:setProperty name="text" property="message" value="Hello" />--%>
    <jsp:getProperty name="text" property="message" />

</body>
</html>
