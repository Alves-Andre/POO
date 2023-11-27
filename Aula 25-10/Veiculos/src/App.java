public class App {
    public static void main(String[] args) throws Exception {

        VeiculoTerrestre carro = new VeiculoTerrestre("Civic","Gasolina","Branco",5, 4);

        VeiculoAquatico jetSki = new VeiculoAquatico("Jetski","Gasolina","Preto",2,"Combustao");

        carro.andarNaTerra();

        jetSki.andarNaAgua();
    }
}
