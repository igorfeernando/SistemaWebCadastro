
<%-- 
  Tag para mostrar a data atual que o usu�rio esta acessando o sistema.
--%>

<%@tag body-content="empty" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="dataatual" class="java.util.Date"/>
<fmt:formatDate value="${dataatual}" pattern="dd/MM/yyyy" type="date"/>