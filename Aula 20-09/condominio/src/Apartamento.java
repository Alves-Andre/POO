public class Apartamento {
    public int numero;
    public boolean disponivel;
    public Locatario locatario;

    public Apartamento(int numero, boolean disponibilidade) {
        this.numero = numero;
        this.disponivel = disponibilidade;

    }
    public void ocupar(Locatario loc){
        this.locatario = loc;
        this.disponivel = false;
    }
}
