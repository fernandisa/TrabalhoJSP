package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Aluno;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 // DENTRO DISSO SE PROGRAMA EM JAVA
            
            Aluno aluno1 = new Aluno ();
            
            aluno1.setMatriculado(true);
            aluno1.setN_disciplina(99);
            aluno1.setN_matricula("20132620124");
            aluno1.setNome("Fernanda");
            
            Aluno aluno2 = new Aluno ();
            
            aluno2.setMatriculado(false);
            aluno2.setN_disciplina(99);
            aluno2.setN_matricula("20134626124");
            aluno2.setNome("Mateus");
            
            Aluno aluno3 = new Aluno ();
            
            aluno3.setMatriculado(true);
            aluno3.setN_disciplina(99);
            aluno3.setN_matricula("20124426514");
            aluno3.setNome("Fabiane");
            
            Aluno aluno4 = new Aluno ();
            
            aluno4.setMatriculado(true);
            aluno4.setN_disciplina(99);
            aluno4.setN_matricula("20144223178");
            aluno4.setNome("Letícia");
            
            
            
            
              String nome;
              String sobrenome;
              String cep;
              String email;
              nome = "Luize";
              sobrenome = "Abreu";
              cep = "0123456789";
              email = "vargasluizeabreu@hotmail.com";
              //Saída
              //out.println(nome + " " + sobrenome);
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Minhas Informações</h1>\n");
      out.write("        <div>\n");
      out.write("            Nome: <span>");
      out.print(aluno1.getNome());
      out.write("</span><br />\n");
      out.write("            Sobrenome: <span> ");
      out.print(sobrenome);
      out.write("</span> <br />\n");
      out.write("            Email: <span>");
      out.print(email );
      out.write("</span><br />\n");
      out.write("            Cep: <span>");
      out.print(cep );
      out.write("</span><br />\n");
      out.write("            Número de Disciplinas: <span> ");
      out.print( aluno1.getN_disciplina() );
      out.write(" </span> <br />\n");
      out.write("            Número da Matrícula: <span> ");
      out.print( aluno1.getN_matricula() );
      out.write(" </span> <br />\n");
      out.write("            Matriculado: <span> ");
      out.print( aluno1.getMatriculado() );
      out.write(" </span> <br />\n");
      out.write("            <table\n");
      out.write("            <tr>\n");
      out.write("\t\t\t\t<td> Matrícula </td>\n");
      out.write("\t\t\t\t<td> Nome </td>\n");
      out.write("\t\t\t\t<td> Disciplinas </td>\n");
      out.write("                                <td> Matriculado </td>\n");
      out.write("                                <td> Ações </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td> <span> ");
      out.print( aluno1.getN_matricula() );
      out.write(" </span>  </td>\n");
      out.write("\t\t\t\t<td> <span>");
      out.print(aluno1.getNome());
      out.write("</span> </td>\n");
      out.write("\t\t\t\t<td><span> ");
      out.print( aluno1.getN_disciplina() );
      out.write(" </span> </td>\n");
      out.write("                                <td><span> ");
      out.print( aluno1.getMatriculado() );
      out.write(" </span> </td>\n");
      out.write("                                <td> <span> Link depois </span> </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td> <span> ");
      out.print( aluno2.getN_matricula() );
      out.write(" </span>  </td>\n");
      out.write("\t\t\t\t<td> <span>");
      out.print(aluno2.getNome());
      out.write("</span> </td>\n");
      out.write("\t\t\t\t<td><span> ");
      out.print( aluno2.getN_disciplina() );
      out.write(" </span> </td>\n");
      out.write("                                <td><span> ");
      out.print( aluno2.getMatriculado() );
      out.write(" </span> </td>\n");
      out.write("                                <td> <span> Link depois </span> </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td> <span> ");
      out.print( aluno3.getN_matricula() );
      out.write(" </span>  </td>\n");
      out.write("\t\t\t\t<td> <span>");
      out.print(aluno3.getNome());
      out.write("</span> </td>\n");
      out.write("\t\t\t\t<td><span> ");
      out.print( aluno3.getN_disciplina() );
      out.write(" </span> </td>\n");
      out.write("                                <td><span> ");
      out.print( aluno3.getMatriculado() );
      out.write(" </span> </td>\n");
      out.write("                                <td> <span> Link depois </span> </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td> <span> ");
      out.print( aluno4.getN_matricula() );
      out.write(" </span>  </td>\n");
      out.write("\t\t\t\t<td> <span>");
      out.print(aluno4.getNome());
      out.write("</span> </td>\n");
      out.write("\t\t\t\t<td><span> ");
      out.print( aluno4.getN_disciplina() );
      out.write(" </span> </td>\n");
      out.write("                                <td><span> ");
      out.print( aluno4.getMatriculado() );
      out.write(" </span> </td>\n");
      out.write("                                <td> <span> Link depois </span> </td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</table>\n");
      out.write("\t\n");
      out.write("        </div>    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
