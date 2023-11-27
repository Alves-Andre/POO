import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public String nome;
    public String endereco;
    public List<Animal> animais;

    public Zoo(){
        this.animais = new ArrayList<>();
    }
    
    public Zoo(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.animais = new ArrayList<>();
    }


    public void cadatrarAnimal(Animal bicho) {
        this.animais.add(bicho);
        System.out.println("O Animal "+bicho.nome+" foi cadastrado com sucesso1");
    }

    public void visualizarAnimais() {
        int cont = 1;
        System.out.println("Os animais presente no zoológico são: ");
        for (Animal bicho : this.animais){
            System.out.println(cont+" - "+bicho.nome);
            cont++;
        }
    }

}
