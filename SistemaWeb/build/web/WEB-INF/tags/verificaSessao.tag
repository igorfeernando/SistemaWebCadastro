
<%-- 
  Tag que verifica a sessão de login usuário e senha com banco de dados, avaliando toda 
a tabela do login de acesso.
--%>


<%@tag body-content="empty" %>
<%
    if (session.getAttribute("sessaoUsuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>