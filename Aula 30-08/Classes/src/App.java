public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //Pessoa andre = new Pessoa("Andre","da Silva Alves", "Masculino", 1.7, 20);

        Aluno andre = new Aluno("Andre", "da Silva Alves", 20); 

        Disciplina poo = new Disciplina("Programacao Orientada a Objetos");
        Disciplina sgbd = new Disciplina("SGBD");
        Disciplina redes = new Disciplina("Redes");

        andre.matricularDisciplina(poo);
        andre.matricularDisciplina(redes);

        andre.obterComprovanteDeMatricula();

        Aluno catolica = new Aluno();

        catolica.nome = "123";  
    }
}