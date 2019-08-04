<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% int dzien = 7; %>
<% int rozmiar; %>
<% int zmien = 1; %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%-- serwlet deklaracja wykonuje sie w ciele skrypletu--%>
  <%! int x = 5; %>

  <%--skryplet \/ --%>
  <% int sum = 2 + 2; out.print(sum); %>

  <%--wyrazenie to z automatu wyświetla nie trzeba out print--%>
  <%="Witajcie wszyscy"%>

  <%@ page import="java.util.Date" %>

  Dzisiaj jest <%= new Date()%>

  <% if(dzien == 1) { %>
  <p> Poniedzialek </p>
  <%} else {%>
  <p> Niedziela </p>
  <% } %>

  <%--skryplet \/--%>
  <% for (rozmiar = 1; rozmiar <= 5; rozmiar++) { %>
  <font color="aqua" size="<%= rozmiar %>" >
    Przyklad zmiany koloru i czcionki
  </font><br>
  <%}%>

  <% while (zmien < 6) { %>
  <font color="green" size="<%= zmien %>" >
    Przyklad zmiany koloru i czcionki
  </font><br>
  <% zmien++;%>
  <%}%>


  </body>
</html>