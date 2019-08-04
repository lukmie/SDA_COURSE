<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>

    <%--skryplet \/--%>
    <%
        response.setIntHeader("Refresh", 3);
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);

        if (calendar.get(Calendar.AM_PM) == 0) {
            am_pm = "AM";
        } else {
            am_pm = "PM";
        }
        String value = hour + ":" + min + ":" + sec + " " + am_pm;
        out.println("Aktualnie jest: " + value);
    %>
</center>
</body>
</html>
