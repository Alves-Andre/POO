
public class Retangulo extends FiguraGeometrica{
    private Integer qtdLados;
    private double altura;
    private double base;
    
    public Retangulo(double area, double perimetro, Integer qtdLados, double altura, double base) {
        super(area, perimetro);
        this.qtdLados = qtdLados;
        this.altura = altura;
        this.base = base;
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

    
}
