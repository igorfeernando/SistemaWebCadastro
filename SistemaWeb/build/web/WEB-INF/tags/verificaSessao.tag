
<%-- 
  Tag que verifica a sess�o de login usu�rio e senha com banco de dados, avaliando toda 
a tabela do login de acesso.
--%>


<%@tag body-content="empty" %>
<%
    if (session.getAttribute("sessaoUsuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>