package Usuarios;

public class Usuario {

    private String nome, senha;
    protected boolean acessoEstoque = false;

    public Usuario() {
    }

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(String senha){
        return this.senha != null && this.senha.equals(senha);
    }

    public boolean hasAcessoEstoque(){return acessoEstoque;}

}
