
public class Circulo extends FiguraGeometrica{
    private double raio;
    private double diametro;
    
    public Circulo(double area, double perimetro, double raio, double diametro) {
        super(area, perimetro);
        this.raio = raio;
        this.diametro = diametro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    
}
