import java.util.ArrayList;
import java.util.List;

public class Condominio {
    public String nome;
    public String endereco;
    public List<Apartamentos> apartamentos;
    public List<Locatario> clientes;
    public List<Locacao> locacoes;

    Condominio(){
        this.apartamentos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.locacoes = new ArrayList<>();
    }

    public Condominio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.locacoes = new ArrayList<>();
    }

    
    public void addApartamento(Apartamentos apto){
        this.apartamentos.add(apto);
    } 
    public void listarApartamentos(){
        for (Apartamentos ap:this.apartamentos){
            ap.info();
        }
    }
    public void apartamentosDisponiveis(){
        for (Apartamentos ap:this.apartamentos){
            if (ap.disponivel==true){
                ap.info();
            }
        }
    }
    public void apartamentosOcupados(){
        for (Apartamentos ap:this.apartamentos){
            if (ap.disponivel==false){
                ap.info();
            }
        }
    }
    public void listarLocacoes(){
        for (Locacao locacao:this.locacoes){
            locacao.info();
        }
    }
    public Apartamentos reservarApartamento(int numero){
        for (Apartamentos ap:this.apartamentos){
            if (ap.disponivel==true && ap.numero==numero){
                return ap;
            }
        }   
        return null;
    }
    public void listarClientes(){
        for (Locatario cliente:this.clientes){
            System.out.println(cliente.cpf.getClass());
        }
    }
    public Locatario verificarCliente(String cpf){
        for (Locatario cliente:this.clientes){
            if (cliente.cpf.equals(cpf)){
                return cliente;
            }
        }
        return null;
    }
    public void addCliente(Locatario cliente){
        this.clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }
    public void addLocacao(Locacao nLocacao){
        for (Apartamentos ap:this.apartamentos){
            if (ap.equals(nLocacao.ap)){
                ap.disponivel = false;
            }
        }
        this.locacoes.add(nLocacao);
    }
    public void desocuparApartamento(String cpf){
        for (Locacao loc: this.locacoes){
            if (cpf.equals(loc.cliente.cpf) && loc.status == true){
                loc.status = false;
                for (Apartamentos apartamento:this.apartamentos){
                    if (apartamento.equals(loc.ap)){
                        apartamento.disponivel = true;
                        break;
                    }
                }
                System.out.println("Apartamento desocupado com sucesso!");
                break;
            }
        }
    }
}
