/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-10-13 15:56:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content.userweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(' ');
 String basePath=request.getScheme() + "://" +
request.getServerName() + ":" + request.getServerPort() +
request.getContextPath() + "/"; 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>我的个人中心首页</title>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"One Movies Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("\t\t<script type=\"application/x-javascript\">\r\n");
      out.write("\t\t\taddEventListener(\"load\", function() {\r\n");
      out.write("\t\t\t\tsetTimeout(hideURLbar, 0);\r\n");
      out.write("\t\t\t}, false);\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction hideURLbar() {\r\n");
      out.write("\t\t\t\twindow.scrollTo(0, 1);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<link href=\"css/test.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\r\n");
      out.write("\t\t<link href=\"css/ChangePhone.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<link href=\"css/first.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<link href=\"css/commonfriend.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<!-- //引入了css框架，，引入了一些样式 -->\r\n");
      out.write("\t\t<link href=\"css/NomalQuestion.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<link href=\"css/NumberSafe.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<!-- news-css -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"news-css/news.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t\t<!-- js -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\t\t<!-- 引入回到最初的button的js -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/sand.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event) {\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t$('html,body').animate({\r\n");
      out.write("\t\t\t\t\t\tscrollTop: $(this.hash).offset().top\r\n");
      out.write("\t\t\t\t\t}, 1000);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<!-- start-smoth-scrolling -->\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<!--logo-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t<!-- //bootstrap-pop-up -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"tm-header\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-4 col-sm-3 tm-site-name-container\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"tm-site-name\"><img src=\"images/logo2.jpg\" style=\"position: relative;top: -15px;\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-8 col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mobile-menu-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"tm-nav\" style=\"width: 600px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"../main/NotIndex\" >主页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"../userweb/NormalQuestion\">常见问题</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"../purchase/CommonSence\">铁路常识</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"../purchase/zcfc\">站车风采</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"../purchase/warmService\">温馨服务</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--//logo-->\r\n");
      out.write("\t\t\t\t<div class=\"w3layouts-login\">\r\n");
      out.write("\t\t\t\t\t<a  href=\"first\" class=\"active\"><i class=\"glyphicon glyphicon-user\"> </i>个人中心</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$('.toggle').click(function() {\r\n");
      out.write("\t\t\t\t// Switches the Icon\r\n");
      out.write("\t\t\t\t$(this).children('i').toggleClass('fa-pencil');\r\n");
      out.write("\t\t\t\t// Switches the forms  \r\n");
      out.write("\t\t\t\t$('.form').animate({\r\n");
      out.write("\t\t\t\t\theight: \"toggle\",\r\n");
      out.write("\t\t\t\t\t'padding-top': 'toggle',\r\n");
      out.write("\t\t\t\t\t'padding-bottom': 'toggle',\r\n");
      out.write("\t\t\t\t\topacity: \"toggle\"\r\n");
      out.write("\t\t\t\t}, \"slow\");\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<!-- //bootstrap-pop-up -->\r\n");
      out.write("\t\t<!-- nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- faq-banner -->\r\n");
      out.write("\t\t<div class=\"faq\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"agileits-news-top\">\r\n");
      out.write("\t\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../main/NotIndex\">主页</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">个人中心</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"agileinfo-news-top-grids\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 wthree-news-right\">\r\n");
      out.write("\t\t\t\t\t\t<!-- news-right-top -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"news-right-top\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree-news-left-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>个人中心</h3>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree-news-right-top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_title\">个人信息</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath );
      out.write("userweb/showUserInfo\">查看个人信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"NumberSafe\">账号安全</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_title\">常用联系人管理</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"my_a\"href=\"");
      out.print(basePath );
      out.write("userweb/partnerSelect\">常用联系人</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"Suggest\">建议与投诉</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_title\">我的订单</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath);
      out.write("orderWeb/NotPayedOrder\">未完成订单</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath);
      out.write("orderWeb/ungoOrder\">未出行订单</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath);
      out.write("orderWeb/historicalOrder\">已出行订单</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- //news-right-top -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 wthree-top-news-left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wthree-news-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree-news-left-heading1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>系统消息</h3>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"my_image\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/hello.png\" width=\"150px\" height=\"150px\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"say_sth\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</label><span class=\"my_title\">先生，您好！</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"my_subtitle\">欢迎您登录中国铁路客户服务中心网站。</span><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"my_subwarning\">如果您的密码在其他网站也使用，建议您修改本网站密码。完成手机双向核验，即可使用手机号码直接登录的新服务，解除您遗忘用户名的烦恼。</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"my_image2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/train.png\" width=\"250px\" height=\"250px\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\tvar paramMsg = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t\t\tvar msg = unescape(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t\t\tif(paramMsg != null && paramMsg != \"\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\".message\").html( \"<br /><span class='my_title'>\"+paramMsg+\"</span>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t}else if(msg != null && msg != \"\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\".message\").html( \"<br /><span class='my_title'>\"+msg+\"</span>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- //faq-banner -->\r\n");
      out.write("\t\t\t<div class=\"cuttingLine1\">\r\n");
      out.write("\t\t\t\t<div class=\"tm-section-header\">\r\n");
      out.write("\t\t\t\t\t<!--<hr />-->\r\n");
      out.write("\t\t\t\t\t<h1 class=\"tm-section-title\"style=\"font-family:'century gothic';\">ABOUT US</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr style=\"height:1px;border:none;border-top:1px dashed #0066CC;width: 200px; margin-top: -20PX;\" />\r\n");
      out.write("\t\t\t\t<hr style=\"height:1px;border:none;border-top:1px dashed #0066CC;width: 200px; margin-top: -20PX; margin-right: -250px;\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- footer -->\r\n");
      out.write("\t\t\t<footer id=\"footerContainer\">\r\n");
      out.write("\t\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"quicklinks\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"footerh\">相关链接</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">企业差旅索引</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">网络社会征信网</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">加盟合作</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"quickcontact\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"footerh\">联系我们</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-phone\"></i> 123456789</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-envelope\"></i> abc@website.com</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-map-marker\"></i> 2B Barcelon, Newyork -32011</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"follow\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"footerh\">微信公众号</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/er_ctrip_wechat.jpg\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div class=\"row\" style=\"background: white;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"color: black;\">Copyright &copy; 2017.Company name All rights reserved.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"toTopButton\"></div>\r\n");
      out.write("\t\t\t</footer>\r\n");
      out.write("\t\t\t<!-- //footer -->\r\n");
      out.write("\t\t\t<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("\t\t\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
