<%-- 
   Tela que utiliza as views cabeçalho e rodapé com os links "usuário" é "sair", passando 
pela verificação de acesso e a tabela que lista os usuários já cadastrados.
--%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tagsIgor" %>
<tagsIgor:verificaSessao/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp"/>

<tagsIgor:listaUsuariosTablePaginada/>
<c:import url="rodape.jsp"/>
