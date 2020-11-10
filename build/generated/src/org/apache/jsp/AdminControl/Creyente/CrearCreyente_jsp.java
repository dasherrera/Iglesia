package org.apache.jsp.AdminControl.Creyente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CrearCreyente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"imagen.png\" />\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <!--Estilos -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Main1.css\">\n");
      out.write("\n");
      out.write("        <!--Palabras clave-->\n");
      out.write("        <meta name=\"description\" content=\"Pulse Iclesia jsp Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"pulse, Formularios, creative, jsp for DashCode\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"Description\" content=\"Esta es una pagina de vlog & REGISTRO para Iclesia\">\n");
      out.write("        <meta name=\"Author\" content=\"Daniel santiago Herrera Martinez\">\n");
      out.write("        <meta name=\"Author\" content=\"DASHCODE CORP\">\n");
      out.write("        <title>Iclesia</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form action=\"action\"  method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"Nombre\" id=\"Nombre\" class=\"form-check-input form-control\"/>\n");
      out.write("            <input type=\"text\" name=\"Apellido\" id=\"Nombre\" class=\"form-check-input form-control\"/>\n");
      out.write("            <input type=\"number\" name=\"telefono\" id=\"Nombre\" class=\"form-control form-control\"/>\n");
      out.write("            <input type=\"text\" name=\"Direccion\" id=\"Nombre\" class=\"form-check-input form-control\"/>\n");
      out.write("            <input type=\"text\" name=\"Nombre\" id=\"Nombre\" class=\"form-check-input form-control\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
