<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Witaj</h3>
    <c:out value="${uid}"/>

    <p>Twoj ulubiony kolor:</p>

    <c:out value="${param.color}"></c:out>

    <br/>

    <a href="<c:out value="${pageContext.request.requestURI}"/>?color=red">red</a><br/>
    <a href="<c:out value="${pageContext.request.requestURI}"/>?color=blue">blue</a><br/>
    <a href="<c:out value="${pageContext.request.requestURI}"/>?color=green">green</a>

    <%! List<String> list; %>
    <%list = new ArrayList<>(); %>
    <%list.add("Adam"); %>
    <%list.add("Krystian"); %>
    <%list.add("Jan"); %>

    <c:forEach var="listItem" items="${list}">
        <c:out value="${element}"/><br>
        <%--&lt;%&ndash;<c:out value="${listItem}"/>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<br>&ndash;%&gt;--%>
    </c:forEach>

    <%--<c:import url="http://www.java.com"  var="java" scope="session"/>--%>

    <c:if test="${param.pwd eq 'odzew'}">
    <%--&lt;%&ndash;<c:if test="${param.haslo eq 'odzew'}">&ndash;%&gt;--%>
        Tajna tresc.
    </c:if>

</body>
</html>
