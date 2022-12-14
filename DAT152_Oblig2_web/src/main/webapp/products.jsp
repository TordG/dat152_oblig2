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
				  <p> 
				  	 <c:out value="${product.getName()}" />
					 <c:out value="${product.getPrice()}" /> <fmt:message key="currencySymbol"/> 
					 <c:out value="${product.getDescription()}" />
				 </p>
				 
				 <form action="products" method="post">
					 <input name="itemid" id="itemid" type="hidden" value="${product.getId()}" >
					 <input type="submit" value="<fmt:message key="button"/>" >
				 </form>
				 <br>

		</c:forEach>
		
		<a href="index">
			<fmt:message key="index"/>
		</a> 
		
		<a href="cart">
			<fmt:message key="cart" />
		</a> 

	</fmt:bundle>
	
	<p><jsp:include page="copyright.jsp" /></p>

</body>
</html>
