<%-- 
  Tag que testa a valida��o da senha com o banco de dados.
--%>

<%@tag body-content="empty" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
    <c:when test="${mensagem != null}">
        ${mensagem}
    </c:when>
    <c:otherwise>
       Usu�rio e Senha    
    </c:otherwise>
</c:choose>