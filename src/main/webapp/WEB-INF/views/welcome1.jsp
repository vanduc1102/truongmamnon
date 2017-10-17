<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="/resources/common/header.jsp"%>
<%@ include file="/resources/common/menu.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


	<h1>Message : ${message}</h1>
	<h1>Author : ${user}</h1>
	<h1>Authority: ${authority}</h1>
	<c:if test="${authority == '[ROLE_GUEST]'}">
		<a href='<c:url value='/guest/profile/${user}' />'>My profile</a>
	</c:if>
	<c:if test="${authority == '[ROLE_HOST]'}">
		<a href='<c:url value='/mamnon/profile/${user}' />'>My profile</a>
	</c:if>
	<c:if test="${authority == '[ROLE_ADMIN]'}">
		<a href='<c:url value='/host/profile/${user}' />'>My profile</a>
	</c:if>
	<a href='<c:url value="/j_spring_security_logout" />'> Logout</a>

<%@ include file="/resources/common/footer.jsp"%>