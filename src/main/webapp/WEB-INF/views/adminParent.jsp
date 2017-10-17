<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/header.jsp"%>
<%@ include file="/resources/common/menu.jsp"%>


<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">	
	<article id="post-1478" class="post-1478 page type-page status-publish hentry">
		<header class="cloud">
			<h1>Trang Phụ Huynh</h1>
						<div class="separator"></div>
		</header>
	</article>
	
<div class="content-bg">
	<div class="container">
		<form:form method="POST" commandName="HocsinhByAccount"
			class="form-horizontal col-md-6" style="margin-left: 250px;">
			
			<div class="form-group">
				<label>Tên Học Sinh:</label>
				<form:input type="text" class="form-control" path="tenhs" readonly="true" />
			</div>
			<div class="form-group">
				<label>Địa Chỉ:</label>
				<form:input type="text" class="form-control" path="diachi" readonly="true" />
			</div>
			<div class="form-group">
				<label>Ngày Sinh:</label>
				<form:input type="text" class="form-control" path="ngaysinh" readonly="true" />
			</div>
			<div class="form-group">
				<label>Giới Tính:</label>
				<form:input type="text" class="form-control" path="gioitinh" readonly="true" />
			</div>
			<div class="form-group">
				<label>Sở Thích:</label>
				<form:input type="text" class="form-control" path="sothich" readonly="true"/>
			</div>
			
			
		</form:form>
	</div>
	
</section>

                       
    
<%@ include file="/resources/common/footer.jsp"%>    
           