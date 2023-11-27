import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    public String nome;
    public String endereco;
    public List<Livro> livros;
    
    public Biblioteca() {
    }

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
    }

    public void addLivro(Livro livro){
        this.livros.add(livro);
        System.out.println("Livro adicionado a biblioteca");
    }

    public void visualizarLivros(){
        int cont = 1;
        System.out.println("Os livros presentes nesta biblioteca são: ");
        for (Livro book : this.livros){
            System.out.println(cont+" - "+book.nome);
            cont++;
        }
    }
}
