
public class Veiculo {
    private String nome;
    private String tipoCombutivel;
    private String cor;
    private Integer numeroDeLugares;
    
    public Veiculo(String nome, String tipoCombutivel, String cor, Integer numeroDeLugares) {
        this.nome = nome;
        this.tipoCombutivel = tipoCombutivel;
        this.cor = cor;
        this.numeroDeLugares = numeroDeLugares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCombutivel() {
        return tipoCombutivel;
    }

    public void setTipoCombutivel(String tipoCombutivel) {
        this.tipoCombutivel = tipoCombutivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNumeroDeLugares() {
        return numeroDeLugares;
    }

    public void setNumeroDeLugares(Integer numeroDeLugares) {
        this.numeroDeLugares = numeroDeLugares;
    }
    
    
}
