/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.12
 * Generated at: 2024-09-23 07:08:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.decorators;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import LapTrinhWeb_Cha.models.UserModel;
import LapTrinhWeb_Cha.controllers.WaitingController;

public final class web_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1725414053777L));
    _jspx_dependants.put("jar:file:/D:/SpringToolSuite/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/LapTrinhWeb/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664428278000L));
    _jspx_dependants.put("/commons/web/header.jsp", Long.valueOf(1727075329366L));
    _jspx_dependants.put("/commons/web/footer.jsp", Long.valueOf(1727070547877L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("LapTrinhWeb_Cha.controllers.WaitingController");
    _jspx_imports_classes.add("LapTrinhWeb_Cha.models.UserModel");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Zay Shop eCommerce HTML CSS Template</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\"\r\n");
      out.write("	href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<!-- Load fonts style after rendering the layout styles -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&amp;display=swap\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<!--\r\n");
      out.write("    \r\n");
      out.write("TemplateMo 559 Zay Shop\r\n");
      out.write("\r\n");
      out.write("https://templatemo.com/tm-559-zay-shop\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

// Giáº£ sá»­ báº¡n ÄÃ£ lÆ°u Äá»i tÆ°á»£ng user trong session khi ngÆ°á»i dÃ¹ng ÄÄng nháº­p
UserModel account = (UserModel) session.getAttribute("account");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light shadow\">\r\n");
      out.write("	<div\r\n");
      out.write("		class=\"container d-flex justify-content-between align-items-center\">\r\n");
      out.write("\r\n");
      out.write("		<a class=\"navbar-brand text-success logo h1 align-self-center\"\r\n");
      out.write("			href=\"index.html\"> Zay </a>\r\n");
      out.write("\r\n");
      out.write("		<button class=\"navbar-toggler border-0\" type=\"button\"\r\n");
      out.write("			data-bs-toggle=\"collapse\" data-bs-target=\"#templatemo_main_nav\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between\"\r\n");
      out.write("			id=\"templatemo_main_nav\">\r\n");
      out.write("			<div class=\"flex-fill\">\r\n");
      out.write("				<ul class=\"nav navbar-nav d-flex justify-content-between mx-lg-auto\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.html\">Home</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"about.html\">About</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"shop.html\">Shop</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"contact.html\">Contact</a>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"navbar align-self-center d-flex\">\r\n");
      out.write("				<div class=\"d-lg-none flex-sm-fill mt-3 mb-4 col-7 col-sm-auto pr-3\">\r\n");
      out.write("					<div class=\"input-group\">\r\n");
      out.write("						<input type=\"text\" class=\"form-control\" id=\"inputMobileSearch\"\r\n");
      out.write("							placeholder=\"Search ...\">\r\n");
      out.write("						<div class=\"input-group-text\">\r\n");
      out.write("							<i class=\"fa fa-fw fa-search\"></i>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<a class=\"nav-icon d-none d-lg-inline\" href=\"#\"\r\n");
      out.write("					data-bs-toggle=\"modal\" data-bs-target=\"#templatemo_search\"> <i\r\n");
      out.write("					class=\"fa fa-fw fa-search text-dark mr-2\"></i>\r\n");
      out.write("				</a> <a class=\"nav-icon position-relative text-decoration-none\" href=\"#\">\r\n");
      out.write("					<i class=\"fa fa-fw fa-cart-arrow-down text-dark mr-1\"></i> <span\r\n");
      out.write("					class=\"position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark\">7</span>\r\n");
      out.write("				</a>\r\n");
      out.write("				<!--  <a class=\"nav-icon position-relative text-decoration-none\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-fw fa-user text-dark mr-3\"></i>\r\n");
      out.write("                        <span class=\"position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark\">+99</span>\r\n");
      out.write("                    </a> -->\r\n");
      out.write("\r\n");
      out.write("				");

				if (account != null) {
				
      out.write("\r\n");
      out.write("				<div class=\"dropdown\">\r\n");
      out.write("					<button\r\n");
      out.write("						class=\"btn btn-secondary dropdown-toggle nav-icon position-relative text-decoration-none\"\r\n");
      out.write("						type=\"button\" id=\"dropdownMenuButton\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("						aria-expanded=\"false\">\r\n");
      out.write("						<i class=\"fa fa-fw fa-user text-dark mr-3\"></i> <span\r\n");
      out.write("							class=\"position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark\">+99</span>\r\n");
      out.write("					</button>\r\n");
      out.write("					<ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logout'>Logout</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/profile'>Edit\r\n");
      out.write("								Profile</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<div>\r\n");
      out.write("		<sitemesh:write property=\"body\" />\r\n");
      out.write("	</div>\r\n");
      out.write("	<div>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("<footer class=\"bg-dark\" id=\"tempaltemo_footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4 pt-5\">\r\n");
      out.write("                    <h2 class=\"h2 text-success border-bottom pb-3 border-light logo\">Zay Shop</h2>\r\n");
      out.write("                    <ul class=\"list-unstyled text-light footer-link-list\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"fas fa-map-marker-alt fa-fw\"></i>\r\n");
      out.write("                            123 Consectetur at ligula 10660\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"fa fa-phone fa-fw\"></i>\r\n");
      out.write("                            <a class=\"text-decoration-none\" href=\"tel:010-020-0340\">010-020-0340</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <i class=\"fa fa-envelope fa-fw\"></i>\r\n");
      out.write("                            <a class=\"text-decoration-none\" href=\"mailto:info@company.com\">info@company.com</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4 pt-5\">\r\n");
      out.write("                    <h2 class=\"h2 text-light border-bottom pb-3 border-light\">Products</h2>\r\n");
      out.write("                    <ul class=\"list-unstyled text-light footer-link-list\">\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Luxury</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Sport Wear</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Men's Shoes</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Women's Shoes</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Popular Dress</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Gym Accessories</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Sport Shoes</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-4 pt-5\">\r\n");
      out.write("                    <h2 class=\"h2 text-light border-bottom pb-3 border-light\">Further Info</h2>\r\n");
      out.write("                    <ul class=\"list-unstyled text-light footer-link-list\">\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">About Us</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Shop Locations</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">FAQs</a></li>\r\n");
      out.write("                        <li><a class=\"text-decoration-none\" href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row text-light mb-4\">\r\n");
      out.write("                <div class=\"col-12 mb-3\">\r\n");
      out.write("                    <div class=\"w-100 my-3 border-top border-light\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-auto me-auto\">\r\n");
      out.write("                    <ul class=\"list-inline text-left footer-icons\">\r\n");
      out.write("                        <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                            <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"http://facebook.com/\"><i class=\"fab fa-facebook-f fa-lg fa-fw\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                            <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"https://www.instagram.com/\"><i class=\"fab fa-instagram fa-lg fa-fw\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                            <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"https://twitter.com/\"><i class=\"fab fa-twitter fa-lg fa-fw\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                            <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"https://www.linkedin.com/\"><i class=\"fab fa-linkedin fa-lg fa-fw\"></i></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-auto\">\r\n");
      out.write("                    <label class=\"sr-only\" for=\"subscribeEmail\">Email address</label>\r\n");
      out.write("                    <div class=\"input-group mb-2\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control bg-dark border-light\" id=\"subscribeEmail\" placeholder=\"Email address\">\r\n");
      out.write("                        <div class=\"input-group-text btn-success text-light\">Subscribe</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w-100 bg-black py-3\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row pt-2\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <p class=\"text-left text-light\">\r\n");
      out.write("                            Copyright © 2021 Company Name \r\n");
      out.write("                            | Designed by <a rel=\"sponsored\" href=\"https://templatemo.com\" target=\"_blank\">TemplateMo</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start Script -->\r\n");
      out.write("	<script src=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("	<script src=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("	<script src=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("	<script src=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("	<script src=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("	<!-- End Script -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005furl_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/decorators/web.jsp(11,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("templates/web/assets/img/apple-icon.png");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/decorators/web.jsp(13,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("templates/web/assets/img/favicon.ico");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /WEB-INF/decorators/web.jsp(15,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("templates/web/assets/css/bootstrap.min.css");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /WEB-INF/decorators/web.jsp(16,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("templates/web/assets/css/templatemo.css");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /WEB-INF/decorators/web.jsp(17,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("templates/web/assets/css/custom.css");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f5_reused = false;
    try {
      _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f5.setParent(null);
      // /WEB-INF/decorators/web.jsp(22,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f5.setValue("templates/web/assets/css/fontawesome.min.css");
      int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
      if (_jspx_th_c_005furl_005f5.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      _jspx_th_c_005furl_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f5, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f6_reused = false;
    try {
      _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f6.setParent(null);
      // /WEB-INF/decorators/web.jsp(44,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f6.setValue("templates/web/assets/js/jquery-1.11.0.min.js");
      int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
      if (_jspx_th_c_005furl_005f6.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      _jspx_th_c_005furl_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f6, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f7_reused = false;
    try {
      _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f7.setParent(null);
      // /WEB-INF/decorators/web.jsp(45,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f7.setValue("templates/web/assets/js/jquery-migrate-1.2.1.min.js");
      int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
      if (_jspx_th_c_005furl_005f7.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      _jspx_th_c_005furl_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f7, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f8_reused = false;
    try {
      _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f8.setParent(null);
      // /WEB-INF/decorators/web.jsp(46,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f8.setValue("templates/web/assets/js/bootstrap.bundle.min.js");
      int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
      if (_jspx_th_c_005furl_005f8.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      _jspx_th_c_005furl_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f8, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f9_reused = false;
    try {
      _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f9.setParent(null);
      // /WEB-INF/decorators/web.jsp(47,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f9.setValue("templates/web/assets/js/templatemo.js");
      int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
      if (_jspx_th_c_005furl_005f9.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      _jspx_th_c_005furl_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f9, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f10_reused = false;
    try {
      _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f10.setParent(null);
      // /WEB-INF/decorators/web.jsp(48,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f10.setValue("templates/web/assets/js/custom.js");
      int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
      if (_jspx_th_c_005furl_005f10.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      _jspx_th_c_005furl_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f10, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f10_reused);
    }
    return false;
  }
}
