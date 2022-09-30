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
		
		<c:forEach items="${products}" var="product">

				 <img src="${product.getImageFile()}"/>
				 <c:out value="${product.getName()}" />
				 <c:out value="${product.getPrice()}" />
				 <c:out value="${product.getDescription()}" />
				 
				 <br>

		</c:forEach>
		
		<a href="index">
			<fmt:message key="index"/>
		</a> 
		
		<a href="cart">
			<fmt:message key="cart" />
		</a> 

	</fmt:bundle>

</body>
</html>
