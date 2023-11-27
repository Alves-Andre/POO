
public class Mamifero extends Animais{
    Integer numeroDePatas;
    String tipoDePelo;

    public Mamifero(String nome, String sexo, String alimentacao, Integer numeroDePatas,
            String tipoDePelo) {
        super(nome, sexo, alimentacao);
        this.numeroDePatas = numeroDePatas;
        this.tipoDePelo = tipoDePelo;
    }

    public Integer getNumeroDePatas() {
        return numeroDePatas;
    }
    public void setNumeroDePatas(Integer numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    public String getTipoDePelo() {
        return tipoDePelo;
    }
    public void setTipoDePelo(String tipoDePelo) {
        this.tipoDePelo = tipoDePelo;
    }

    

}
