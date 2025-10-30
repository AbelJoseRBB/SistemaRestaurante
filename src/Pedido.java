import Usuarios.Usuario;
import java.util.Date;


public class Pedido {

    private Produto produtoPedido;
    private int quantidade;
    private String observacao;
    private Date horario;

    public Pedido(Produto produto, int quantidade, String observacao){
        if(quantidade <= 0 ) throw new IllegalArgumentException("Quantidade invalida");
        this.produtoPedido = produto;
        this.quantidade = quantidade;
        this.observacao = observacao;
        this.horario = new Date();
    }

    public Produto getProdutoPedido() {
        return produtoPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public Date getHorario() {
        return horario;
    }

    public double getSubtotal(){
        return  produtoPedido.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%s x%d = R$ %.2f %s", produtoPedido.getNome(), quantidade, getSubtotal(),
                (observacao == null || observacao.isEmpty()) ? "" : ("(" + observacao + ")"));
    }


}
