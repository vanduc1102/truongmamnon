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
<h1>Thay Đổi Thông Tin Tài Khoản</h1>
<div class="separator"></div>
</header> </article>

<div class="content-bg">
	<div class="container">
		<c:url var="updateAction" value="/updateAccount"></c:url>
		<form:form action="${updateAction}" commandName="editAccount"
			class="form-signin">
			<h1 class="form-signin-heading">Nhập đầy đủ thông tin để tạo tài
				khoản</h1>
			<br>
			<form:input type="hidden" path="accountId"></form:input>
			<div class="form-group">
				<label>Tên Đăng Nhập:</label>
				<form:input name="username" type="text" path="username"
					class="form-control" autofocus="true"></form:input>
			</div>
			<div class="form-group">
				<label>Mật Khẩu:</label>
				<form:input type="password" path="password" class="form-control"></form:input>
			</div>
			<div class="form-group">
				<label>Email:</label>
				<form:input type="email" path="emailAddress" class="form-control"></form:input>
			</div>
			<div class="form-group">
				<form:input type="hidden" path="r.roleId" class="form-control"></form:input>
			</div>
			<div class="form-group">
				<label>Mã học sinh:</label>
				<form:input type="text" path="hocsinh.hocsinhid"
					class="form-control"></form:input>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
		</form:form>
	</div>
</section>



<%@ include file="/resources/common/footeradmin.jsp"%>
