/* 
Função em javaScript para validar a senha na web.
 */
function validarSenha(input) {
    if (input.value !== document.getElementById("senha").value) {
        input.setCustomValidity('Repita a senha');
    } else {
        input.setCustomValidity('');
    }
}


