import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        List<Mesa> mesas = new ArrayList<>();
        Map<Integer, Comanda> comandas = new HashMap<>();

        for(int i = 1; i != 10; i++) mesas.add(new Mesa(i)); // cria 10 mesas

        produtos.add(new Produto("Produto1", "", 19.90, 40));
        produtos.add(new Produto("Produto2", "", 129.99, 20));

        int proxComanda = 1;
        boolean rodando = true;

        while(rodando){
            System.out.println("\n--- Sistema Restaurante ---");
            System.out.println("1) Listar mesas");
            System.out.println("2) Criar comanda");
            System.out.println("3) Adicionar pedido");
            System.out.println("4) Fechar comanda");
            System.out.println("5) Sair");
            System.out.print("Escolha: ");
            int opt = Integer.parseInt(sc.nextLine());
            try{
                switch (opt){
                    case 1:
                        for(Mesa m: mesas) System.out.println(m);
                    break;
                    case 2:
                        System.out.println("Numero da mesa: ");
                        int nm = Integer.parseInt(sc.nextLine());
                        Mesa mesa = mesas.stream().filter(x->x.getNumMesa() == nm).findFirst().orElse(null);
                        if(mesa == null)
                            System.out.println("Mesa invalida");
                        else if(mesa.isOcupada())
                            System.out.println("Mesa ocupada");
                        else{
                            Comanda comanda = new Comanda(proxComanda++);
                            mesa.ocupar(comanda);
                            comandas.put(comanda.getNumero(), comanda);
                            System.out.println("Comanda Aberta: " + comanda.getNumero());

                                for(Produto p: produtos) System.out.println(p);
                                System.out.println("ID Produto: ");
                                int idp = Integer.parseInt(sc.nextLine());
                                Produto prod = produtos.stream().filter(x->x.getId() == idp).findFirst().orElse(null);
                                if(prod == null) System.out.println("Produto nao encontrado");
                                System.out.println("Quantidade: ");
                                int qtd = Integer.parseInt(sc.nextLine());
                                System.out.println("Observaçao (enter para vazio): ");
                                String obs = sc.nextLine();
                                Pedido p = new Pedido(prod, qtd, obs);
                                comanda.adicionarPedido(p);
                                System.out.println("Pedido adicionado");


                        }
                    break;
                    case 3:
                        System.out.println("Numero comanda: ");
                        int nc = Integer.parseInt(sc.nextLine());
                        Comanda c = comandas.get(nc);
                        if(c == null) System.out.println("Comanda nao encontrada");
                        else if(c.isFechada()) System.out.println("Comanda fechada");
                        else{
                            for(Produto p: produtos) System.out.println(p);
                            System.out.println("ID Produto: ");
                            int idp = Integer.parseInt(sc.nextLine());
                            Produto prod = produtos.stream().filter(x->x.getId() == idp).findFirst().orElse(null);
                            if(prod == null) System.out.println("Produto nao encontrado");
                            System.out.println("Quantidade: ");
                            int qtd = Integer.parseInt(sc.nextLine());
                            System.out.println("Observaçao (enter para vazio): ");
                            String obs = sc.nextLine();
                            Pedido p = new Pedido(prod, qtd, obs);
                            c.adicionarPedido(p);
                            System.out.println("Pedido adicionado");
                        }
                    break;
                    case 4:
                        System.out.println("Numero comanda: ");
                        int nc2 = Integer.parseInt(sc.nextLine());
                        Comanda c2 = comandas.get(nc2);
                        if(c2 == null) System.out.println("Comanda nao encontrada");
                        else {
                            c2.fechar();
                            mesas.stream().filter(m->m.getComanda() != null && m.getComanda().getNumero() == nc2)
                                    .findFirst().ifPresent(Mesa::liberar);
                            System.out.println("Comanda fechada. Total R$" + String.format("%.2f", c2.calcularTotal()));
                        }
                    break;
                    case 5: rodando = false;
                    break;
                    default: System.out.println("Opção invalida");
                }
            }catch (Exception e){
                System.out.println("Erro " + e.getMessage());
            }
        }
        sc.close();
    }
}



