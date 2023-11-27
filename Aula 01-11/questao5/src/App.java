public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Celta", 60.0);
        Onibus onibus1 = new Onibus("Busão", 40.0); 
        Bicicleta bicicleta1 = new Bicicleta("Monark", 20.0); 

        double distancia = 100.0;

        System.out.println("Tempo de viagem de Carro: " + carro1.calcularTempoViagem(distancia) + " horas");
        System.out.println("Tempo de viagem de Ônibus: " + onibus1.calcularTempoViagem(distancia) + " horas");
        System.out.println("Tempo de viagem de Bicicleta: " + bicicleta1.calcularTempoViagem(distancia) + " horas");

    }
}
