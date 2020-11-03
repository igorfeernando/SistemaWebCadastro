/*
Classe model que utiliza os métodos get e set,sendo que o get
pega o atributo é o retorna um valor.
No set pode mudar os valores do atributo, criando o método void sem retorno.

 */

package sistema.javabean.model;


public class UsuarioModel {
    private String usuario=null;
    private String senha=null;
    private int nivel;
    private String nomeCompleto=null;

    public boolean verificaUsuario() {
        if (this.usuario != null && this.senha != null) {
            if (this.usuario.equals("igor") && this.senha.equals("123"))
                return true;
        }
        return false;
    }
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

}
