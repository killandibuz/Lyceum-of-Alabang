/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2016-01-01 19:26:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class grades_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <!--Import Google Icon Font-->\r\n");
      out.write("  <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("  <!--Import materialize.css-->\r\n");
      out.write("  <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\r\n");
      out.write("\r\n");
      out.write("  <!--Let browser know website is optimized for mobile-->\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("  <ul id=\"dropdown1\" class=\"dropdown-content\">\r\n");
      out.write("\t\t<li><a href=\"#!\">Settings</a></li>\r\n");
      out.write("\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t<li><a href=\"#!\">Log out</a></li>\r\n");
      out.write("\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t<li><a href=\"#!\">Anything</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<div class=\"nav-wrapper white\">\r\n");
      out.write("\t\t  <a href=\"#!\" class=\"brand-logo left\"><img src=\"./pictures/icon.png\"> </a>\r\n");
      out.write("\t\t  <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("\t\t    <li><a href=\"home.jsp\" class=\"yellow-text text-darken-2\"><i class=\"material-icons\">list</i></a></li>\r\n");
      out.write("\t\t    <li class=\"yellow darken-2\"><a href=\"grades.jsp\" class=\"white-text text-darken-2\"><i class=\"material-icons\">grade</i></a></li>\r\n");
      out.write("\t\t    <li><a href=\"quiz.jsp\" class=\"yellow-text text-darken-2\"><i class=\"material-icons\">assignment</i></a></li>\r\n");
      out.write("\t\t    <li><a href=\"message.jsp\" class=\"yellow-text text-darken-2\"><i class=\"material-icons\">email</i></a></li>\r\n");
      out.write("\t\t    <li>\r\n");
      out.write("\t\t\t     <a href=\"about.jsp\" class=\"yellow-text text-darken-2 small dropdown-button\" data-activates=\"dropdown1\">\r\n");
      out.write("\t\t\t    <img src=\"./pictures/pictureSample.jpg\" class=\"circle\" alt=\"picture\" height=\"42\" width=\"42\" align=\"middle\"></a>\r\n");
      out.write("\t\t    </li>\r\n");
      out.write("\t\t  </ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$( document ).ready(function){\r\n");
      out.write("\t\t\t$(\".dropdown-button\").dropdown();        \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</nav>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"flex-container\">\r\n");
      out.write("\t\t<div id=\"infoTab\" class=\"flexItemInfoTab white\">\r\n");
      out.write("\t\t\t<h2 class=\"yellow-text text-darken-2\">Info Tab</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"mainTab\" class=\"flexItemMainTab white\">\r\n");
      out.write("\t\t\t<h2 class=\"yellow-text text-darken-2\">Grades</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"sideTab\" class=\"flexItemSideTab white\">\r\n");
      out.write("\t\t\t<h2 class=\"yellow-text text-darken-2\">Side Tab</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t body {\r\n");
      out.write("\t \tbackground-size: cover;\r\n");
      out.write("\t    background-image:url('./pictures/Login2.jpg');\r\n");
      out.write("\t    background-repeat: no-repeat;\r\n");
      out.write("\t    background-attachment: fixed;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.flex-container {\r\n");
      out.write("    display: -webkit-flex;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 1000px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.flexItemInfoTab{\r\n");
      out.write("\t    background-color: white;\r\n");
      out.write("\t    width: 20%;\r\n");
      out.write("\t    height: 900px;\r\n");
      out.write("\t    margin: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.flexItemMainTab{\r\n");
      out.write("\t    background-color: white;\r\n");
      out.write("\t    width: 60%;\r\n");
      out.write("\t    height: 900px;\r\n");
      out.write("\t    margin: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.flexItemSideTab{\r\n");
      out.write("\t    background-color: white;\r\n");
      out.write("\t    width: 20%;\r\n");
      out.write("\t    height: 900px;\r\n");
      out.write("\t    margin: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("  <!--Import jQuery before materialize.js-->\r\n");
      out.write("  <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\r\n");
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
}
