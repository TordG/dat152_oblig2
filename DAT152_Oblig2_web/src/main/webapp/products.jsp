<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Store</title>
</head>

<body>
	<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="no.hvl.dat152.resources.apptexts">

		<h3>
			<fmt:message key="whichCup" />
		</h3>

		<c:forEach items="${cupList}" var="cup">
			
				 <img src="${cup.getUrl()}"/>
				 
				 <c:out value="${cup.getName()}" />
				 <c:out value="${cup.getPrice()}" />
				 <br>
			
		</c:forEach>




	</fmt:bundle>

</body>
</html>
