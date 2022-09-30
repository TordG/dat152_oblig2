<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cart</title>
</head>

<body>
	<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="no.hvl.dat152.resources.apptexts">
 
		<h3>
			<fmt:message key="cart" />
		</h3>
		
		<table>
		  <tr>
		    <th><fmt:message key="name"/></th>
		    <th><fmt:message key="shortDesc"/></th>
		    <th><fmt:message key="price"/></th>
		   	<th><fmt:message key="quantity"/></th>
		   	<th><fmt:message key="total"/></th>
		    
		  </tr>
		  <tr>
		    <td>Alfreds Futterkiste</td>
		    <td>Maria Anders</td>
		    <td>Germany</td>
		    <td>Maria Anders</td>
		    <td>Germany</td>
		  </tr>
		</table>
		
		
		<a href="index">
			<fmt:message key="index"/>
		</a> 
		
		<a href="cart">
			<fmt:message key="products" />
		</a> 
		

	</fmt:bundle>

</body>
</html>
