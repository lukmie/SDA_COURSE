<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSTL</title>
</head>
<body>
  <c:out value="${user.imie}" escapeXml="true" />
  <c:out value="${user.nazwisko}" escapeXml="true" />
  <c:out value="${user.wiek}" escapeXml="true" />

  <c:set value="tekst" var="zmiennaTekstowa" scope="request" />
  <c:if test="${zmiennaTekstowa eq 'tekst'}" >
    OK
  </c:if>

  <c:if test="${user.imie eq 'Sylwia'}">
    Cookie
  </c:if>

  <c:set value="${user.imie}" var="imieUsera" scope="request"/>
  ${imieUsera}

  <c:set target="${user}" property="imie" value="Marcin" />
  ${user.imie}

  <c:catch var="catchException">
    <% int x = 5/0; %>
  </c:catch>

  <c:if test="${catchException != null}">
    <p>
      The exc is ${catchException} <br/>
      There is an exception ${catchException.message}
    </p>
  </c:if>

  <c:choose>
    <c:when test="${user.wiek gt 18}">
      Jestes dorosly
    </c:when>
    <c:when test="${user.wiek lt 18}">
      Jestes dzieckiem
    </c:when>
    <c:otherwise>
      Masz 18 lat.
    </c:otherwise>
  </c:choose>

  <p> space </p>

  <c:forEach var="u" items="${lista}">
    ${u.imie}
    ${u.nazwisko}
  </c:forEach>

  <c:import url="http://www.google.pl" var="tresc" scope="request"/>
  ${tresc}

  <p>Dlugosc listy</p>
  ${fn:length(lista)}

  <fmt:formatNumber value="${cena}" type="currency" currencyCode="PLN" minFractionDigits="2" maxFractionDigits="2"/>

  <br/>

  <fmt:formatDate value="${data}" timeStyle="long" dateStyle="long" type="both" />

</body>
</html>