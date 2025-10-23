import java.util.ArrayList;
import  Usuarios.*;

public class Comanda {
    private boolean fechada = false;
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public Comanda(){}

    public void setPedidos(Pedido pedido) {
        if(!fechada)
            pedidos.add(pedido);
    }

    public void fecharConta(){
        fechada = true;
    }



}
