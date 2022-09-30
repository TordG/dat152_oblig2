<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<p>

	<c:forEach items="${supportedLanguages}" var="language">

				 <a href="SetLanguage?locale=${language.getLangCode()}">${language.getLanguage()}</a>

	</c:forEach>

</p>
