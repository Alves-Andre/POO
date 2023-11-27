import java.util.List;

public class Locatario {
    public String nome;
    public String dataNascimento;
    public String sexo;
    public String cpf;
    public String telefone;
    public List<Locatario> clientes;

    public Locatario() {
    }

    public Locatario(String nome, String dataNascimento, String sexo, String cpf, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    
}
