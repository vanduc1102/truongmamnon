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
			<h1>Danh sách Giáo Viên</h1>
						<div class="separator"></div>
		</header>
	</article>
<div class="content-bg">
<div id="comments" class="comments-area">
	<div class="container">
		<div align="center">
			<h5 style="text-align: left;">
				<a href="<c:url value='/admin/Giaovien/New' />" class="btn btn-success">Thêm Mới</a>
			</h5>
			<br>
			<c:url var="searchAction" value="/admin/Giaovien/Search"></c:url>
			<form:form action="${searchAction}" method="GET">
				<div class="col-lg-4">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="Tìm theo Tên Giáo Viên ..." value="${searchString}" name="searchString" />
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
				<th>Giáo Viên</th>
				<th>Địa Chỉ</th>
				<th>Ngày Sinh</th>
				<th>Giới Tính</th>
				<th>Hình Ảnh</th>
				<th>Điện Thoại</th>
				<th>Email</th>
				<th>Trình Độ</th>
				<th>Chức Vụ</th>
				<th>Kinh Nghiệm</th>
				<th>Action</th>
				<c:if test="${empty searchString}">
				<c:forEach var="Giaovien" items="${LGiaovien}" varStatus="status">
					<tr>
						<td>${Giaovien.giaovienid}</td>
						<td>${Giaovien.tengv}</td>
						<td>${Giaovien.diachi}</td>
						<td>${Giaovien.ngaysinh}</td>
						<td>${Giaovien.gioitinh}</td>
						<td>${Giaovien.hinhanh}</td>
						<td>${Giaovien.dienthoai}</td>					
						<td>${Giaovien.email}</td>
						<td>${Giaovien.trinhdo}</td>
						<td>${Giaovien.chucvu}</td>
						<td>${Giaovien.kinhnghiem}</td>		
	
						
						<td><a href="<c:url value='/admin/Giaovien/Edit/${Giaovien.giaovienid}' />" class="btn btn-primary">Sửa</a>
							<a href="<c:url value='/admin/Giaovien/Remove/${Giaovien.giaovienid}' />" class="btn btn-danger">Xóa</a></td>
					</tr>
				</c:forEach>
				</c:if>
			</table>
		</div>
	</div>
</section>
                       
    
<%@ include file="/resources/common/footeradmin.jsp"%>    
           