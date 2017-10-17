<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->


<div class="collapse navbar-collapse navbar-ex1-collapse"
	style="background-color: #5cb85c">
	<c:choose>
		<c:when test="${authority == '[ROLE_GUEST]' || authority == '[ROLE_HOST]'}">
			<ul class="nav navbar-nav side-nav" style="background-color: #5cb85c">
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Học Sinh</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Bảo Mẫu</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Giáo Viên</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Lớp </a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Xếp Lớp</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Môn Học</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Lịch HĐ Khối Trẻ</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Lịch HĐ Mẫu Giáo</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Chuẩn Sức Khỏe</a></li>
				<li class="disabled"><a href=""  ><i class="fa fa-fw fa-arrows-v">
				</i> Sức Khỏe <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo" class="collapse">
						<li><a href="<c:url value="/admin/Suckhoebenam"/>"><i
								class="fa fa-fw fa-table"></i> Sức Khỏe Bé Trai</a></li>
						<li><a href="<c:url value="/admin/Suckhoebenu"/>"><i
								class="fa fa-fw fa-table"></i> Sức Khỏe Bé Gái</a></li>
					</ul></li>
				<li class="disabled"><a href=""><i
						class="fa fa-fw fa-table"></i> Quản Lý Tài Khoản</a></li>
				<li class="disabled"><a href=""  ><i
						class="fa fa-fw fa-table"></i> Phân Quyền</a></li>
			</ul>
		</c:when>
		<c:otherwise>
			<ul class="nav navbar-nav side-nav" style="background-color: #5cb85c">
				<li><a href="<c:url value="/admin/Hocsinh"/>"><i
						class="fa fa-fw fa-table"></i> Học Sinh</a></li>
				<li><a href="<c:url value="/admin/Baomau"/>"><i
						class="fa fa-fw fa-table"></i> Bảo Mẫu</a></li>
				<li><a href="<c:url value="/admin/Giaovien"/>"><i
						class="fa fa-fw fa-table"></i> Giáo Viên</a></li>
				<li><a href="<c:url value="/admin/Lop"/>"><i
						class="fa fa-fw fa-table"></i> Lớp</a></li>
				<li><a href="<c:url value="/admin/Xeplop"/>"><i
						class="fa fa-fw fa-table"></i> Xếp Lớp</a></li>
				<li><a href="<c:url value="/admin/Monhoc"/>"><i
						class="fa fa-fw fa-table"></i> Môn Học</a></li>
				<li><a href="<c:url value="/admin/Thucdontrongtuan"/>"><i
						class="fa fa-fw fa-table"></i> Thực Đơn Trong Tuần</a></li>
				
				<li><a href="<c:url value="/admin/Lichhdkhoitre"/>"><i
						class="fa fa-fw fa-table"></i> Lịch HĐ Khối Trẻ</a></li>
				<li><a href="<c:url value="/admin/Lichhdmaugiao"/>"><i
						class="fa fa-fw fa-table"></i> Lịch HĐ Mẫu Giáo</a></li>
				<li><a href="<c:url value="/admin/Chuansuckhoe"/>"><i
						class="fa fa-fw fa-table"></i> Chuẩn Sức Khỏe</a></li>
				<li><a href="javascript:;" data-toggle="collapse"
					data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Sức
						Khỏe <i class="fa fa-fw fa-caret-down"></i></a>
					<ul id="demo" class="collapse">
						<li><a href="<c:url value="/admin/Suckhoebenam"/>"><i
								class="fa fa-fw fa-table"></i> Sức Khỏe Bé Trai</a></li>
						<li><a href="<c:url value="/admin/Suckhoebenu"/>"><i
								class="fa fa-fw fa-table"></i> Sức Khỏe Bé Gái</a></li>
					</ul></li>
				<li><a href="<c:url value="/admin/Thuchi"/>"><i
						class="fa fa-fw fa-table"></i> Quản Lý Thu Chi</a></li>
				<li><a href="<c:url value="/sendmail"/>"><i
						class="fa fa-fw fa-table"></i> Gởi Mail</a></li>
				<li><a href="http://esms.vn/SMS/SmsManager/"  ><i
						class="fa fa-fw fa-table"></i> Nhắn Tin</a></li>
				<li><a href="<c:url value="/account"/>"><i
						class="fa fa-fw fa-table"></i> Quản Lý Tài Khoản</a></li>
				<li><a href="<c:url value="/admin/Role"/>"><i
						class="fa fa-fw fa-table"></i> Phân Quyền</a></li>
			</ul>
		</c:otherwise>
	</c:choose>

</div>
<!-- /.navbar-collapse -->
</nav>

<div id="page-wrapper">

	<div class="container-fluid">

		<!-- Page Heading -->
		<div class="row">
			<div class="col-lg-12">
				<div class="table-responsive">