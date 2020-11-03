package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaUsuariosTablePaginada_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();

    try {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    int limite = 10;
    String numPagina = request.getParameter("numpagina");
    if (numPagina == null) {
        numPagina = "1";
    }


    java.util.List listaDeUsuarios = (java.util.List) request.getAttribute("sessaoListaUsuarioPaginada");
    String ordenacao = request.getParameter("ordenacao");
    if (ordenacao == null)
        ordenacao = "nomecompleto";
    
    String pesquisa = request.getParameter("pesquisa");
    if (pesquisa == null)
        pesquisa = "";
    String campoapesquisar = request.getParameter("campoapesquisar");
    if (campoapesquisar == null)
        campoapesquisar = "nomecompleto"; 
    
    
    out.println("<table>");
    out.println("<form action='Usuario' method='get' >");
    out.println("<tr><td colspan='6'>Localizar por: ");
    out.println("<select name='campoapesquisar'>");
    if (campoapesquisar.equals("nomecompleto"))
        out.println("<option value='nomecompleto' selected='selected'>Nome Completo</option>");
    else 
        out.println("<option value='nomecompleto'>Nome Completo</option>");
    
    if (campoapesquisar.equals("usuario"))
        out.println("<option value='usuario' selected='selected'>Usuário</option>");
    else
        out.println("<option value='usuario' >Usuário</option>");
    
    if (campoapesquisar.equals("nivel"))
        out.println("<option value='nivel' selected='selected'>Nivel</option>");
    else
        out.println("<option value='nivel'>Nivel</option>");
    out.println("</select>");
    out.println("<input type='text' name='pesquisa' value='"+pesquisa+"'/>");
    out.println("<input type='hidden' name='acao' value='listarUsuario'/>");
    out.println("<input type='image' src='imagens/localizar.png'/></td></tr>");
    out.println("</form>");
    out.println("<tr><td colspan='3'><a href='usuario.jsp?acao=novo'>Novo Registro</a></td><td colspan='3'>");
    out.println("<tr class='linhaespecialTable'>");
    out.println("<td><a href='Usuario?&pesquisa="+pesquisa+"&campoapesquisar="+campoapesquisar+"&acao=listarUsuario&ordenacao=usuario&numpagina=" +Integer.parseInt(numPagina)+"'>Usuário</a></td><td>Senha</td><td><a href='Usuario?&pesquisa="+pesquisa+"&campoapesquisar="+campoapesquisar+"&acao=listarUsuario&ordenacao=nivel&numpagina=" +Integer.parseInt(numPagina)+"'>Nivel</a></td><td><a href='Usuario?&pesquisa="+pesquisa+"&campoapesquisar="+campoapesquisar+"&acao=listarUsuario&ordenacao=nomecompleto&numpagina=" +Integer.parseInt(numPagina)+"'>Nome Completo</a></td><td>Alterar</td><td>Excluir</td>");
    out.println("</tr>");
    int contador = 0;
    for (java.util.Iterator iterator = listaDeUsuarios.iterator(); iterator.hasNext();) {
       sistema.javabean.model.UsuarioModel usuarios = (sistema.javabean.model.UsuarioModel) iterator.next();
  
        if (contador % 2 == 0) {
            out.println("<tr style='background: white'>");
        } else {
            out.println("<tr>");
        }
        String usuario1 = usuarios.getUsuario();
        String senha1 = usuarios.getSenha();
        String nivel = String.valueOf(usuarios.getNivel());
        String nomeCompleto = usuarios.getNomeCompleto();
        out.println("<td>" + usuario1 + "</td>");
        out.println("<td>" + senha1 + "</td>");
        out.println("<td>" + nivel + "</td>");
        out.println("<td>" + nomeCompleto + "</td>");
        out.println("<td><div align='center'><a href='usuario.jsp?acao=alterar&usuario=" + usuario1 + "&senha=" + senha1 + "&nivel=" + nivel + "&nomecompleto=" + nomeCompleto + "'><img src='imagens/altera.png' alt='Altera'/></a></div></td>");
        out.println("<td><div align='center'><a href='Usuario?&numpagina="+Integer.parseInt(numPagina)+"&campoapesquisar="+campoapesquisar+"&pesquisa="+pesquisa+"&acao=excluir&usuario=" + usuario1 + "'><img src='imagens/delete.png' alt='Excluir'/></a></div></td>");
        out.println("</tr>");
        contador++;
    }


    String totalRegistros = (String) request.getAttribute("sessaoqtdTotalRegistros");
   
    
    int totalPaginas = Integer.parseInt(totalRegistros) / limite;
    if (Integer.parseInt(totalRegistros) % limite != 0) {
        totalPaginas++;
    }
   
    out.println("<tr class='linhaespecialTable'><td colspan='6'>");
    int pagAnterior;
    if (Integer.parseInt(numPagina)> 1) {
        pagAnterior = Integer.parseInt(numPagina) - 1;
        out.println("<a href=Usuario?campoapesquisar="+campoapesquisar+"&pesquisa="+pesquisa+"&ordenacao="+ordenacao+"&acao=listarUsuario&numpagina=" + pagAnterior + ">Anterior</a>");
    }

    for (int i = 1; i <= totalPaginas; i++) {
        if (i == Integer.parseInt(numPagina)) {
            out.println("");
        } else {
            out.println("<a href=Usuario?campoapesquisar="+campoapesquisar+"&pesquisa="+pesquisa+"&ordenacao="+ordenacao+"&acao=listarUsuario&numpagina=" + i + ">" + i + "</a>");
        }
    }

    int proximaPag;
    if ((Integer.parseInt(totalRegistros) - (Integer.parseInt(numPagina) * limite)) > 0) {
        proximaPag = Integer.parseInt(numPagina) + 1;
        out.println("<a href=Usuario?campoapesquisar="+campoapesquisar+"&pesquisa="+pesquisa+"&ordenacao="+ordenacao+"&acao=listarUsuario&numpagina=" + proximaPag + ">Proxima</a>");
    }
    out.println("Total de Registros: " + totalRegistros );
    out.println("</table>");


    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
