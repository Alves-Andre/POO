public class App {
    public static void main(String[] args) throws Exception {
        Mamifero cachorro = new Mamifero("Caramelo", 3, "Pelo curto");
        Reptil cobra = new Reptil("Cascavel", 5, "Escamas lisas");
        Ave passaro = new Ave("Piu Piu", 2, "Penas coloridas");

        System.out.println("Informações do Cachorro:");
        cachorro.exibirInformacoes();

        System.out.println("\nInformações da Cobra:");
        cobra.exibirInformacoes();

        System.out.println("\nInformações do Pássaro:");
        passaro.exibirInformacoes();
    }
}
