public class Mesa {

    private int numMesa;
    private boolean disponivel = true;

    public Mesa() {
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getNumMesa() {
        return numMesa;
    }

}
