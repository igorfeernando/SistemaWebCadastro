<%-- 
  Instruções do rodapé com utilização das tags usuário logado e a data de acesso.
--%>

<%@taglib tagdir="/WEB-INF/tags/" prefix="tagsIgor" %>
</div>
            </div>
            <div id="rodape">
                <footer>
                    <h2> <tagsIgor:usuarioLogado/>  / Data de Acesso: <tagsIgor:dataHoje/></h2>
                </footer>
            </div>
        </div>
    </body>
   
</html>

