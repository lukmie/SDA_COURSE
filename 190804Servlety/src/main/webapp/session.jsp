<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:if test="${pageContext.request.method == 'POST'}">
    <c:set var="uid" value="${param.uid}" scope="session" />
    <jsp:forward page="session2.jsp" />
</c:if>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post">
        <table border="1" cellpadding="0" cellspacing="0"
               style="border-collapse: collapse" bordercolor="#111111" width="42%" id="Autonumber1">
            <tr>
                <td width="100%" colspan="2" bgcolor="#8a2be2">
                    <p align="center">
                        <font size="4" color="blue">Please Login</font>
                    </p>
                </td>
            </tr>
            <tr>
                <td width="19%">User Name</td>
                    <td width="81%">
                        <input type="text" name="uid" size="20" />
                    </td>
            </tr>
            <tr>
                <td width="19%">Password</td>
                    <td width="81%">
                        <input type="password" name="pwd" size="20" />
                    </td>
            </tr>
            <tr>
                <td width="100%" colspan="2">
                    <p align="center">
                        <input type="submit" value="Submit" name="action" />
                        <input type="reset" value="Reset" name="B2" />
                    </p>
                </td>
            </tr>
        </table>

    </form>

<p align="left">
    <i>Note: you may use any id</i>
</p>
</body>
</html>
