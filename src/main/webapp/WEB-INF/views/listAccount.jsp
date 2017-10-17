<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/headeradmin.jsp"%>
<%@ include file="/resources/common/menuadmin.jsp"%>



<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">
<article id="post-1478"
	class="post-1478 page type-page status-publish hentry"> <header
	class="cloud">
<h1>Danh sách Tài Khoản</h1>
<div class="separator"></div>
</header> </article>
<div class="content-bg">
	<div id="comments" class="comments-area">
		<div class="container">
			<div align="center">
				<h5 style="text-align: left;">
					<a href="<c:url value='/register' />" class="btn btn-success">Tạo
						tài khoản</a>
				</h5>
				<br>
				<c:url var="searchAction" value="/admin/Hocsinh/Search"></c:url>
				<form:form action="${searchAction}" method="GET">

				</form:form>
				<table class="table table-hover">
					<th>ID</th>
					<th>Username</th>
					<th>Password</th>
					<th>Password Confirm</th>
					<th>Email</th>
					<th>Quyền</th>
					<th>Học Sinh</th>
					<th>Phụ huynh</th>
					<th>Action</th>
					<c:forEach var="account" items="${accounts}" varStatus="status">
						<tr>
							<td>${account.accountId}</td>
							<td>${account.username}</td>
							<td>${account.password}</td>
							<td>${account.passwordConfirm}</td>
							<td>${account.emailAddress}</td>
							<td>
							<c:if test="${account.r.roleName == 'ROLE_HOST'}">Quyền Giáo Viên</c:if>
							<c:if test="${account.r.roleName == 'ROLE_GUEST'}">Quyền Phụ Huynh</c:if>
							<c:if test="${account.r.roleName == 'ROLE_ADMIN'}">Quyền Quản trị</c:if>
							</td>
							<td>${account.hocsinh.tenhs}</td>
							<td>${account.hocsinh.phuhuynh}</td>

							<td><a
								href="<c:url value="/editAccount/${account.accountId}" />"
								class="btn btn-primary">Edit</a> <a
								href="<c:url value="/removeAccount/${account.accountId}" />"
								class="btn btn-danger">Delete</a></td>
						</tr>
						</tr>
					</c:forEach>





				</table>
			</div>
		</div>
	</div>
</div>
</section>



<%@ include file="/resources/common/footeradmin.jsp"%>
