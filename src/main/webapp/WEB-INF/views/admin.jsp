<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/resources/common/headeradmin.jsp"%>
<%@ include file="/resources/common/menuadmin.jsp"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>



<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">	
	<article id="post-1478" class="post-1478 page type-page status-publish hentry">
		<header class="cloud"><br><br>
			<h1 style="font-family: monospace;font-weight: bold; color: blue;">Trường Mầm Non Dũng Thiên</h1>
				<div class="separator"></div>
		</header>
	</article>
<div class="content-bg">
	<div id="comments" class="comments-area">
	<div class="container">
		<div>		
	<h1 style="font-family: monospace;font-weight: bold; color: blue;">Tài khoản : ${username}</h1>
	
	<h1 style="font-family: monospace;font-weight: bold; color: blue;">Tên : ${fullname }</h1>
	<h1 style="font-family: monospace;font-weight: bold; color: blue;">Quyền hạn : ${authority}</h1>
	<c:if test="${authority == '[ROLE_GUEST]'}"><br>
	<h1 style="font-family: monospace;font-weight: bold; color: blue;"><a href='<c:url value='/admin/parent/${username}' />'>Xem thông tin con bạn</a></h1> 
	</c:if>
	<c:if test="${authority == '[ROLE_HOST]'}">
	<!--	<h1><a href='<c:url value='/admin/teacher/${username}' />'>Teacher Page</a></h1> -->
	</c:if>
	<c:if test="${authority == '[ROLE_ADMIN]'}">
	<!--	<h1><a href='<c:url value='/admin/manage/${username}' />'>My profile</a></h1> -->
	</c:if>
	<br>
	
	<h1><a class="btn btn-danger" href='<c:url value="/j_spring_security_logout" />'> Đăng xuất</a>
	    <a style="margin-left:40px;" class="btn btn-success" href='<c:url value='/' />'>Về trang chủ</a>
	</h1>
	<section id="featured" >
	<div id="featured-imgs">
		<div id="slider-featured">
			<div style="margin-top: 100px;" id="wowslider-container1">
				<div class="ws_images">
					<ul	style="position: absolute; top: 0px; animation: none; width: 100%; left: 80%; display: block;">
						<li style="width: 10%; font-size: 0px;">
							<img src="resources/home/img/01.png" alt="" title="" id="wows1_1" style="visibility: visible;    margin-right: 500px;">
						</li>
						
					</ul>
				</div>
				<div class="ws_bullets">
					<div>
						<a id="wows1_url_1" href="#" title="" class="ws_selbull"></a> 
						<a id="wows1_url_2" href="#" title="" class=""></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
	
	
	</div>
	</div>
</section>
    
<%@ include file="/resources/common/footeradmin.jsp"%>    
           