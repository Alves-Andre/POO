
public class Carro {
    public String marca;
    public String modelo;
    public Integer ano;
    public String combustivel;
    public String classificacao;
    public boolean disponivel;

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer ano, String combustivel, String classificacao, Boolean disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
        this.classificacao = classificacao;
        this.disponivel = disponivel;
    }

}
