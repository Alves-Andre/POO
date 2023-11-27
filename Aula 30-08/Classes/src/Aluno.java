import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Aluno {
    public String nome;
    public String sobrenome;
    public Integer idade;
    public Integer matricula;
    public Curso curso;
    public boolean estaMatriculado; 
    public List<Disciplina> disciplinas;

    Random random = new Random();

    public Aluno(){

    }

    public Aluno(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.disciplinas = new ArrayList<>();
    }

    public void assistirAula(){
        System.out.println("O aluno "+this.nome+"Assistindo Aula");
    }
    
    public void trancarCurso(){
        System.out.println("O aluno "+this.nome+" trancou o curso");
    }

    public void faltar(){
        System.out.println(this.nome+"Faltou");
    }

    public void matricular(){
        this.estaMatriculado = true;
        this.matricula = (int) Math.random();

        System.out.println(this.nome+" está matriculado");
        System.out.println("Sua matrícula é: "+this.matricula);
    }

    public void matricularDisciplina(Disciplina disc){
        this.disciplinas.add(disc);
        System.out.println("O aluno: "+this.nome+"\nFoi matriculado na disciplina: "+disc.nome+ "\nSuas disciplinas agora são: ");
    }

    public void obterComprovanteDeMatricula(){
        System.out.println("As disciplinas que o aluno "+this.nome+" está matriculado são: ");
        for (Disciplina disciplina: disciplinas){
            System.out.println(disciplina.nome);
        }
        
    }
}
