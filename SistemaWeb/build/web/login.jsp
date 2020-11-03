<%-- 
    Instruções de acesso ao login com verificação do status do usuário.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="telaparalogin.jsp"/>
<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsIgor" %>
<div id="login">
    <form action="Logar" method="get">
        <table border="1">
            <tr>
                <td colspan="2">Acesso ao Sistema</td>                    
            </tr>
            <tr>
                <td>Usuário:</td>
                <td><input autofocus  autocomplete="on" required="true" type="text" name="usuario"></td>           
            </tr>
            <tr>
                <td>Senha:</td>
                <td><input  required="true" type="password" name="senha"></td>           
            </tr>
            <tr>
                <td><input type="reset" value="Limpar"></td>
                <td><input type="submit" name="acessar" value="Acessar"></td>
            </tr>
            <tr>
                <td colspan="2"><tagsIgor:statusUsuarioSenha/></td>                    
            </tr>

        </table>
    </form>
</div>
<c:import url="rodape.jsp"/>