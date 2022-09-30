<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="/WEB-INF/tlds/dat152.tld" prefix="dat152"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cart</title>

<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>

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
		  
		  <c:forEach items="${cart.getIndividualItems()}" var="item">
				 
				 <tr>
				    <td>
				    	<c:out value="${item.getName()}"/>
				    	
				    </td>
				    
				    <td>
					   <dat152:shorttext maxchars="10"><c:out value="${item.getDescription()}"/></dat152:shorttext>
				    </td>
				    
				    <td>
				    	<c:out value="${item.getPrice()}"/> <fmt:message key="currencySymbol"/>
				    </td>
				    
				    <td>
				    	<c:out value="${cart.getAmount(item)}"/>
				    </td>
				    <td>
				    	<c:out value="${cart.getItemTotal(item)}"/> <fmt:message key="currencySymbol"/>
				    </td>
		  		</tr>

		</c:forEach>
		
		
		
			<tr>
		     	<td colspan="4" style="text-align: right"><fmt:message key="totalAmount"/></td>
			    <td>${cart.getTotal()} <fmt:message key="currencySymbol"/></td>
		  	</tr>
		
		  
		</table>
		
		
		<a href="index">
			<fmt:message key="index"/>
		</a> 
		
		<a href="products">
			<fmt:message key="products" />
		</a> 
		

	</fmt:bundle>
	
	<p><jsp:include page="copyright.jsp" /></p>
	

</body>
</html>
