/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-08-02 16:36:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content.userweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findMissing_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('	');
 String basePath=request.getScheme() + "://" +
request.getServerName() + ":" + request.getServerPort() +
request.getContextPath() + "/"; 
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>找回密码</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\"\n");
      out.write("\tcontent=\"One Movies Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\">\n");
      out.write("\taddEventListener(\"load\", function() {\n");
      out.write("\t\tsetTimeout(hideURLbar, 0);\n");
      out.write("\t}, false);\n");
      out.write("\n");
      out.write("\tfunction hideURLbar() {\n");
      out.write("\t\twindow.scrollTo(0, 1);\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\" />\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("<link href=\"css/test.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"news-css/news.css\" type=\"text/css\"\n");
      out.write("\tmedia=\"all\" />\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.1.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction getVerificationCodeByMail() {\n");
      out.write("\t\tvar mail = document.getElementById(\"mail\").value;\n");
      out.write("\t\talert(mail);\n");
      out.write("\t\tif (mail != null && mail != \"\") {\n");
      out.write("\t\t\t//window.location.href=\"getVerificationCode\";\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"POST\",\n");
      out.write("\t\t\t\turl : \"getVerificationCodeByMail\",\n");
      out.write("\t\t\t\tdata : \"mail=\" + mail,\n");
      out.write("\t\t\t\tsuccess : function(result) {\n");
      out.write("\t\t\t\t\talert(result);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(result) {\n");
      out.write("\t\t\t\t\talert(\"some error occured!\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t})\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\talert(\"邮箱号为空!!!\");\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tfunction getVerificationCodeByCel() {\n");
      out.write("\t\tvar telNum = document.getElementById(\"telNum\").value;\n");
      out.write("\t\talert(telNum);\n");
      out.write("\t\tif (telNum != null && telNum != \"\") {\n");
      out.write("\t\t\t//window.location.href=\"getVerificationCode\";\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : \"POST\",\n");
      out.write("\t\t\t\turl : \"getVerificationCodeByCel\",\n");
      out.write("\t\t\t\tdata : \"telNum=\" + telNum,\n");
      out.write("\t\t\t\tsuccess : function(result) {\n");
      out.write("\t\t\t\t\tconsole.log(result.info);\n");
      out.write("\t\t\t\t\talert(\"\" + result);\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(result) {\n");
      out.write("\t\t\t\t\tconsole.log(result.info);\n");
      out.write("\t\t\t\t\talert(\"some error occured!\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t})\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\talert(\"手机号为空!!!\");\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("label.error {\n");
      out.write("\tcolor: red;\n");
      out.write("\tfont: \"微软雅黑\";\n");
      out.write("\tfont-size: 8px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script src=\"js/jquery.validate.js\" type=\"text/javascript\"\n");
      out.write("\tcharset=\"utf-8\"></script>\n");
      out.write("<script src=\"js/messages_zh.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar jquery_1_7 = jQuery.noConflict();\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$ = jquery_1_7;\n");
      out.write("\t$(function() {\n");
      out.write("\t\t//\t\t\t\t表一的前端校验\n");
      out.write("\t\t$(\"#form_first\").validate({\n");
      out.write("\t\t\trules : {\n");
      out.write("\t\t\t\ttelNum : {\n");
      out.write("\t\t\t\t\trequired : true,\n");
      out.write("\t\t\t\t\trangelength : [ 11, 11 ]\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tidtfNum : {\n");
      out.write("\t\t\t\t\trequired : true,\n");
      out.write("\t\t\t\t\trangelength : [ 7, 18 ]\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tcode : {\n");
      out.write("\t\t\t\t\trequired : true\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tidenPhone : {\n");
      out.write("\t\t\t\t\trequired : true\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tmessages : {\n");
      out.write("\t\t\t\ttelNum : {\n");
      out.write("\t\t\t\t\trangelength : \"请输入11位号码\"\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tidtfNum : {\n");
      out.write("\t\t\t\t\trangelength : \"请输正确位数证件号码\"\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terrorPlacement : function(error, element) {\n");
      out.write("\t\t\t\tif (element.attr(\"name\") == \"Phone\") {\n");
      out.write("\t\t\t\t\terror.appendTo($(\".phone_number\"));\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\terror.appendTo(element.parent());\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif (element.attr(\"name\") == \"idenNumber\") {\n");
      out.write("\t\t\t\t\terror.appendTo($(\".phone_number3\"));\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\terror.appendTo(element.parent());\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t//表二的前端校验\n");
      out.write("\t\t$(\"#form_second\").validate({\n");
      out.write("\t\t\trules : {\n");
      out.write("\t\t\t\tmail : {\n");
      out.write("\t\t\t\t\trequired : true,\n");
      out.write("\t\t\t\t\temail : true\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tidtfNum : {\n");
      out.write("\t\t\t\t\trequired : true,\n");
      out.write("\t\t\t\t\trangelength : [ 7, 18 ]\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tidenNumber2 : {\n");
      out.write("\t\t\t\t\trequired : true\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tidenEmail : {\n");
      out.write("\t\t\t\t\trequired : true\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tmessages : {\n");
      out.write("\t\t\t\tmail : {\n");
      out.write("\t\t\t\t\trangelength : \"请输入11位号码\"\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tidtfNum : {\n");
      out.write("\t\t\t\t\trangelength : \"请输正确位数证件号码\"\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\terrorPlacement : function(error, element) {\n");
      out.write("\t\t\t\tif (element.attr(\"name\") == \"mail\") {\n");
      out.write("\t\t\t\t\t//\t\t\t\t\t\t\terror.appendTo($(\".phone_number\"));\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\terror.appendTo(element.parent());\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif (element.attr(\"name\") == \"idenNumber2\") {\n");
      out.write("\t\t\t\t\terror.appendTo($(\".phone_number3\"));\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\terror.appendTo(element.parent());\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- 引入回到最初的button的js -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/sand.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!-- header -->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!--logo-->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t<!-- //bootstrap-pop-up -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"tm-header\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-md-4 col-sm-3 tm-site-name-container\">\n");
      out.write("\t\t\t\t\t\t<a href=\"NotIndex.html\" class=\"tm-site-name\"><img src=\"images/logo2.jpg\" style=\"position: relative;top: -15px;\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-md-8 col-sm-9\">\n");
      out.write("\t\t\t\t\t\t<div class=\"mobile-menu-icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bars\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<nav class=\"tm-nav\" style=\"width: 600px;\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../main/NotIndex\">主页</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"NomalQuestion\" >常见问题</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"tours.html\">铁路常识</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../purchase/zcfc\">站车风采</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"../purchase/warmService\">温馨服务</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//logo-->\n");
      out.write("\t\t\t<div class=\"w3layouts-login\">\n");
      out.write("\t\t\t\t<a  href=\"first\"><i class=\"glyphicon glyphicon-user\"> </i>个人中心</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('.toggle').click(function() {\n");
      out.write("\t\t\t// Switches the Icon\n");
      out.write("\t\t\t$(this).children('i').toggleClass('fa-pencil');\n");
      out.write("\t\t\t// Switches the forms  \n");
      out.write("\t\t\t$('.form').animate({\n");
      out.write("\t\t\t\theight : \"toggle\",\n");
      out.write("\t\t\t\t'padding-top' : 'toggle',\n");
      out.write("\t\t\t\t'padding-bottom' : 'toggle',\n");
      out.write("\t\t\t\topacity : \"toggle\"\n");
      out.write("\t\t\t}, \"slow\");\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //bootstrap-pop-up -->\n");
      out.write("\n");
      out.write("\t<!-- faq-banner -->\n");
      out.write("\t<div class=\"faq\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"agileits-news-top\">\n");
      out.write("\t\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\">主页</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">个人中心</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\">帐号找回</li>\n");
      out.write("\t\t\t\t</ol>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"agileinfo-news-top-grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 wthree-news-right\">\n");
      out.write("\t\t\t\t\t<!-- news-right-top -->\n");
      out.write("\t\t\t\t\t<div class=\"news-right-top\">\n");
      out.write("\t\t\t\t\t\t<div class=\"wthree-news-left-heading\">\n");
      out.write("\t\t\t\t\t\t\t<h3>个人中心</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"wthree-news-right-top\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_title\">个人信息</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath );
      out.write("userweb/showUserInfo\">查看个人信息</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"NumberSafe\">账号安全</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_title\">常用联系人管理</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"my_a\"href=\"");
      out.print(basePath );
      out.write("userweb/partnerSelect\">常用联系人</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"Suggest\">建议与投诉</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_title\">我的订单</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath);
      out.write("orderWeb/NotPayedOrder\">未完成订单</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath);
      out.write("orderWeb/ungoOrder\">未出行订单</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"new_subtitle\"><a class=\"my_a\"href=\"");
      out.print(basePath);
      out.write("orderWeb/historicalOrder\">已出行订单</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- //news-right-top -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-8 wthree-top-news-left\">\n");
      out.write("\t\t\t\t\t<div class=\"wthree-news-left\">\n");
      out.write("\t\t\t\t\t\t<div class=\"bs-example bs-example-tabs\" role=\"tabpanel\"\n");
      out.write("\t\t\t\t\t\t\tdata-example-id=\"togglable-tabs\">\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"myTab\" class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\" class=\"active\"><a href=\"#home1\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"home1-tab\" role=\"tab\" data-toggle=\"tab\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-controls=\"home1\" aria-expanded=\"true\">手机找回</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"#w3bsd\" role=\"tab\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"w3bsd-tab\" data-toggle=\"tab\" aria-controls=\"w3bsd\">邮箱找回</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t\tfunction testConditionByCel(){\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t/* window.location.href=\"setNewPasswordPage\";\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.navigate(\"setNewPasswordPage\");\n");
      out.write("\t\t\t\t\t\t\t\t\tselt.location=\"setNewPasswordPage\"; */\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tvar telNum = document.getElementById(\"telNum\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\tvar idtfType =  document.getElementById(\"idtfType1\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\tvar idtfNum =  document.getElementById(\"idtfNum1\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\tvar code =  document.getElementById(\"celCode\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\talert(telNum+\":\"+idtfType+\":\"+idtfNum+\":\"+code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype:\"post\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\turl:\"retrievePasswordByCel\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdataType:\"text\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata:{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"telNum\":telNum,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"idtfType\":idtfType,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"idtfNum\":idtfNum,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"code\":code\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsuccess:function(result){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"result:\"+result);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(result==1){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"jump to ...\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twindow.location.href=\"setNewPasswordPage\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//window.navigate(\"setNewPasswordPage\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//selt.location=\"setNewPasswordPage\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//top.location=\"\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else if(result==2){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"TEL is dismatch with the info.\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else if(result==3){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"Verification is not correct!\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else if(result==0){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"TEL is not exist!\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"succeed to send but error when receive info.\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\terror:function(result){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"error!\"+result);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\talert(\"Some error occured!\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t})\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<!--手机找回-->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"home1\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-labelledby=\"home1-tab\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"phone_form\" id=\"form_first\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>电话号码：</label> <input id=\"telNum\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"phone_sty\" name=\"telNum\" /> <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"button\" onclick=\"getVerificationCodeByCel()\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"submit_check\" value=\"获取验证码\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"iden\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>证件类型：</label> <select\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"choice_sth2\" name=\"idtfType\" id=\"idtfType1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"护照\">护照</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"身份证\">身份证</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>证件号码：</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"idtfNum\" class=\"phone_sty\" id=\"idtfNum1\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>验证码：</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"code2\" class=\"check_sty\" /> <img src=\"images/2.jpg\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twidth=\"100px\" height=\"42px\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>手机验证号码：</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tname=\"code\" class=\"phone_sty\" id=\"celCode\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"finnal\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><input type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"提交\" class=\"sub_button\" onclick=\"testConditionByCel()\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!--\t邮箱找回-->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t\tfunction testConditionByMail(){\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t/* window.location.href=\"setNewPasswordPage\";\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.navigate(\"setNewPasswordPage\");\n");
      out.write("\t\t\t\t\t\t\t\t\tselt.location=\"setNewPasswordPage\"; */\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\tvar mail = document.getElementById(\"mail\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\tvar idtfType =  document.getElementById(\"idtfType2\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\tvar idtfNum =  document.getElementById(\"idtfNum2\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\tvar code =  document.getElementById(\"mailCode\").value;\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\talert(mail+\":\"+idtfType+\":\"+idtfNum+\":\"+code);\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype:\"post\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\turl:\"retrievePasswordByMail\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdataType:\"text\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata:{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"mail\":mail,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"idtfType\":idtfType,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"idtfNum\":idtfNum,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"code\":code\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsuccess:function(result){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"result:\"+result);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(result==1){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\talert(\"jump to ...\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\twindow.location.href=\"setNewPasswordPage\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//window.navigate(\"setNewPasswordPage\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//selt.location=\"setNewPasswordPage\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t//top.location=\"\";\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else if(result==2){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"MAIL is dismatch with the info.\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else if(result==3){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"Verification is not correct!\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else if(result==0){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"TEL is not exist!\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"succeed to send but error when receive info.\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\terror:function(XMLHttpRequest, textStatus, errorThrown){\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(\"error!\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(XMLHttpRequest);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(textStatus);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log( errorThrown);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\talert(\"Some error occured!\");\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t})\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane fade\" id=\"w3bsd\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-labelledby=\"w3bsd-tab\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"home1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-labelledby=\"home1-tab\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"phone_form\" id=\"form_second\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>邮箱号码：</label> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"mail\" class=\"phone_sty\" name=\"mail\" /> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"varifycodecheck\" value=\"获取验证码\" onclick=\"getVerificationCodeByMail()\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"iden\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>证件类型：</label> <select\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"choice_sth2\" name=\"idtfType\" id=\"idtfType2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"护照\">护照</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"身份证\">身份证</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>证件号码：</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"idtfNum\" class=\"phone_sty\" id=\"idtfNum2\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>验证码：</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"idenNumber2\" class=\"check_sty\" /> <img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"images/2.jpg\" width=\"100px\" height=\"42px\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"phone_number4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>*</span><label>邮件验证号码：</label> <input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"idenEmail\" class=\"phone_sty\" id=\"mailCode\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"finnal\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><input type=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"提交\" onclick=\"testConditionByMail()\" /></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"cuttingLine1\">\n");
      out.write("\t\t\t<div class=\"tm-section-header\">\n");
      out.write("\t\t\t\t<!--<hr />-->\n");
      out.write("\t\t\t\t<h1 class=\"tm-section-title\"style=\"font-family:'century gothic';\">ABOUT US</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<hr\n");
      out.write("\t\t\t\tstyle=\"height: 1px; border: none; border-top: 1px dashed #0066CC; width: 200px; margin-top: -20PX;\" />\n");
      out.write("\t\t\t<hr\n");
      out.write("\t\t\t\tstyle=\"height: 1px; border: none; border-top: 1px dashed #0066CC; width: 200px; margin-top: -20PX; margin-right: -250px;\" />\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- footer -->\n");
      out.write("\t\t<footer id=\"footerContainer\">\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"quicklinks\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footerh\">相关链接</h4>\n");
      out.write("\t\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">企业差旅索引</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">网络社会征信网</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-angle-right\"></i> <a href=\"#\">加盟合作</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"quickcontact\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footerh\">联系我们</h4>\n");
      out.write("\t\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-phone\"></i> 123456789</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-envelope\"></i> abc@website.com</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"fa fa-map-marker\"></i> 2B Barcelon, Newyork\n");
      out.write("\t\t\t\t\t\t\t\t\t-32011</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"follow\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footerh\">微信公众号</h4>\n");
      out.write("\t\t\t\t\t\t\t<br /> <img src=\"images/er_ctrip_wechat.jpg\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<div class=\"row\" style=\"background: white;\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<p style=\"color: black;\">Copyright &copy; 2017.Company name All\n");
      out.write("\t\t\t\t\t\trights reserved.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"toTopButton\"></div>\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t<!-- //footer -->\n");
      out.write("\t\t<!-- Bootstrap Core JavaScript -->\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
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