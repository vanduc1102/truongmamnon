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
			<h1>Sending Email</h1>
						<div class="separator"></div>
		</header>
	</article>
	
<div class="content-bg">
	<div class="container" style="margin-left: 140px;">
		<form method="post" action="sendmail" class="form-horizontal col-md-9">
			<div class="form-group">
				<label>Người Gửi:</label>
			<input type="text" class="form-control" name="tu" value="truongmamnondungthien@gmail.com" size="65" disabled />
			</div>
			<div class="form-group">
				<label>Ngươi Nhận:</label>
			<input type="text" class="form-control" name="den" size="65" />
			</div>
			<div class="form-group">
				<label>Tiêu Đề:</label>
			<input type="text" class="form-control"  name="tieude" size="65" />
			</div>
			<div class="form-group">
				<label>Nội Dung:</label>
			<textarea class="form-control" cols="50" rows="10" name="noidung"></textarea>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Gởi</button>
				<a style="margin-left:20px;" class="btn btn-primary" href='<c:url value='/admin' />'>Về trang Quản Lý</a>
			</div>
			
				
		</form>
	
	


	</div>
</div>
</section>

                       
    
<%@ include file="/resources/common/footer.jsp"%>    
           