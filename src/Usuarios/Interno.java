package Usuarios;

public class Interno extends Usuario{

    public Interno() {
        super();
        this.acessoEstoque = true;
    }

    public Interno(String nome, String senha){
        super(nome, senha);
        this.acessoEstoque = true;
    }

}
