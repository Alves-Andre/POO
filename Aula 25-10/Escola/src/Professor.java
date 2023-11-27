import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{
    private List<String> disciplinas;

    public Professor(){

    }

    public Professor(String nome, String cpf, String data_nascimento, String sexo, String celular, Integer matricula) {
        super(nome, cpf, data_nascimento, sexo, celular, matricula);
        this.disciplinas = new ArrayList<>();
    }
    

    public void ministrarNovaDisciplina(String nomeDisciplina){
        this.disciplinas.add(nomeDisciplina);
        System.out.println("Disciplina adicionada com sucesso");
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplina) {
        this.disciplinas.add(disciplina);
    }
}
