package Usuarios;

public class Garcom extends Usuario{

    public Garcom(){
        super();
        this.acessoEstoque = false;
    }

    public Garcom(String nome, String senha){
        super(nome, senha);
        this.acessoEstoque = false;
    }


}
