public class Produto {

    private int id = 0;
    private int estoque; // deixar assim por equanto
    private double preco;
    private String nome;

    public Produto(){
        id++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("ERRO: PRECO INVALIDO");
        }else {
            this.preco = preco;
        }
    }

    public void setEstoque(int estoque) {
        if(estoque < 0) {
            System.out.println("ERRO: VALOR PARA ESTOQUE INVALIDO");
        }else{
            this.estoque = estoque;
        }
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getEstoque() {
        return estoque;
    }

}
