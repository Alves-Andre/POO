
public class Animais {
    private String nome;
    private String sexo;
    private String alimentacao;
    
    public Animais(String nome, String sexo, String alimentacao) {
        this.nome = nome;
        this.sexo = sexo;
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    
}
