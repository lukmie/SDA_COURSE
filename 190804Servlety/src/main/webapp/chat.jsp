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

    <form action="main.jsp" method="post">
        <table border="1" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bgcolor="aqua" width="33%" id="AutoNumber">
            <tbody>
            <tr>
                <td width="100%" colspan="2" bgcolor="#8a2be2">
                    <p align="center">
                        <b>Chat Login</b>
                    </p>
                </td>
            </tr>
            <tr>
                <td width="23%">User ID</td>
                <td width="77%">
                    <input type="text" name="uid">
                </td>
            </tr>
            <tr>
                <td width="100%" colspan="2">
                    <p align="center">
                        <input type="submit" value="Send" name="action">
                        <input type="reset" value="Reset">
                    </p>
                </td>
            </tr>
            </tbody>
        </table>
    </form>

<p> Nazwij sie jak chcesz</p>
</body>
</html>

