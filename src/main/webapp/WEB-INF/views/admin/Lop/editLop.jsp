<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/headeradmin.jsp"%>
<%@ include file="/resources/common/menuadmin.jsp"%>


<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">	
	<article id="post-1478" class="post-1478 page type-page status-publish hentry">
		<header class="cloud">
		<h1>Thay Đổi Thông Tin Lớp</h1>
					<div class="separator"></div>
		</header>
	</article>
	
<div class="content-bg">
	<div class="container">

		<c:url var="updateAction" value="/admin/Lop/Update"></c:url>
		<form:form method="POST" action="${updateAction}" commandName="FLop"
			class="form-horizontal col-md-6">
			<div class="form-group">
				<form:input type="hidden" class="form-control" path="lopid" />
			</div>
			
			<div class="form-group">
				<label>Lớp:</label>
			<form:select path="Xeplop.xeplopid" class="form-control">
					<c:forEach var="Xeplop" items="${ListXep}">
						<form:option value="${Xeplop.xeplopid }">
							<c:out value="${Xeplop.tenxeplop}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>	
		
			<div class="form-group">
				<label>Học Sinh:</label>
			<form:select path="Hocsinh.hocsinhid" class="form-control">
					<c:forEach var="Hocsinh" items="${ListHoc}">
						<form:option value="${Hocsinh.hocsinhid }">
							<c:out value="${Hocsinh.tenhs}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>	
			<div class="form-group">
				<button type="submit" class="btn btn-success">Đồng ý</button>
			</div>
		</form:form>
	</div>
</section>

                       
    
<%@ include file="/resources/common/footeradmin.jsp"%>    
           