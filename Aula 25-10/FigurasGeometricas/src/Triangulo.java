
public class Triangulo extends FiguraGeometrica{
    private Integer qtdLados;
    private double altura;
    private double base;
    private String classificacao;

    
    
    public Triangulo(double area, double perimetro, Integer qtdLados, double altura, double base,
            String classificacao) {
        super(area, perimetro);
        this.qtdLados = qtdLados;
        this.altura = altura;
        this.base = base;
        this.classificacao = classificacao;
    }
    public Integer getQtdLados() {
        return qtdLados;
    }
    public void setQtdLados(Integer qtdLados) {
        this.qtdLados = qtdLados;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    
    
}
