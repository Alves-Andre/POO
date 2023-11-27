public class Pessoa {
    public String nome;
    public String sobrenome;
    public String sexo;
    public double altura;
    public int idade;
    public String profissao;

    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome, String sexo, double altura, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public void andar(){
    System.out.println(this.nome + "Está andando");
    }
}
