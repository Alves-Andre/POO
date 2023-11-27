import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
/*
        // Questao 1

        System.out.println("Crie uma senha: ");
        String operacao = scanner.nextLine();

        if (operacao.length()>=8) {
            System.out.println("Senha válida");
        }else {
            System.out.println("Senha inválida");
        }


        // Questao 2
*/
        


        // Questao 3 


        boolean digitado = email.contains("@");



        // Questao 4
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        frase = frase.toLowerCase();
        int cont = 0;
        for (int i = 0; i<frase.length(); i++){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                cont = cont + 1;
            }
        }
        System.out.println("Quantidade de vogais é: "+cont);
    }
}
