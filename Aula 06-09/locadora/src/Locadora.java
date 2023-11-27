import java.util.ArrayList;
import java.util.List;

public class Locadora {
    public String nome;
    public String endereco;
    public List<Carro> carros;

    public Locadora() {
    }

    public Locadora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.carros = new ArrayList<>();
    }
    
    public void cadatrarCarro(Carro car){
        this.carros.add(car);
        System.out.println("Carro cadastrado com sucesso");
    }

    public void visualizarCarros(){
        int cont = 1;
        System.out.println("Os carros cadastrados na locadora são: ");
        for (Carro car : this.carros){
            System.out.println(cont+" - "+car.modelo);
            cont++;
        }
    }

    
}
