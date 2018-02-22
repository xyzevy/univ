﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<title>Ticket Order Success</title>
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<!-- Custom Theme files -->
		<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
		<!-- Custom Theme files -->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<!-- Custom Theme files -->
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="#" />
		<link rel="stylesheet" href="css/style_footer.css" />
		<script type="application/x-javascript">
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		</script>
		<link rel="stylesheet" href="css/style_nav.css" rel="stylesheet" type="text/css" media="all" />
		<link rel="stylesheet" href="css/news-nav.css" rel="stylesheet" type="text/css" media="all" />
		<link rel="stylesheet" href="css/passengerInfo_css.css" />
		<link rel="stylesheet" href="css/common_css.css" />
		<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
		<link rel="stylesheet" href="css/font-awesome.min.css" />
		<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$('#horizontalTab').easyResponsiveTabs({
					type: 'default', //Types: default, vertical, accordion           
					width: 'auto', //auto or any width like 600px
					fit: true // 100% fit in a container
				});
			});
		</script>

		<!---- start-smoth-scrolling---->
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event) {
					event.preventDefault();
					$('html,body').animate({
						scrollTop: $(this.hash).offset().top
					}, 1200);
				});
			});
		</script>
	</head>

	<body>
		<!-- header-section-starts -->
		<div class="tm-header">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-4 col-sm-3 tm-site-name-container">
						<a href="#" class="tm-site-name"><img src="images/logo2.jpg" style="position: relative;top: -15px;" /></a>
					</div>
					<div class="col-lg-6 col-md-8 col-sm-9">
						<div class="mobile-menu-icon">
							<i class="fa fa-bars"></i>
						</div>
						<nav class="tm-nav" style="width: 600px;">
							<ul>
								<li><a href="../main/NotIndex" >主页</a></li>
								<li><a href="../userweb/NormalQuestion">常见问题</a></li>
								<li><a href="../purchase/CommonSence">铁路常识</a></li>
								<li><a href="../purchase/zcfc">站车风采</a></li>
								<li><a href="../purchase/warmService">温馨服务</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
			<!--//logo-->
			<div class="w3layouts-login">
				<a data-toggle="modal" data-target="#myModal" href="#"><i class="glyphicon glyphicon-user"> </i>个人中心</a>
			</div>
		</div>
		<div class="faq">
			<div class="container">
				<div class="agileits-news-top">
					<ol class="breadcrumb">
						<li>
							<a href="../main/NotIndex">主页</a>
						</li>
						<li>
							<a href="#">查询</a>
						</li>
						<li>
							<a href="#">购票</a>
						</li>
						<li>
							<a href="#">订单确认</a>
						</li>
						<li>
							<a href="#">支付</a>
						</li>
						<li class="active">支付成功</li>
					</ol>
				</div>
			</div>
		</div>

		<div class="content" style="min-height: 445px;">
			<!--支付提示 开始-->
			<div class="t-succ tp-over">
				<div class="pay-tips mb40"><span class="i-success"></span>
					<div class="greet"><strong>订票成功！</strong> 业务流水号：
						<span class="colorA">2E857296688001001084515293</span>
					</div>
					<br clear="none" />
					<div class="greet">
						乘车日期：<span class="colorA">${bdDate }</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 车次：
						<span class="colorA">${trainName }</span>
						<br clear="none" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 总金额：<span class="colorA">${totalCost}元</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

						<br clear="none" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					</div>
				</div>
				<div class="lay-btn">
					<a href="#" id="continue_pay_ticket" class="btn122" shape="rect">继续购票</a>
					<a href="#" id="query_my_order" class="btn122s" shape="rect">查询订单详情</a>
				</div>
				<p class="tips">
					1. 应退款项按银行规定时限退还至购票时所使用的网上支付工具账户，请注意查询，如有疑问请致电12306人工客服查询。<br clear="none" /> 2. 如您需要退票费报销凭证，请凭购票所使用的乘车人有效身份证件原件和订单号码在办理退票之日起10日内到车站退票窗口索取。<br clear="none" /> 3. 退票成功后，将向您注册时提供的邮箱和手机发送退票信息，请稍后查询。
				</p>
			</div>
			<!--支付提示 结束-->
		</div>
		<div class="cuttingLine1">
			<div class="tm-section-header">
				<div class="col-lg-3 col-md-3 col-sm-3">
					<hr />
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6">
					<h1 class="tm-section-title"style="font-family:'century gothic';">ABOUT US</h1>
				</div>
				<div class="col-lg-3 col-md-3 col-sm-3">
					<hr />
				</div>
			</div>
		</div>
		</div>
		<footer id="footerContainer">
			<div class="footer">
				<div class="container">
					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="quicklinks">
								<h4 class="footerh"><font><font>相关链接</font></font></h4>
								<br>
								<ul>
									<li><i class="fa fa-angle-right"></i>
										<a href="#">
											<font>
												<font>企业差旅索引</font>
											</font>
										</a>
									</li>
									<li><i class="fa fa-angle-right"></i>
										<a href="#">
											<font>
												<font>网络社会征信网</font>
											</font>
										</a>
									</li>
									<li><i class="fa fa-angle-right"></i>
										<a href="#">
											<font>
												<font>加盟合作</font>
											</font>
										</a>
									</li>
								</ul>
							</div>
						</div>
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="quickcontact">
								<h4 class="footerh"><font><font>联系我们</font></font></h4>
								<br>
								<ul>
									<li><i class="fa fa-phone"></i>
										<font>
											<font> 123456789</font>
										</font>
									</li>
									<li><i class="fa fa-envelope"></i>
										<font>
											<font> abc@website.com</font>
										</font>
									</li>
									<li><i class="fa fa-map-marker"></i>
										<font>
											<font> 2B Barcelon，纽约-32011</font>
										</font>
									</li>
								</ul>
							</div>
						</div>
						<div class="col-md-4 col-sm-12 col-xs-12">
							<div class="follow">
								<h4 class="footerh"><font><font>微信公众号</font></font></h4>
								<br>
								<img src="images/er_ctrip_wechat.jpg">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div>
				<div class="row" style="background: white;">
					<div class="col-md-12">
						<p style="color: black;">
							<font>
								<font>版权所有©2017.公司名称保留所有权利。
								</font>
							</font>
						</p>
					</div>
				</div>
			</div>
			<div id="toTopButton"></div>
		</footer>

		<script src="js/responsive-tabs.js"></script>
		<script type="text/javascript">
			$('#myTab a').click(function(e) {
				e.preventDefault();
				$(this).tab('show');
			});

			$('#moreTabs a').click(function(e) {
				e.preventDefault();
				$(this).tab('show');
			});

			(function($) {
				// Test for making sure event are maintained
				$('.js-alert-test').click(function() {
					alert('Button Clicked: Event was maintained');
				});
				fakewaffle.responsiveTabs(['xs', 'sm']);
			})(jQuery);
		</script>
		<script type="text/javascript">
			$(document).ready(function() {
				/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/

				$().UItoTop({
					easingType: 'easeOutQuart'
				});

			});
		</script>
		<a href="#home" class="scroll" id="toTop" style="display: block;">
			<span id="toTopHover" style="opacity: 1;"> </span>
		</a>

	</body>

</html>