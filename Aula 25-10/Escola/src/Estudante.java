import java.util.Random;

public class Estudante extends Pessoa {
    private String turma;
    private String curso;

    public Estudante(){

    }

    public Estudante(String nome, String cpf, String data_nascimento, String sexo, String celular, Integer matricula,
            String turma) {
        super(nome, cpf, data_nascimento, sexo, celular, matricula);
        this.turma = turma;
    }

    

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void realizarMatriculaEstudante(String nomeCurso){
        this.setCurso(nomeCurso);
    }
    

}
