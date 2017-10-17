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
			<h1>Thông Tin Sức Khỏe Bé Gái</h1>
						<div class="separator"></div>
		</header>
	</article>
<div class="content-bg">
	<div id="comments" class="comments-area">
	<div class="container">
		<div align="center" style="margin-right:100px">
			
			<h5 style="text-align: left;">
				<a href="<c:url value='/admin/Suckhoebenu/New' />" class="btn btn-success">Thêm Mới</a>
			</h5>
			<br>
			<c:url var="searchAction" value="/admin/Suckhoebenu/Search"></c:url>
			<form:form action="${searchAction}" method="GET">
				<div class="col-lg-4">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Search for..." value="${searchString}" name="searchString" />
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
				<th>Học Sinh</th>
				<th>Giới Tính</th>
				<th>Tuổi</th>
				<th>Ngày Khám</th>
				<th>Chiều Cao Nữ</th>
				<th>Chuẩn CC Nữ</th>
				<th>So sánh CC Nữ</th>
				<th>Tình Trạng CC Nữ</th>
				<th>Cân Nặng Nữ</th>
				<th>Chuẩn CN Nữ</th>
				<th>So sánh CN Nữ</th>
				<th>Tình Trạng CN Nữ</th>
				
				
				<th>Action</th>
				<c:if test="${empty searchString}">
				<c:forEach var="Suckhoebenu" items="${LSuckhoebenu}" varStatus="status">
					<tr>
						<td>${Suckhoebenu.suckhoebenuid}</td>
						<td>${Suckhoebenu.hocsinh.tenhs}</td>
						<td>${Suckhoebenu.hocsinh.gioitinh}</td>
						<td>${Suckhoebenu.chuansuckhoe.thangtuoi}</td>
						<td>${Suckhoebenu.ngaykham}</td>
						<td>${Suckhoebenu.chieucao}</td>
						<td>${Suckhoebenu.chuansuckhoe.chuanchieucaonu}</td>
						<td>${Suckhoebenu.sosanhcc}</td>
						<td>${Suckhoebenu.tinhtrangcc}</td>
						<td>${Suckhoebenu.cannang}</td>
						<td>${Suckhoebenu.chuansuckhoe.chuancannangnu}</td>
						<td>${Suckhoebenu.sosanhcn}</td>
						<td>${Suckhoebenu.tinhtrangcn}</td>
						
					
						
						<td><a href="<c:url value='/admin/Suckhoebenu/Edit/${Suckhoebenu.suckhoebenuid}' />" class="btn btn-primary">Sửa</a>
							<a href="<c:url value='/admin/Suckhoebenu/Remove/${Suckhoebenu.suckhoebenuid}' />" class="btn btn-danger">Xóa</a></td>
					</tr>
				</c:forEach>
				</c:if>
			</table>
		</div>
	</div>
</section>

                       
    
<%@ include file="/resources/common/footeradmin.jsp"%>    
           