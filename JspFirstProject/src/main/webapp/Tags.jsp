<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL Tags Example</h1>

<c:out value="Welcome to JSTL Page"></c:out>
<c:set var="name" value="Sham"></c:set>
<h3>Hello,<c:out value='${name}'></c:out></h3>
<c:remove var = "name"></c:remove>
<h1>Hello,<c:out value="name"></c:out></h1>

<ul>
<c:forEach var="i"  begin="10" end ="20">
<li>${i}</li>
</c:forEach>

</ul>

<a href='<c:url value="/home.jsp"/>'>Go Home</a>
<c:set var="condition" value ="true"></c:set>
<c:if test ="${condition }">
<p>This is true block</p>
</c:if>
<c:set var="inclome" value="${56789}"/>
<p>Your income is :<c:out value ="${income }"/></p>
<c:choose>
<c:when test="${income<=1000 }">
   Income is not good
   </c:when>
    <c:when test="${income<=10000 }">
   Income is very good
   </c:when>
   <c:otherwise>
   Income is undermined
   </c:otherwise>

</c:choose>
</body>
</html>