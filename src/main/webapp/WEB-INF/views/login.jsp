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
	<c:if test="${not empty error}">
  <div class="errorblock">
   Access denied
  </div>
 </c:if>
		 <form name='f' action="<c:url value='j_spring_security_check' />"method='POST'>
			<h1 class="form-signin-heading">Đăng nhập thông tin Tài Khoản và Mật Khẩu</h1><br>

			<div class="form-group">
			<label>Tên Đăng Nhập:</label>
				<input name='j_username' value='' class="form-control"/>
			</div>
			<div class="form-group">
			<label>Mật Khẩu:</label>
				<input name='j_password' type="password" class="form-control"/>
			</div>
			<br>
			<button name="submit" class="btn btn-lg btn-primary" type="submit"><font size="4px;">Đăng Nhập</font></button>&nbsp;&nbsp;&nbsp;&nbsp;
			<button name="reset" class="btn btn-lg btn-danger" type="reset"><font size="4px;">Reset</font></button><br><br>
			<!--<a href='<c:url value='/register' />'><font color="red"><strong>Đăng Kí Tài Khoản</strong></font></a>  -->
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href='<c:url value='/register' />'><button type="button" class="btn btn-success"><font size="4px;">Đăng Kí Tài Khoản</font></button></a>
			
			
		
		</form>

	</div>
	<br>
</section>
<div class="clearfix"></div>
	
<%@ include file="/resources/common/footer.jsp"%>

