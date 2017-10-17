<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/header.jsp"%>
<%@ include file="/resources/common/menu.jsp"%>

<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main">


	<article id="post-1478"
		class="post-1478 page type-page status-publish hentry">
		<header class="cloud">
			<h1>
				<p>Môi Trường Giáo Dục</p>
				<p>An Toàn - Thân Thiện - Tận Tâm</p>
			</h1>
		</header>
		<!-- .entry-header -->


		<div class="content-bg">
			<div class="col-xs-12">
				<div class="page-header">
					<div class="page-icon pull-left">
						<i class="fa fa-smile-o fa-3x"></i>
					</div>
					<div class="page-header-content">
						<h2 class="title">Hoạt động nhà trường</h2>
						<hr class="colorgraph">
						<div class="breadcrumbs">
							<!-- Breadcrumb NavXT 5.3.1 -->

						</div>
					</div>
				</div>
				<div class="clearfix"></div>

				<div class="col-xs-12 col-sm-8">
					<div class="box box-default box-green box-icon-7 margin-bottom-40">
						<i class="box-icon-7-left"></i> <i class="box-icon-7-right"></i>

						<div class="box-title">
							<span>Danh Sách Lớp Lá</span>
						</div>
						<div id="primary" class="content-area">
							<div class="box-content">
								<div class="entry-content post-detail">
									<div class="post-item">
										<div class="post-content">


											<!-- Foreach hiển thị danh sách -->
											<div class="row">
													<div class="col-md-6 col-sm-6 text-center"
														style="display: inline-block;">
														<div class="single-vehicle-sorter">
															<div class="img-box">
																<img style="width: 250px; height: 250px;border-radius: 50px; "
												src="<c:url value="/resources/home/img/people/${hinhanhGiaovien}"/>"
												alt="">	
															</div>
															<h2><span>Giáo Viên: </span>${tengiaovien}</h2>
														</div>
													</div>
													
													<div class="col-md-6 col-sm-6 text-center"
														style="display: inline-block;">
														<div class="single-vehicle-sorter">
															<div class="img-box">
																<img style="width: 250px; height: 250px;border-radius: 50px;"
												src="<c:url value="/resources/home/img/people/${hinhanhBaomau}"/>"
												alt="">	
															</div>
															<h2><span>Bảo Mẫu: </span>${tenbaomau}</h2>
														</div>
													</div>
												
											</div>
											<div class="separator"></div>
											
											<h1 class="text-center">Danh Sách Học Sinh</h1><br>

											<div class="row">
												<c:forEach var="Lop" items="${LLop}" varStatus="status">
													<div class="col-md-4 col-sm-4"
														style="display: inline-block;">
														<div class="single-vehicle-sorter">
															<div class="img-box">
																<a
																	href="<c:url value="/detailHocsinh/${Lop.hocsinh.hocsinhid}"/>"><img
																	style="width: 180px; height: 180px;border-radius: 50px;"
																	src="<c:url value="/resources/home/img/people/${Lop.hocsinh.hinhanh}"/>"
																	alt=""></a>
															</div>
															<h3>${Lop.hocsinh.tenhs}</h3>

															<div class="middle-box-wrapper clearfix">
																<div class="middle-box">
																	
																	<li><span>Giới tính: </span>
																		${Lop.hocsinh.gioitinh}</li>
																	

																</div>
															</div>
														</div>
													</div>
												</c:forEach>
											</div>
											<!-- Kết thúc Foreach hiển thị danh sách -->


										</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>


				<%@ include file="/resources/common/menuhoatdong.jsp"%>

				<div class="clearfix"></div>
				<footer class="entry-meta"> </footer>
				<!-- .entry-meta -->
				<div class="clearfix"></div>
			</div>
	</article>
	<!-- #post -->
	<div class="content-bg">

		<div id="comments" class="comments-area"></div>
		<!-- #comments -->
	</div>

	<div class="clearfix"></div>
	<div class="widget-bg">
		<
		<div class="widget-bg">
			<div class="box-one-column">
				<div
					class="box box-red box-testimonials box-icon-6 margin-bottom-40">
					<h2 class="box-title">
						<span><a href="#">Cảm nhận của Phụ huynh</a></span>
					</h2>
					<div class="box-content">
						<div class="row">
							<div class="col-xs-12 col-sm-2">
								<a class="post-thumb"><img
									src="<c:url value="/resources/home/img/phuhuynh1.jpg"/>"
									class="img-rounded wp-post-image"></a>
							</div>
							<div class="col-xs-12 col-sm-10">
								<div class="post-info">
									<div class="quote-close">
										<h2 class="title">
											Chị Nguyễn Thị Hoài Thu - Phụ huynh bé: Nguyễn Huỳnh Linh Đan
											- Lớp Lá 3</span>
										</h2>
										<p class="description">Con tôi rất nhút nhát, do công việc
											bận rộn gia đình cũng không có thời gian để tạo điều kiện cho
											bé thường xuyên tiếp xúc với môi trường bên ngoài nên bé ngại
											giao tiếp hơn. Do đó khoảng thời gian đầu cho bé đi học là
											quãng thời gian khó khăn cho cả bé và gia đình. Tôi đã từng
											khóc khi thấy bé đứng thút thít do không thuộc những động tác
											thể dục buổi sáng… Thời gian trôi thật mau, giờ bé đã nên
											người và tự tin hơn rất nhiều, bé lại có thể phát huy được
											năng khiếu múa hát. Tất cả là nhờ sự yêu thương, gần gũi của
											các cô đã làm cho bé tìm được niềm vui khi đến lớp. Chúng tôi
											thật sự an tâm khi gởi gắm bé tại Mầm Non Khánh Hội vì đây là
											ngôi nhà thứ hai của bé.</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</section>

<%@ include file="/resources/common/footer.jsp"%>


