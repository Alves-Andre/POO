    public class App {
        public static void main(String[] args) throws Exception {
            //System.out.println("Hello, World!");
        Carro civic = new Carro("Honda", "Civic Touring", 2017, "Flex", "Sedan", true);
        Carro corolla = new Carro("Toyota", "Corolla", 2016, "Flex", "Sedan", true);

        Locadora movida = new Locadora("Movida","103 Sul");
        
        movida.cadatrarCarro(corolla);
        movida.cadatrarCarro(civic);
        
        movida.visualizarCarros();
        }
    }
