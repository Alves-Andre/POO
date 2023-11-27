import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite o primeiro numero inteiro: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite a operacao (*, /, =, -): ");
            char operacao = scanner.next().charAt(0);

            System.out.println("Digite o segundo numero inteiro: ");
            int num2 = scanner.nextInt();

            if (operacao == '/'){
                System.out.println("Resultado: "+(num1/num2));
            }else if (operacao == '*'){
                System.out.println("Resultado: "+(num1*num2));
            }else if (operacao == '+'){
                System.out.println("Resultado: "+(num1+num2));
            }else if (operacao == '-'){
                System.out.println("Resultado: "+(num1-num2));
            }
            System.out.println("");
            System.out.println("Questao 2");
            System.out.println("");

            System.out.println("Digite um número: ");
            int contagem;

            for (contagem = scanner.nextInt(); contagem>=1; contagem--){
                System.out.println(contagem);
            }

    }
}
