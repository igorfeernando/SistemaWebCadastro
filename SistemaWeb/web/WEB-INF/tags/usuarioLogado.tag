<%-- 
  Tag que mostra no rodapé se o usuário foi logado ou não.
--%>

<%@tag body-content="empty" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
    <c:when test="${nomeCompleto != null}">
        Usuario logado:${nomeCompleto}
    </c:when>
    <c:otherwise>
        Usuario nao logado
    </c:otherwise>
</c:choose>