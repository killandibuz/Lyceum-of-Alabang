/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2016-01-07 15:17:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftoken_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.release();
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
      response.setContentType("text/html");
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
      out.write("  <!--Import Google Icon Font-->\r\n");
      out.write("  <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("  <!--Import materialize.css-->\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("  <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div class=\"nav-wrapper white\">\r\n");
      out.write("\t\t  <a href=\"#!\" class=\"brand-logo left\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/pictures/icon.png\"> </a>\r\n");
      out.write("\t\t  <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("\t\t    <li><a href=\"about.jsp\" class=\"yellow-text text-darken-2\"><i class=\"material-icons left\">info</i>ABOUT</a></li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<p id=\"prelude\">\r\n");
      out.write("\t<h1 class=\"white-text light\" style=\"text-shadow: 2px 2px 8px #000000;\">Physical Education</h1>\r\n");
      out.write("\t<h5 class=\"grey-text text-lighten-3 light\" style=\"text-shadow: 2px 2px 4px #000000;\">Learn through your computer!</h5>\r\n");
      out.write("\t<br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row white z-depth-4\" id=\"LogInBg\">\r\n");
      out.write("\t\t<h4 class=\"col s12 yellow-text text-darken-2\"> Log In</h4>\r\n");
      out.write("\t\t<form class=\"col s12\" action=\"loginSubmit\" method=\"post\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005ftoken_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"input-field col s12\">\r\n");
      out.write("\t\t\t\t\t<input id=\"first_name\" type=\"text\" class=\"validate\" name=\"account.strUsername\">\r\n");
      out.write("\t\t\t\t\t<label for=\"first_name\">Username</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"input-field col s12\">\r\n");
      out.write("\t\t\t\t\t<input id=\"last_name\" type=\"password\" class=\"validate\" name=\"account.strPassword\">\r\n");
      out.write("\t\t\t\t\t<label for=\"last_name\">Password</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col s6\">\r\n");
      out.write("\t\t\t\t\t<a class=\"waves-effect waves-light btn light-green darken-3\" href=\"");
      out.print(request.getContextPath());
      out.write("/signup\"><i class=\"material-icons right\">assignment</i>register</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col s6\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"action\">LOG IN\r\n");
      out.write("\t\t\t\t\t<i class=\"material-icons right\">send</i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col s12\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col s12\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Forgot password?</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row white\" id=\"icons\">\r\n");
      out.write("\t  <div class=\"col s12 m4\">\r\n");
      out.write("\t    <div class=\"icon-block\">\r\n");
      out.write("\t      <h2 class=\"center yellow-text text-darken-2\"><i class=\"material-icons large\">flash_on</i></h2>\r\n");
      out.write("\t      <h5 class=\"center\">Speeds up development</h5>\r\n");
      out.write("\r\n");
      out.write("\t      <p class=\"light\">We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.</p>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\r\n");
      out.write("\t  <div class=\"col s12 m4\">\r\n");
      out.write("\t    <div class=\"icon-block\">\r\n");
      out.write("\t      <h2 class=\"center yellow-text text-darken-2\"><i class=\"material-icons large\">group</i></h2>\r\n");
      out.write("\t      <h5 class=\"center\">User Experience Focused</h5>\r\n");
      out.write("\r\n");
      out.write("\t      <p class=\"light\">By utilizing elements and principles of Material Design, we were able to create a framework that incorporates components and animations that provide more feedback to users. Additionally, a single underlying responsive system across all platforms allow for a more unified user experience.</p>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\r\n");
      out.write("\t  <div class=\"col s12 m4\">\r\n");
      out.write("\t    <div class=\"icon-block\">\r\n");
      out.write("\t      <h2 class=\"center yellow-text text-darken-2\"><i class=\"material-icons large\">settings</i></h2>\r\n");
      out.write("\t      <h5 class=\"center\">Easy to work with</h5>\r\n");
      out.write("\r\n");
      out.write("\t      <p class=\"light\">We have provided detailed documentation as well as specific code examples to help new users get started. We are also always open to feedback and can answer any questions a user may have about Materialize.</p>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t body {\r\n");
      out.write("\t \tbackground-size: cover;\r\n");
      out.write("\t    background-image:url('");
      out.print(request.getContextPath());
      out.write("/pictures/Login2.jpg');\r\n");
      out.write("\t    background-repeat: no-repeat;\r\n");
      out.write("\t    background-attachment: fixed;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t#LogInBg{\r\n");
      out.write("\t\tborder-radius: 10px;\r\n");
      out.write("\t\twidth: 600px;\r\n");
      out.write("\t\theight: 300px;\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tright: 0;\r\n");
      out.write("\t\ttop: 20%;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#prelude{\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tleft: 5%;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("  <!--Import jQuery before materialize.js-->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/materialize.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("<footer class=\"page-footer yellow darken-2\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col l6 s12 yellow darken-2\">\r\n");
      out.write("                <h5 class=\"white-text\">Follow us!</h5>\r\n");
      out.write("                <p class=\"grey-text text-lighten-4\">Like, share, learn!</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col l4 offset-l2 s12 yellow darken-2\">\r\n");
      out.write("                <h5 class=\"white-text\">Links</h5>\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.facebook.com/LyceumOfAlabang</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.twitter.com/@lyceumOfAlabang</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.LyceumofAlabang.edu</a></li>\r\n");
      out.write("                  <li><a class=\"grey-text text-lighten-3\" href=\"#!\">www.instagram.com/@LyceumOfAlabang</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"footer-copyright\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("            (c) 2015 Copyright\r\n");
      out.write("            <a class=\"grey-text text-lighten-4 right\" href=\"#!\">More Links</a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</html>\r\n");
      out.write("        ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005ftoken_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:token
    org.apache.struts2.views.jsp.ui.TokenTag _jspx_th_s_005ftoken_005f0 = (org.apache.struts2.views.jsp.ui.TokenTag) _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.get(org.apache.struts2.views.jsp.ui.TokenTag.class);
    _jspx_th_s_005ftoken_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftoken_005f0.setParent(null);
    int _jspx_eval_s_005ftoken_005f0 = _jspx_th_s_005ftoken_005f0.doStartTag();
    if (_jspx_th_s_005ftoken_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.reuse(_jspx_th_s_005ftoken_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftoken_005fnobody.reuse(_jspx_th_s_005ftoken_005f0);
    return false;
  }
}
