import Usuarios.Usuario;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pedido {

    private Mesa mesa;
    private Usuario atendente;
    private Cliente cliente;
    private Calendar horarioPedido = new GregorianCalendar(); // Falta pegar o horario atual do Pedido
    private Produto produtoPedido;
    private int quantidade;
    private String observacao;

    public Pedido(){}

    public Mesa getMesa() {
        return mesa;
    }

    public Usuario getAtendente() {
        return atendente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void getPedido() {
        System.out.println(quantidade + "----" + produtoPedido);
    }

    public void setPedidoAtual(Produto pedidoAtual, int quantidade) {
        this.produtoPedido = pedidoAtual;
        this.quantidade = quantidade;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAtendente(Usuario atendente) {
        this.atendente = atendente;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
