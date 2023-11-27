
public class Locacao {
    public Apartamentos ap;
    public Locatario cliente;
    public boolean status;
    
    public Locacao() {
    }

    public Locacao(Apartamentos ap, Locatario cliente) {
        this.ap = ap;
        this.cliente = cliente;
        this.status = true;
    }
    public void info(){
        System.out.println("N° do apartamento: "+this.ap.numero+" \nLocatário: "+this.cliente.nome+" \nStatu: "+this.status+"\n");
    }
}
