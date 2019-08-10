<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>

<html class="lt-ie10" lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSTL</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.3/css/normalize.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.3/css/foundation.min.css">
    <link href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet' type='text/css'>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
</head>
<body>

    <c:if test="${pageContext.request.method == 'POST'}">
        <c:choose>
            <c:when test="${param.send != null}" >
                <c:set var="chat" value="${chat} ${param.uid} : ${param.text}<br/>" scope="application" />
            </c:when>
            <c:when test="${param.clear() != null}">
                <c:set var="chat" value="" scope="application" />
            </c:when>
        </c:choose>
    </c:if>

<table border="0">
    <tbody>
    <tr>
        <td>
            <h3>
                User:
                <c:out value="${param.uid}" />
            </h3>
        </td>
    </tr>
    <tr>
        <td>
            <c:out value="${chat}" escapeXml="true"></c:out>
        </td>
    </tr>
    <tr>
        <td>
            <hr>
            <form method="post">Wiadomosc:
                <input type="text" name="text" size="20">
                <input type="submit" name="send" value="Send">
                <input type="submit" name="refresh" value="Refresh">
                <input type="submit" name="clear" value="Clear">
                <input type="hidden" name="uid" value="<c:out value="${param.uid}"/>"/>
            </form>
        </td>
    </tr>
    </tbody>
</table>

</body>
</html>