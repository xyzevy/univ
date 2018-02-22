﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

	<head>
		<title>Ticket Order Confirm</title>
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<!-- Custom Theme files -->
		<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
		<!-- Custom Theme files -->
		<script src="js/jquery.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<!-- Custom Theme files -->
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="css/style_footer.css" rel="stylesheet" type="text/css"/>
		<script type="application/x-javascript">
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		</script>

		<link rel="stylesheet" href="css/style_nav.css" type="text/css" media="all" />
		<link rel="stylesheet" href="css/news-nav.css" type="text/css" media="all" />
		<link rel="stylesheet" href="css/passengerInfo_css.css" type="text/css"/>
		<link rel="stylesheet" href="css/common_css.css" type="text/css"/>
		<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
		<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css"/>
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
					<a  href="../userweb/first"><i class="glyphicon glyphicon-user"> </i>个人中心</a>
			</div>
		</div>
		<div class="faq">
			<div class="container">
				<div class="agileits-news-top">
					<ol class="breadcrumb">
						<li><a href="../main/NotIndex" >主页</a></li>
						<li>
							<a href="#">查询</a>
						</li>
						<li>
							<a href="#">购票</a>
						</li>

						<li class="active">订单确认</li>
					</ol>
				</div>
			</div>
		</div>

		<script type="text/javascript" language="JavaScript">
			var startTime = new Date();
			var endTime = startTime.getTime() +  10 * 60 * 1000;
			var g_blinkswitch = 0;
			var g_blinktitle = document.title;

			function getRemainTime() {

				var nowTime = new Date();
				var nMS = endTime - nowTime.getTime();
				var nM = Math.floor(nMS / (1000 * 60)) % 60;
				var nS = Math.floor(nMS / 1000) % 60;
				if(nM == 0 && nS == 0 && nMS < 1000) //当倒计时结束
				{
					$("#main_content1").attr("hidden","hidden");
					$("#main_content2").removeAttr("hidden");
					window.location.reload();
					
					
				}
				if(nS < 10) nS = "0" + nS;

				if(nMS >= 0) {
					document.getElementById("remainTime").innerHTML = nM + "分" + nS + "秒";

					setTimeout("getRemainTime()", 1000);
				}

			}
			
			function getPassengerData(){
				var passengerData = ${passengerData};
				//var passengerData = ${param.passengerData};
				console.log(passengerData.toString());
				console.log(passengerData);
				var rowLength = $("#table_list tr").length-1;
				for(var i=0;i<rowLength;i++){
					$("#listContent").remove();
				}
				if(passengerData == null){
					alert("whn");
				}else{
					for(var i=0;i<passengerData.length;i++){
						var newNode = document.createElement("tr");
						newNode.id = "listContent";
						newNode.innerHTML ="<td  align='center'>"+passengerData[i].orderId+"</td>"
							+"<td>"+passengerData[i].name+"</td>"
							+"<td>"+passengerData[i].idtfType+"</td>"
							+"<td>"+passengerData[i].identify+"</td>"
							+"<td>"+passengerData[i].userType+"</td>"
							+"<td>"+passengerData[i].ticketType+"</td>"
							+"<td>"+passengerData[i].carriageId+"</td>"
							+"<td>"+passengerData[i].seatId+"</td>"
							+"<td id='ticket_price'>"+passengerData[i].cost+"</td>";
						$("#show_ticket_message").append(newNode);
					}
				}
				add_insurance();
			}
			

			window.onload = function(){
				getRemainTime();
				getPassengerData();
			}
		</script>
		<div class="content" id="main_content2" style="min-height: 701px;" hidden="hidden">
			
			<div class="t-succ1 t-lock">
				<div class="pay-tips" ><span class="i-lock"></span>
					<h1>
						<span style="position: relative;left: 450px;">支付超时,订单失效！
						   
                        </span>
                    </h1>

				</div>
			</div>
			
		</div>
		

		<div class="content" id="main_content1" style="min-height: 701px;">
			<!--支付提示 开始-->
			<div class="t-succ t-lock" id="timeCounter">
				<div class="pay-tips"><span class="i-lock"></span>
					<h3>
						<span>席位已锁定，请在
						   <span class="colorA">10</span>分钟内进行支付，完成网上购票。
			      		   <span>支付剩余时间：
			      			  <strong id="remainTime" class="colorA">
			      				 <strong >10分00秒</strong>
			      			  </strong>
                           </span>
                        </span>
                    </h3>

				</div>
			</div>
			
			<!--订单信息 开始-->
			<div class="layout b-info">
				<div class="lay-hd">订单信息</div>
				<div class="lay-bd">
					<div class="info" id="show_title_ticket">

						<strong class="mr5">${trainInfo.bdDate }</strong>
						<strong class="mr5">${trainInfo.serialNum } </strong>
						<strong class="ml5">${trainInfo.departure } </strong>
						<strong>站（${trainInfo.lvTime }）—${trainInfo.destination }</strong>
						<strong>站（${trainInfo.arvTime }）</strong>
					</div>
					<table class="table-a" id="table_list">
						<tbody>
							<tr>
								<th width="40" rowspan="1" colspan="1"><strong>序号</strong>
								</th>
								<th width="75" rowspan="1" colspan="1"><strong>姓名</strong>
								</th>
								<th width="120" rowspan="1" colspan="1"><strong>证件类型</strong>
								</th>
								<th width="210" rowspan="1" colspan="1"><strong>证件号码</strong>
								</th>
								<th width="140" rowspan="1" colspan="1"><strong>票种</strong>
								</th>
								<th width="70" rowspan="1" colspan="1"><strong>席别</strong>
								</th>
								<th width="70" rowspan="1" colspan="1"><strong>车厢</strong>
								</th>
								<th width="70" rowspan="1" colspan="1"><strong>席位号</strong>
								</th>
								<th rowspan="1" colspan="1"><strong>票价（元）</strong>
								</th>
							</tr>
						</tbody>
						<tbody id="show_ticket_message">
							
						</tbody>
					</table>
					<div id="insurance_renderTicket_div">
						<div class="bx-box">

						</div>
					</div>
					<script>
						function add_insurance() {
							var price=0;
							for(var i=0;i<$("#show_ticket_message tr").length;i++){
								price += parseFloat($("#show_ticket_message tr").eq(i).find("#ticket_price").text());	
							}

							$("#total_ticket_price").html(price);

						}

						function getSum() {
							var price = 0;
							for(var i=0;i<$("#show_ticket_message tr").length;i++){
								price += parseFloat($("#show_ticket_message tr").eq(i).find("#ticket_price").text());	
							}
							var express = 10;

							$("#total_ticket_price").html((price+express));
						}
					</script>

					<!-- <div id="add_ins_failed_div"  style="display: none;" th:if="${canInsurance and (tour_flag=='dc' or tour_flag=='fc')}" th:include="insurance::add_ins_failed_thf"></div> -->

					<div class="qp-info" id="qp_info">
						<div class="hd">取票方式：
							<span class="mr15">
								<input type="radio" checked="checked" name="qp" id="qpfs_zq" value="0" onclick="add_insurance()" />
                            	<label for="qpfs_zq" style="cursor: pointer;">自取</label>
                            </span>
							<span>
								<input type="radio" name="qp" id="qpfs_sp" value="1"  onclick="getSum()"  />
                            	<label for="qpfs_sp" style="cursor: pointer;">车票快递（10元）</label>
                            </span>

						</div>
					</div>

					<div class="total-box">
						<div class="item">总票价：
							<span class="price" id="total_ticket_price" value=""> </span>
							<span>元</span>
						</div>
					</div>

					<div class="lay-btn bt_blue">
						<p>
							<a href="ticket_order.html" class="btn92" id="cancelButton" shape="rect">取消订单</a>
							<span>
							<script>
								function testad(){
									//alert("df");
									window.location.href="ticketPayment?ifDeliver="+$(".hd input:radio:checked").val()+"&totalCost="+$("#total_ticket_price").text();
								}
							</script>
                            <a href="#" onclick="testad()" class="btn92s" id="payButton" shape="rect">网上支付</a>
                            </span>
						</p>
						<!-- 改签车次按钮 -->
						<!-- 积分支付成功form表单 -->
					</div>
				</div>
			</div>
		</div>

		<div class="cuttingLine1">
			<div class="tm-section-header">
				<div class="col-lg-3 col-md-3 col-sm-3">
					<hr />
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6">
					<h1 class="tm-section-title"><font><font>关于我们</font></font></h1>
				</div>
				<div class="col-lg-3 col-md-3 col-sm-3">
					<hr />
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
								<br/>
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
								<br />
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
								<br />
								<img src="images/er_ctrip_wechat.jpg" />
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

	</body>

</html>