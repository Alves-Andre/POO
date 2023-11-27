public class App {
    public static void main(String[] args) throws Exception {
        Alimento alimento = new Alimento("Maçã", 2.0);
        Eletronico eletronico = new Eletronico("Smartphone", 500.0);
        Vestuario vestuario = new Vestuario("Camiseta", 20.0);

        System.out.println("Preço final do alimento: " + alimento.calcularPrecoFinal());
        System.out.println("Preço final do eletrônico: " + eletronico.calcularPrecoFinal());
        System.out.println("Preço final do vestuário: " + vestuario.calcularPrecoFinal());
    }
}
