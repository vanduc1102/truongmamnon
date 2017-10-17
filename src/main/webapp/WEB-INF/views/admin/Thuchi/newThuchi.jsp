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
<h1>Nhập Thu Chi</h1>
<div class="separator"></div>
</header> </article>

<div class="content-bg">
	<div class="container">
		<c:url var="addAction" value="/admin/Thuchi/Add"></c:url>
		<form:form action="${addAction}" enctype="multipart/form-data"
			commandName="NThuchi" class="form-horizontal col-md-6">
			<div class="form-group">
				<label>Học Sinh:</label>
				<form:select path="Hocsinh.hocsinhid" class="form-control">
					<c:forEach var="Hocsinh" items="${ListHoc}">
						<form:option value="${Hocsinh.hocsinhid }">
							<c:out value="${Hocsinh.tenhs}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>
			<div class="form-group">
				<label>Tiền Học Phí:</label>
				<form:input type="text" class="form-control"
					placeholder="Nhập Số Tiền..." path="tienhocphi" id="hocphi" />
			</div>
			<div class="form-group">
				<label>Tiền Ăn:</label>
				<form:input type="text" class="form-control"
					placeholder="Nhập Số Tiền..." path="tienan" id="tienan" />
			</div>
			<div class="form-group">
				<label>Phụ Thu Khác:</label>
				<form:input type="text" class="form-control"
					placeholder="Nhập Số Tiền..." path="tienphuthu" id="phuthu" />
			</div>
			
			
			<div class="form-group">
				<label>Số Buổi Vắng:</label>
				<form:input type="text" class="form-control"
					placeholder="Nhập Số Buổi Vắng..." path="diemdanh" id="diemdanh" />
			</div>
			
			<input type="hidden" id="tong"/>
			<form:input type="hidden" path="tienthua" id="tienthua" />
			<form:input type="hidden" path="tongtien" />
			<input type="hidden" id="heso" value="20000" />


			<div class="form-group">
				<button type="submit" class="btn btn-primary">Đồng Ý</button>
			</div>
		</form:form>
	</div>
</section>




<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$('#hocphi').change(function() {
							sumTien();
							tich();
							tinhtong();

						})
						$('#tienan').change(function() {
							sumTien();
							tich();
							tinhtong();

						})
						$('#phuthu').change(function() {
							sumTien();
							tich();
							tinhtong();

						})
						$('#diemdanh').change(function() {
							sumTien();
							tich();
							tinhtong();

						})
						

						function sumTien() {
							var thocphi = parseFloat($('#hocphi').val());
							var ttienan = parseFloat($('#tienan').val());
							var tphuthu  = parseFloat($('#phuthu').val());
							var tinhtongtt = 0;
							tinhtongtt = thocphi + ttienan + tphuthu;
							$('#tong').val(tinhtongtt);
						}

						function tich() {
							var dd = parseFloat($('#diemdanh').val());
							var hs = parseFloat($('#heso').val());
							var tich = 0;
							tich = dd * hs;
							$('#tienthua').val(tich);
						}

						function tinhtong() {
							var ttong = parseFloat($('#tong').val());
							var tthua = parseFloat($('#tienthua').val());
							var kq = 0;
							kq = ttong - tthua;
							$('#tongtien').val(kq);
						}

					});
</script>

<%@ include file="/resources/common/footeradmin.jsp"%>
