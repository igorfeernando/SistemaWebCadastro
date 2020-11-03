<%-- 
   Tela de altera��o do usu�rio podendo mudar a senha,n�vel, � o nome completo.
--%>
<%@taglib tagdir="/WEB-INF/tags" prefix="tagsIgor" %>
<tagsIgor:verificaSessao/>
<%@taglib tagdir="/WEB-INF/tags" prefix="tagsIgor" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp"/>

<form id="formUsuario" method="get" action="Usuario">
    <c:choose>
        <c:when test="${param.acao eq 'novo'}">
                <h2>Novo Usu�rio</h2><br>                    
                <div class="campos">
                    <label for="usuario">Usu�rio:</label>
                    <input type="text"  name="usuario" required="true" size="10" maxlength="10"/>
                </div><br>
                <div class="campos">
                    <label for="senha">Senha:</label>
                    <input type="password" name="senha"  id="senha" required="true" size="10" maxlength="10"/>
                </div><br>
                <div class="campos">
                    <label for="senha">Repetir Senha:</label>
                    <input oninput="validarSenha(this)" type="password" name="senha1"   required="true" size="10" maxlength="10"/>
                </div><br>
                <div class="campos">
                    <label for="Nivel">Nivel Usu�rio:</label>
                    <input type="number" min="1" max="3" name="nivel"  required="true" size="1" maxlength="1"/> <br>  <br>1-Usu�rio<br>2-Funcion�rio<br> 3-Administrador
                </div><br>
                <div class="campos">
                    <label for="nomecompleto">Nome Completo:</label>
                    <input type="text" name="nomecompleto"  required="true" size="30" maxlength="30"/>
                </div><br>
                <input type="submit" name="acao" value="novo"/>
            </c:when>
            <c:otherwise>
                        <h1>Altera��o do Usu�rio</h1><br>


                    <div class="campos">
                        <label for="usuario">Usu�rio:</label>
                    <input type="text" name="usuario" value="${param.usuario}" readonly="true" size="10"/>
                </div><br>
                <div class="campos">
                    <label for="senha">Senha:</label>
                    <input type="password" name="senha" id="senha" value="${param.senha}" required="true" size="10" maxlength="10"/>
                </div><br>

                <div class="campos">
                    <label for="senha">Repetir Senha:</label>
                    <input oninput="validarSenha(this)"  type="password" name="senha1"  required="true" size="10" maxlength="10"/>
                </div><br>
                <div class="campos">
                    <label for="Nivel">N�vel:</label>
                    <input type="number" min="1" max="3" name="nivel" value="${param.nivel}" required="true" size="1" maxlength="1"/> 1-b�sico, 2-intermedi�rio,3-administrador
                </div><br>
                <div class="campos">
                    <label for="nomecompleto">Nome Completo:</label>
                    <input type="text" name="nomecompleto" value="${param.nomecompleto}" required="true" size="30" maxlength="30"/> 
                </div><br>
                <input type="submit" name="acao" value="alterar"/>
    </c:otherwise>
</c:choose>
</form>
<c:import url="rodape.jsp"/>
