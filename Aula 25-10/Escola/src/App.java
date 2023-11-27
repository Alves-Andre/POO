public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa();
        Estudante estudante = new Estudante("Andre Alves", "07233781184","07-02-2023","Masculino", "63912937181",202301,"TN2023");

        Professor professor1 = new Professor("Joao","123456789010","10-10-1990","Masculino","631234567",2018020);

        estudante.realizarMatriculaEstudante("Engenhria de Software");

        professor1.ministrarNovaDisciplina("POO");

        System.out.println(estudante.getCurso());

        System.out.println(professor1.getDisciplinas());
        
    }
}
