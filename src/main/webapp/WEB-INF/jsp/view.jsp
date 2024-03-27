<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="5" bgcolor="yellow">
<tr><td>State Name</td><td>District Name</td><td> Name</td><td>Phone</td></tr>
<c:forEach items="${comList}" var="b">
<tr>
<td><c:out value="${b.stName}"></c:out></td>
<td><c:out value="${b.distName}"></c:out></td>
<td><c:out value="${b.name}"></c:out></td>
<td><c:out value="${b.phone}"></c:out></td>

</tr>

</c:forEach>
<tr><td><a href=Download>DownloadPDF</a></td></tr>

</table>


</body>
</html>