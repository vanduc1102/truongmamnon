<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file="/resources/common/headeradmin.jsp"%>
<%@ include file="/resources/common/menuadmin.jsp"%>


<section id="content" class="col-lg-7 col-md-8 col-sm-12" role="main" style="width:1250px;">	
	<article id="post-1478" class="post-1478 page type-page status-publish hentry">
		<header class="cloud">
		<h1>Sức Khỏe Bé Nữ</h1>
						<div class="separator"></div>
		</header>
	</article>
	
<div class="content-bg  col-xs-12 col-sm-6">

		<c:url var="addAction" value="/admin/Suckhoebenu/Add"></c:url>
		<form:form action="${addAction}" commandName="NSuckhoebenu" style="width:100%"
			class="form-horizontal col-md-6">

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
				<label>Ngày Khám:</label>
				<form:input type="text" class="form-control"
					placeholder="YYYY-MM-DD ..." path="ngaykham" />
			</div>

			

			<div class="form-group">
				<label>Chọn Chuẩn Chiều Cao</label>
				<form:select id="chuanCC" path="Chuansuckhoe.chuansuckhoeid"
					class="form-control">
					<form:option value="${Chuansuckhoe.chuansuckhoeid }">
							<c:out value="-"/>
						</form:option>
					<c:forEach var="Chuansuckhoe" items="${ListChuan}">
						<form:option value="${Chuansuckhoe.chuansuckhoeid }">
							<c:out value="${Chuansuckhoe.chuanchieucaonu}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>
			
			<div class="form-group">
				<label>Chiều Cao:</label>
				<form:input type="text" class="form-control"
					placeholder="Nhập Chiều Cao..." path="chieucao" id="nhapChieucao" />
			</div>
			
						
			<div class="form-group">
				<label>Chọn Chuẩn Cân Nặng</label>
				<form:select id="chuanCN" path="Chuansuckhoe.chuansuckhoeid"
					class="form-control">
					<form:option value="${Chuansuckhoe.chuansuckhoeid }">
							<c:out value="-"/>
						</form:option>
					<c:forEach var="Chuansuckhoe" items="${ListChuan}">
						<form:option value="${Chuansuckhoe.chuansuckhoeid }">
							<c:out value="${Chuansuckhoe.chuancannangnu}" />
						</form:option>
					</c:forEach>
				</form:select>
			</div>
			<div class="form-group">
				<label>Cân Nặng:</label>
				<form:input type="text" class="form-control"
					placeholder="Nhập Cân Nặng..." path="cannang" id="nhapCannang" />
			</div>
				
				<form:input class="form-control" type="text" path="sosanhcc" id="tinhChieucao"/>

				<form:input class="form-control" type="text" path="tinhtrangcc" id="hienthiCC"/>


				<form:input class="form-control" type="text" path="sosanhcn" id="tinhCannang"/>


				<form:input class="form-control" type="text" path="tinhtrangcn" id="hienthiCN"/>


			<div class="form-group">
				<button type="submit" class="btn btn-primary" >Submit</button>
			</div>
			
			<div class="form-group">
				<input  id="txt11" type="hidden" name="cc" class="form-control" />
			</div>
			<div class="form-group">
				<input  id="txt22" type="hidden" name="cn" class="form-control" />
			</div>
			
		</form:form>
</div>


<div class="content-bg  col-xs-12 col-sm-6" style="width:150px">
	<div class="container">
		<div align="center" style="margin-right:100px; width:350px;">

			<form:form action="${searchAction}" method="GET">
				<div class="col-lg-4">
					
					<!-- /input-group -->
					<br>
				</div>
			</form:form>


			<table class="table table-hover">

				<th>Tháng Tuổi</th>
				<th>Chuẩn CC Nữ</th>
				<th>Chuẩn CN Nữ</th>

				<c:if test="${empty searchString}">
				<c:forEach var="Chuansuckhoe" items="${LChuansuckhoe}" varStatus="status">
					<tr>

						<td>${Chuansuckhoe.thangtuoi}</td>
						<td>${Chuansuckhoe.chuanchieucaonu}</td>
						<td>${Chuansuckhoe.chuancannangnu}</td>
		
					</tr>
				</c:forEach>
				</c:if>
			</table>
		</div>
	</div>
</div>

		<script type="text/javascript">
		
			$(document).ready(function(){
				$('#chuanCC').change(function(){
					hungCC();
					tinhCC();
					kiemTraCC();
					
				})
				$('#nhapChieucao').change(function(){
					hungCC();
					tinhCC();
					kiemTraCC();
					
				})
				function tinhCC(){
					var chieucaocosan = $('#txt11').val();
					var nhapchieucao = $('#nhapChieucao').val();
					var tinhCc;
					tinhCc = nhapchieucao - chieucaocosan;
					$('#tinhChieucao').val(tinhCc);
				}
				
				function hungCC() {
					var chuanCtC = document.getElementById("chuanCC")
					document.getElementById("txt11").value = chuanCtC.options[chuanCC.selectedIndex].text;
				}
				
				function kiemTraCC(){
					var getTcc = $('#tinhChieucao').val();
					var raChieucao = null;
					if(getTcc > 2){
						raChieucao = 'Cao'
					}else if(getTcc < 2){
						raChieucao = 'Thap'
					}
					else {
						raChieucao = 'Binh thuong'
					}
					$('#hienthiCC').val(raChieucao);	
				}

				
				
				
				$('#nhapCannang').change(function(){
					hungCN();
					tinhCN();
					kiemTraCN();
				})
				$('#chuanCN').change(function(){
					hungCN();
					tinhCN();
					kiemTraCN();
				})
				
				function tinhCN(){
					var cannangcosan = $('#txt22').val();
					var nhapcannang = $('#nhapCannang').val();
					var tinhCn;
					tinhCn = nhapcannang - cannangcosan;
					$('#tinhCannang').val(tinhCn);
				}
				
				function hungCN() {
					var chuanCtN = document.getElementById("chuanCN")
					document.getElementById("txt22").value = chuanCtN.options[chuanCN.selectedIndex].text;
				}
				
				function kiemTraCN(){
					var getTcn = $('#tinhCannang').val();
					var raCannang = null;
					if(getTcn > 2){
						raCannang = 'Béo'
					}else if(getTcn < 2){
						raCannang = 'Gầy'
					}
					else {
						raCannang = 'Bình Thường'
					}
					$('#hienthiCN').val(raCannang);
					
				}
			});
			
			
			
			/* function ShowCC() {
				var chuanCtC = document.getElementById("chuanCC")
				document.getElementById("txt11").value = chuanCtC.options[chuanCC.selectedIndex].text;
			}

			function ShowCN() {
				var chuanCtN = document.getElementById("chuanCN")
				document.getElementById("txt22").value = chuanCtN.options[chuanCN.selectedIndex].text;
			}
			
			function kiemtracc(){
				  var z = document.getElementById("ttcc").value; 
				  var g = document.getElementById("trunggiancc").value;
				        if(z > 2){
				            document.getElementById("vidu1").innerHTML = "cao";
				            document.getElementById("trunggiancc").value = "cao";
				        }else if(z < -2){
				            document.getElementById("vidu1").innerHTML = "thap";
				            document.getElementById("trunggiancc").value = "thap";
				        }else{
				            document.getElementById("vidu1").innerHTML = "binh thuong";
				            document.getElementById("trunggiancc").value = "binh thuong";
				        }
				}
			
			function kiemtracn(){
				  var z = document.getElementById("ttcn").value; 
				  var g = document.getElementById("trunggiancn").value;
				        if(z > 2){
				            document.getElementById("vidu2").innerHTML = "beo";
				            document.getElementById("trunggiancn").value = "beo";
				        }else if(z < -2){
				            document.getElementById("vidu2").innerHTML = "gay";
				            document.getElementById("trunggiancn").value = "gay";
				        }else{
				            document.getElementById("vidu2").innerHTML = "chuan";
				            document.getElementById("trunggiancn").value = "chuan";
				        }
				}
			 */
		</script>
		
</section>

                       
    
<%@ include file="/resources/common/footeradmin.jsp"%>    
           