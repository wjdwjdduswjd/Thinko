/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2021-01-14 05:49:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/workspace/ThinkoGit/Thinko/Thinko/WebContent/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1610503398849L));
    _jspx_dependants.put("jar:file:/C:/workspace/ThinkoGit/Thinko/Thinko/WebContent/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425946270000L));
  }

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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>프로젝트 띵코</title>\r\n");
      out.write("<style>\r\n");
      out.write("*{\r\n");
      out.write("    font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("    color: rgb(37, 37, 37);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid mt-5\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminSide.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t<h2>대시 보드</h2>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"statistic__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"number\">10,368</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"desc\">금일 방문자 수</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"zmdi zmdi-account-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"statistic__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"number\">1,086</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"desc\">총 게시글 수</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"zmdi zmdi-calendar-note\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title-1 m-b-25\">최근 게시글</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"table-responsive table--no-card m-b-40\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table table-borderless table-striped table-earning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>글번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>댓글수</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>좋아요</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>123</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애왕자</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>5</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>10</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>50</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>122</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애 나 제목</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애공주</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>5</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>10</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>50</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title-1 m-b-25\">최근 댓글</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"table-responsive table--no-card m-b-40\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table table-borderless table-striped table-earning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>댓글번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>내용</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>123</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애왕자</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>122</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애 나 제목</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애공주</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title-1 m-b-25\">최근 신고 게시글</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"table-responsive table--no-card m-b-40\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table table-borderless table-striped table-earning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>글번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>신고 횟수</th>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>123</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애왕자</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>50</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>31</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>122</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애 나 제목</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애공주</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>50</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>26</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title-1 m-b-25\">최근 신고 댓글</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"table-responsive table--no-card m-b-40\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table table-borderless table-striped table-earning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>댓글번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>내용</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>신고 횟수</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>123</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애왕자</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>13</td>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>122</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애 나 내용</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>응애공주</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>21-01-13</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>4</td>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
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