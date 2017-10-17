<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/header.jsp"%>
<%@ include file="/resources/common/menu.jsp"%>


<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">	
	<article id="post-1478" class="post-1478 page type-page status-publish hentry">
		<header class="cloud">
			<h1>Message : ${message}</h1>
						<div class="separator"></div>
		</header>
	</article>
<div class="content-bg">
	<div id="comments" class="comments-area">
	<div class="container">
		<div align="center" style="margin-right:100px">
				
	<h1>Author : ${user}</h1>
	<h1>Authority: ${authority}</h1>
	
	<c:if test="${authority == '[ROLE_GUEST]'}">
	<h1><a href='<c:url value='/guest/profile/${user}' />'>My profile</a></h1>
	</c:if>
	
	
	<c:if test="${authority == '[ROLE_HOST]'}">
		<h1><a href='<c:url value='/mamnon/profile/${user}' />'>My profile</a></h1>
	</c:if>
	
	
	<c:if test="${authority == '[ROLE_ADMIN]'}">
		<h1><a href='<c:url value='/host/profile/${user}' />'>My profile</a></h1>
	</c:if>
	
	
	<h1><a href='<c:url value="/j_spring_security_logout" />'> Logout</a></h1>
	
	</div>
	</div>
</section>

<%@ include file="/resources/common/footer.jsp"%>

