<%-- 
   Tela que utiliza as views cabe�alho e rodap� com os links "usu�rio" � "sair", passando 
pela verifica��o de acesso e a tabela que lista os usu�rios j� cadastrados.
--%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tagsIgor" %>
<tagsIgor:verificaSessao/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp"/>

<tagsIgor:listaUsuariosTablePaginada/>
<c:import url="rodape.jsp"/>
