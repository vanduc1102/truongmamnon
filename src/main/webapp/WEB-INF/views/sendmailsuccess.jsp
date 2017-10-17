<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/header.jsp"%>

<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">	
	
<div class="content-bg" style="margin-left:100px; width:1250px; margin-top:-150px">
	<div id="comments" class="comments-area">
	<div class="container">
		<div align="center">	
	
<body onload='document.f.j_username.focus();'>
		
 <h1>Mail của bạn đã được gởi thành công</h1>
 
 <div class="form-group">
				<a style="margin-left:40px;" class="btn btn-primary" href='<c:url value='/admin' />'>Về Trang Quản Lý</a>
</div>

 

</div>
	</div>
</section>
	
<%@ include file="/resources/common/footer.jsp"%>




