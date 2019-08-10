<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%--<html>--%>
<%--<head>--%>
    <%--<title>Home</title>--%>
<%--</head>--%>
<%--<body>--%>

    <%--<table>--%>
        <%--<tbody>--%>
            <%--<tr><th>ID</th><th>Name</th><th>Role</th></tr>--%>
            <%--<c:forEach items="${requestScope.studentList}" var="stu">--%>
                <%--<tr>--%>
                    <%--<td><c:out value="${stu.id}"></c:out> </td>--%>
                    <%--<td><c:out value="${stu.name}"></c:out> </td>--%>
                    <%--<td><c:out value="${stu.role}"></c:out> </td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>

        <%--<c:if test="${requestScope.tresc ne null}">--%>
            <%--<c:out value="${requestScope.tresc}" escapeXml="true"></c:out>--%>
        <%--</c:if>--%>

        <%--<br>--%>

        <%--<c:set var="id" value="5" scope="request"></c:set>--%>
        <%--<c:out value="${requestScope.id}"></c:out>--%>

        <%--<a href="<c:url value="${requestScope.url}"></c:url>">Foofe</a>--%>

        <%--</tbody>--%>
    <%--</table>--%>
<%--</body>--%>
<%--</html>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<table>
    <tbody>
    <tr><th>ID</th><th>Name</th><th>Role</th></tr>
    <c:forEach items="${requestScope.studentList}" var="stu">
        <tr>
            <td><c:out value="${stu.id}"></c:out></td>
            <td><c:out value="${stu.name}"></c:out></td>
            <td><c:out value="${stu.role}"></c:out></td>
        </tr>
    </c:forEach>
    <c:if test="${requestScope.tresc ne null}">
        <c:out value="${requestScope.tresc}" escapeXml="true"></c:out>
    </c:if>
    <br>
    <c:set var="id" value="5" scope="request"></c:set>
    <c:out value="${requestScope.id}" ></c:out>
    <a href="<c:url value="${requestScope.url}"></c:url>">Goolge</a>
    </tbody>
</table>
</body>
</html>