/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-06-03 08:40:00 UTC
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>안녕하세요 서브웨이입니다~~</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <h1>고르세요~ </h1>\r\n");
      out.write("\r\n");
      out.write("    <br><br>\r\n");
      out.write("\r\n");
      out.write("    <!-- \r\n");
      out.write("        서버로 요청 할 때 : 하앙 form태그로 넘겼음(submit 버튼)\r\n");
      out.write("        form 태그에 항상 있어야 하는 것 : action속성(어느 서블릿으로 보낼건지)\r\n");
      out.write("                                        method 속성(get/post)\r\n");
      out.write("    -->\r\n");
      out.write("\r\n");
      out.write("    <form action=\"/Subway/order.do\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>주문자 정보</legend>\r\n");
      out.write("\r\n");
      out.write("            <table>\r\n");
      out.write("                <!-- 4행(tr) 2열(th, hd) -->\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>이름</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userName\" required></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>전화번호</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"phone\" required></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>주소</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"address\" required></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>요청사항</th>\r\n");
      out.write("                    <td><textarea name=\"message\" id=\"\" cols=\"30\" rows=\"15\" style=\"resize: none;\"></textarea></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <legend>주문 정보</legend>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>샌드위치</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"sandwich\">\r\n");
      out.write("                            <option value=\"참치\">참치</option>\r\n");
      out.write("                            <option value=\"에그마요\">에그마요</option>\r\n");
      out.write("                            <option value=\"이탈리안비엠티\">이탈리안비엠티</option>\r\n");
      out.write("                            <option value=\"터키베이컨아보카도\">터키베이컨아보카도</option>\r\n");
      out.write("                            <option value=\"로티세리바베큐치킨\">로티세리바베큐치킨</option>\r\n");
      out.write("                            <option value=\"치즈N스테이크\">치즈N스테이크</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>토핑</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"오이\" checked>오이\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"양배추\" checked>양배추\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"올리브\" checked>올리브\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"할라피뇨\" checked>할라피뇨\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"적양파\" checked>적양파\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"피망\" checked>피망\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"토마토\" checked>토마토\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"렌치\" >렌치\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"후추\" >후추\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"핫칠리\" >핫칠리\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"마요네즈\" >마요네즈\r\n");
      out.write("                        <input type=\"checkbox\" name=\"topping\" value=\"바베큐\" >바베큐\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>과자</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"checkbox\" name=\"cookie\" value=\"라즈베리치즈케잌\">라즈베리치즈케잌\r\n");
      out.write("                        <input type=\"checkbox\" name=\"cookie\" value=\"더블초코칩쿠키\">더블초코칩쿠키\r\n");
      out.write("                        <input type=\"checkbox\" name=\"cookie\" value=\"스모어초코어쩌고\" checked>스모어초코어쩌고\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>결제방식</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"radio\" name=\"payment\" value=\"card\" checked>카드결제\r\n");
      out.write("                        <input type=\"radio\" name=\"payment\" value=\"cash\">현금결제\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"주문\">\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    <hr>\r\n");
      out.write("    <br>\r\n");
      out.write("    <a href=\"/Subway/orderList.sandwich\">주문내역 보기</a>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
