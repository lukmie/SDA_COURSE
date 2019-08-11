<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<!--[if IE 9]>
<html class="lt-ie10" lang="en"> <![endif]-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manager użytkowników</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.3/css/normalize.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/5.5.3/css/foundation.min.css">
    <link href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet' type='text/css'>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>
</head>

<body>
<h1>Manager</h1>
<h2><a href="new">Dodaj nowego uzytkownika</a> </h2>
<h2><a href="list">Lista uzytkownikow</a> </h2>

<div align="center">
    <c:if test="${user != null}">
        <form action="update" method="post">
    </c:if>
    <c:if test="${user == null}">
        <form action="insert" method="post">
    </c:if>
                <table border="1" cellpadding="5">
                    <caption>
                        <h2>
                            <c:if test="${user != null}">
                                Edytuj
                            </c:if>
                            <c:if test="${$user == null}">
                                Dodaj nowego
                            </c:if>
                        </h2>
                    </caption>

                    <c:if test="${user != null}">
                        <input type="hidden" name="id" value="<c:out value='${user.id}'/>"/>
                    </c:if>

                    <tr>
                        <th>Nazwa: </th>
                        <td>
                            <input type="text" name="name" size="45" value="<c:out value='${user.name}'/>"/>
                        </td>
                    </tr>
                    <tr>
                        <th>Email: </th>
                        <td>
                            <input type="text" name="email" size="45" value="<c:out value='${user.email}'/>"/>
                        </td>
                    </tr>
                    <tr>
                        <th>Kraj: </th>
                        <td>
                            <input type="text" name="country" size="15" value="<c:out value='${user.country}'/>"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="Zapisz">
                        </td>
                    </tr>
                </table>
        </form>
</div>
</body>
</html>
