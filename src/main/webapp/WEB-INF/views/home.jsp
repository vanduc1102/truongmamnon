<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="/resources/common/header.jsp"%>
<%@ include file="/resources/common/menu.jsp"%>

<section id="featured">
	<div id="featured-imgs">
		<div id="slider-featured">
			<div style="margin-top: 100px;" id="wowslider-container1">
				<div class="ws_images">
					<ul	style="position: absolute; top: 0px; animation: none; width: 1000%; left: 0%; display: block;">
						<li style="width: 10%; font-size: 0px;">
							<img src="resources/home/img/01.png" alt="" title="" id="wows1_1" style="visibility: visible;">
						</li>
						<li style="width: 10%; font-size: 0px;">
							<img src="resources/home/img/02.png" alt="" title="" id="wows1_2" style="visibility: visible;">
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

<section id="content-homepage">
	<div class="clearfix"></div>

	<div class="row">
		<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
			<div id="col-yellow">
				<div id="ladybug"></div>
				<div id="text-2" class="widget widget_text">
					<h3 class="widget-title">Home Widget Area 1</h3>
					<div class="textwidget">
						<img
							src="resources/home/img/hinh1.jpg"
							alt="kids"> This is the first of three homepage widget
						areas. You can add as many widgets as you like in these three
						colored columns, and also add content from dashboard.
					</div>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
			<div id="col-green">
				<div id="butterfly"></div>
				<div id="recent-posts-3" class="widget widget_recent_entries">
					<h3 class="widget-title">Recent blog posts</h3>
					<ul>
						<li><a href="#">Post Format: Video (YouTube)</a></li>
						<li><a href="#">Media: Twitter Embeds</a></li>
						<li><a href="#">Post Format: Image</a></li>
						<li><a href="#">Post Format: Link</a></li>
						<li><a href="#">Post Format: Quote</a></li>
						<li><a href="#">Post Format: Standard</a></li>
						<li><a href="#">Post Format: Status</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
			<div id="col-orange">
				<div id="calendar-2" class="widget widget_calendar">
					<h3 class="widget-title">Lịch</h3>
					<div id="calendar_wrap" class="calendar_wrap">
						<table id="wp-calendar">
							<caption>Tháng 10/2016</caption>
							<thead>
								<tr>
									<th scope="col" title="Thứ 2">T2</th>
									<th scope="col" title="Thứ 3">T3</th>
									<th scope="col" title="Thứ 4">T4</th>
									<th scope="col" title="Thứ 5">T5</th>
									<th scope="col" title="Thứ 6">T6</th>
									<th scope="col" title="Thứ 7">T7</th>
									<th scope="col" title="Chủ nhật">CN</th>
								</tr>
							</thead>

							
							<tbody>
								<tr>
									<td colspan="5" class="pad">&nbsp;</td>
									<td>1</td><td>2</td>
								</tr>
								<tr>
									<td id="today">3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td>
								</tr>
								<tr>
									<td>10</td><td>11</td><td>12</td><td>13</td><td>14</td><td>15</td><td>16</td>
								</tr>
								<tr>
									<td>17</td><td>18</td><td>19</td><td>20</td><td>21</td><td>22</td><td>23</td>
								</tr>
								<tr>
									<td>24</td><td>25</td><td>26</td><td>27</td><td>28</td><td>29</td><td>30</td>
								</tr>
								<tr>
									<td>31</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>
</section>

<%@ include file="/resources/common/footer.jsp"%>


