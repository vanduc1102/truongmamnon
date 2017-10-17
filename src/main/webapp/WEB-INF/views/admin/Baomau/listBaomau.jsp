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
			<h1>Danh sách Bảo Mẫu</h1>
						<div class="separator"></div>
		</header>
	</article>
<div class="content-bg">
<div id="comments" class="comments-area">
	<div class="container">
		<div align="center" style="margin-right:60px">
			<h5 style="text-align: left;">
				<a href="<c:url value='/admin/Baomau/New' />" class="btn btn-success">Thêm Mới</a>
			</h5>
			<br>
			<c:url var="searchAction" value="/admin/Baomau/Search"></c:url>
			<form:form action="${searchAction}" method="GET">
				<div class="col-lg-4">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Tìm theo Tên Bảo Mẫu ..." value="${searchString}" name="searchString" />
						<span class="input-group-btn">
							<button class="btn btn-primary" type="submit">Tìm kiếm</button>
						</span>
					</div>
					<!-- /input-group -->
					<br>
				</div>
			</form:form>


			<table class="table table-hover">
				<th>ID</th>
				<th>Tên Bảo Mẫu</th>
				<th>Địa Chỉ</th>
				<th>Ngày Sinh</th>
				<th>Giới Tính</th>
				<th>Hình Ảnh</th>
				<th>Điện Thoại</th>


				
				<th>Action</th>
				<c:if test="${empty searchString}">
				<c:forEach var="Baomau" items="${LBaomau}" varStatus="status">
					<tr>
						<td>${Baomau.baomauid}</td>
						<td>${Baomau.tenbaomau}</td>
						<td>${Baomau.diachi}</td>
						<td>${Baomau.ngaysinh}</td>
						<td>${Baomau.gioitinh}</td>
						<td>${Baomau.hinhanh}</td>
						<td>${Baomau.dienthoai}</td>					
		
								
						
						<td><a href="<c:url value='/admin/Baomau/Edit/${Baomau.baomauid}' />" class="btn btn-primary">Sửa</a>
							<a href="<c:url value='/admin/Baomau/Remove/${Baomau.baomauid}' />" class="btn btn-danger">Xóa</a></td>
					</tr>
				</c:forEach>
				</c:if>
			</table>
		</div>
	</div>
</section>

                       
    
<%@ include file="/resources/common/footeradmin.jsp"%>    
           