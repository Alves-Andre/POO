import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean continua = true;
        while (continua){
            System.out.println("======= Bichinho Virtual =======");
            System.out.println("Deseja criar um pet agora? s/n");
            String escolha = input.next();

            switch (escolha){
                case "s":
                    System.out.println("Digite um nome: ");
                    String nome = input.next();
                    System.out.println("Digite a classe");
                    String classe = input.next();
                    System.out.println("Digite a família: ");
                    String familia = input.next();

                    Pet pet = new Pet(nome, classe, familia);
                    System.out.println("Parabéns seu pet "+pet.nome+" foi criado");

                    boolean escolha2 = true;
                    Integer envelhever = 0;
                    while (escolha2){
                        if (envelhever==3){
                            pet.envelhever();
                            envelhever=0;
                        }
                        envelhever+=1;
                        System.out.println("\nO que você deseja fazer agora? ");
                        System.out.println("1- Comer ");
                        System.out.println("2- Correr ");
                        System.out.println("3- Dormir ");
                        System.out.println("4- Morrer ");
                        System.out.println("5- Sair");

                        Integer desejo = input.nextInt();

                        switch (desejo){
                            case 1:
                                if (pet.verificaVida()){
                                    pet.comer();
                                    pet.status();
                                }
                                else{
                                    System.out.println("Seu pet Morreu, ele não pode comer");
                                }
                                break;
                            case 2:
                                if (pet.verificaVida()){
                                    pet.correr();
                                    pet.status();
                                }
                                else {
                                    System.out.println("Seu pet Morreu, ele não pode correr");
                                }
                                break;
                            case 3:
                                if (pet.verificaVida()){
                                    pet.dormir();
                                    pet.status();
                                }else {
                                    System.out.println("Seu pet Morreu, ele não pode dormir");
                                }
                                break;
                            case 4:
                                if (pet.verificaVida()){
                                    pet.morrer();
                                    pet.status();
                                }else {
                                    System.out.println("Seu pet já está morto");
                                    pet.status();
                                }
                                break;
                            case 5:
                                System.out.println("Tchau!");
                                escolha2 = false;
                                break;
                            default:
                                System.out.println("Escolha inválida");
                                break;
                        }
                    }
                case "n":
                    System.out.println("Tudo bem. Tchau!");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}
