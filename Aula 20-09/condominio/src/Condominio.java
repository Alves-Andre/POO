import java.util.ArrayList;
import java.util.List;

public class Condominio {
    public String nome;
    public List<Apartamento> apartamentos;

    public Condominio(String nome) {
        this.nome = nome;
        apartamentos = new ArrayList<>();
    }
    
    public void addApto(Apartamento apto){
        this.apartamentos.add(apto);
    }

    public void retornarAptosDisponiveis() {
        for (Apartamento apartamento : this.apartamentos) {
            if(apartamento.disponivel == true){
                System.out.println("Apartamento nº "+ apartamento.numero);
            }   
        }
    }

    public void ocuparUnidade(String numeroApto, Locatario loc){
        for (Apartamento ap:this.apartamentos){
            if (ap.numero == Integer.parseInt(numeroApto)){
                ap.ocupar(loc);
            }
        }
    }

    public void visualizarApto(String escolhaap) {
        for (Apartamento ap:this.apartamentos){
            if (ap.numero == Integer.parseInt(escolhaap)){
            System.out.println("Informações do apartamento");
            System.out.println("Número: "+ap.numero+"\nDiponibilidade: "+ap.disponivel);
            if (ap.locatario != null){
                System.out.println("Locatário: "+ap.locatario.nome);
            }
            }
        }
    }
}
