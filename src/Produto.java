public class Produto {

    private final int id;
    private static int proximoId = 1;
    private int estoque; // deixar assim por equanto
    private double preco;
    private String nome;
    private String descricao;

    public Produto(String nome, String descricao, double preco, int estoque){
        this.id = proximoId++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco){
        if(preco < 0)
            System.out.println("ERRO");
        else
            this.preco = preco;

    }

    public void setEstoque(int estoque) {
        if(estoque < 0)
            System.out.println("ERRO");
        else
            this.estoque = estoque;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s - R$ %.2f (estoque: %d)", id, nome, preco, estoque);
    }
}
