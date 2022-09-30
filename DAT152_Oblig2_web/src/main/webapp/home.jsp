<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>

<body>
	<p><jsp:include page="chooseLanguage.jsp" /></p>

	<fmt:bundle basename="no.hvl.dat152.resources.apptexts">
 
		<h3>
			<fmt:message key="greeting" />
		</h3>
		
		<p><fmt:message key="goToStore" /> <a href="products"><fmt:message key="products" /></a><p>

	</fmt:bundle>
	
	<p><jsp:include page="copyright.jsp" /></p>

</body>
</html>
