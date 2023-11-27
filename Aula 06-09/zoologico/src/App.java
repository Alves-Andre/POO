public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    Animal macaco = new Animal("Macaco Prego", "Mamífero", "Sapajus", "Herbívoro", "Floresta");
    Animal onca = new Animal("Onça-Pintada", "Mamífero","Panthera onca", "Carnívoro", "Floresta");

    Zoo zooMunicipal = new Zoo();
    
    zooMunicipal.cadatrarAnimal(macaco);
    zooMunicipal.cadatrarAnimal(onca);
    
    zooMunicipal.visualizarAnimais();
    }
}
