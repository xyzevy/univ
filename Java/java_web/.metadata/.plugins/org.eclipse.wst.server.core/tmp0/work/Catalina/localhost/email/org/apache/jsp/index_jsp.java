/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2017-07-18 14:46:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"urf-8\">\r\n");
      out.write("\t\t<meta name=\"Keywords\" content=\"\">\r\n");
      out.write("\t\t<meta name=\"Description\" content=\"\">\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t*{\r\n");
      out.write("\t\t\t\tmargin:0;\r\n");
      out.write("\t\t\t\tpadding:0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbody{background:url(\"images/bg.jpg\");background-size:cover;}\r\n");
      out.write("\t\t\t.box{background:#00ffff;}\r\n");
      out.write("\t\t\t.box .content{width:1000px;height:60px;background:#cc3300;margin:auto;}\r\n");
      out.write("\t\t\t.box .content span{font-size:20px;font-weight:700px;float:right;line-height:62px;}\r\n");
      out.write("\r\n");
      out.write("\t\t\t.center{width:640px;height:350px;margin:60px;/*background:#33ff66;*/}\r\n");
      out.write("\t\t\t.center p span{font-size:16px;line-height:50px;}\r\n");
      out.write("\t\t\t.center .c-con{width:510px;height:30px;}\r\n");
      out.write("\t\t\t.center .c-text{width:510px;height:144px;}\r\n");
      out.write("\t\t\t.center .c-btn{width:510px;height:40px;margin-left:64px;border:none;outline:none;font-size:16px;border-radius:4px;box-shadow:1px 1px 4px #000;}\r\n");
      out.write("\t\t\t.center .c-btn:hover{background:-webkit-repeating-linear-gradient(45deg,#fff 10px,#eee 20px,#eee 30px,#fff 40px);border-radius:20px;transition:0.3s;animation:bg 10s linear infinite;}\r\n");
      out.write("\t\t\t/*\tå®ä¹å³é®å¸§\t\t*/\r\n");
      out.write("\t\t\t@keyframe bg{\r\n");
      out.write("\t\t\t\tfrom{background-position:0 0;}\r\n");
      out.write("\t\t\t\tto{background-position:1000px 0;}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- start box -->\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<!-- imgå¾çæ ç­¾åè¦ç´ ï¼srcè·¯å¾ width height alt æµè§å¨æ¸²æ å¿«0.3s altä¼å -->\r\n");
      out.write("\t\t\t\t<img src=\"images/logo.gif\">\r\n");
      out.write("\t\t\t\t<span>Javaå¼åé®ä»¶ç¾¤åç³»ç»</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end box -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- start center -->\r\n");
      out.write("\t\t<form action=\"/mail\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<span>æ¶ä»¶äººï¼</span><input type=\"text\" class=\"c-con\" name=\"m_name\">\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<span>ä¸»&emsp;é¢ï¼</span><input type=\"text\" class=\"c-con\" name=\"m_topic\">\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<span>æ­£&emsp;æï¼</span><input type=\"text\" class=\"c-text\" name=\"m_con\">\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"åéé®ä»¶\" class=\"c-btn\">\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
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
