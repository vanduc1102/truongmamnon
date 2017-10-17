<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/header.jsp"%>


<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">

<div class="content-bg" style="margin-left:150px; width:110%;margin-top:-150px">
	<div id="comments" class="comments-area">
		<div class="container">
			<c:url var="addAction" value="/doRegister"></c:url>
			<form:form action="${addAction}" method="POST"
				modelAttribute="account" class="form-signin">
				<h1 class="form-signin-heading">Nhập đầy đủ thông tin để tạo
					tài khoản</h1>
				<br>

				<div class="form-group">
					<label>Tên Đăng Nhập:</label>
					<form:input name="username" type="text" path="username"
						class="form-control" placeholder="Nhập tên đăng nhập..."
						autofocus="true"></form:input>
					<form:errors path="username" style="color:red"></form:errors>
				</div>
				<div class="form-group">
					<label>Mật Khẩu:</label>
					<form:input type="password" path="password" class="form-control"
						placeholder="Mật khẩu..."></form:input>
					<form:errors path="password" style="color:red"></form:errors>
				</div>

				<div class="form-group">
					<label>Nhập Lại Mật Khẩu:</label>
					<form:input type="password" path="passwordConfirm"
						class="form-control" placeholder="Nhập lại mật khẩu..."></form:input>
					<form:errors path="passwordConfirm"></form:errors>
				</div>

				<div class="form-group">
					<label>Email:</label>
					<form:input type="email" path="emailAddress" class="form-control"
						placeholder="Nhập Email"></form:input>
				</div>
				
				<div class="form-group">
					<form:input type="hidden" value="2" path="r.roleId" class="form-control"></form:input>
				</div>
				
				<div class="form-group">
					<label>Nhập mã học sinh:</label>
					<form:input type="text" path="hocsinh.hocsinhid" class="form-control"
						placeholder="Nhập Mã học sinh để xem thông tin con bạn"></form:input>
				</div>


				<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
			</form:form>

		</div>
		<br>
</section>
<div class="clearfix"></div>

<%@ include file="/resources/common/footer.jsp"%>





