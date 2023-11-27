public class App {
    public static void main(String[] args) throws Exception {
        Smartphone celular1 = new Smartphone("Samsung", "Galaxy S20", 999.99, "6.1'", true);
        Laptop notebook1 = new Laptop("Apple", "MacBook Pro", 1499.99, "14.5'", false);
        SmartTV tv1 = new SmartTV("LG", "OLED55CX", 1299.99, "50'", true);

        System.out.println("Preço do Samsung Galaxy: $" + celular1.getPreco());
        System.out.println("Desconto aplicado no Samsung Galaxy: $" + celular1.calcularDesconto());

        System.out.println("\nPreço do MacBook Pro: $" + notebook1.getPreco());
        System.out.println("Desconto aplicado no MacBook Pro: $" + notebook1.calcularDesconto());

        System.out.println("\nPreço da LG Smart TV: $" + tv1.getPreco());
        System.out.println("Desconto aplicado na LG Smart TV: $" + tv1.calcularDesconto());
    }
}
