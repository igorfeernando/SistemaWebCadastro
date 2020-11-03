<%-- 
  Após o login será aberto a página do cabeçalho que contem a opção lista usuários e sair.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <link rel="stylesheet" href="css/estilos.css" >
        <script src="js/funcoes.js"></script>
    </head>
    <body>
        <div id="todosite">
            <div id="cabecalho">
                <header>
                    <h1>Bem - Vindo !</h1>

                </header>
            </div>
            <div id="conteudo">
      
                <div id="menus">
                    <nav>
                    
                        <ol>
                            <h1><a href="Usuario?campoapesquisar=nomecompleto&acao=listarUsuario&ordenacao=nomecompleto&numpagina=1">Lista Usuário</h1><br>
                            
                            <h1><a href="Sair">Sair</a></h1>
                            
                          
                        </ol>
                    </nav>
                </div>
                <div id="central">
                  
                   
                   