import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections; 

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Questao 1"); 

        List <Integer> numeros1 = new ArrayList<>();

        numeros1.add(15);
        numeros1.add(2);
        numeros1.add(7);

        Collections.sort(numeros1);
        System.out.println(numeros1.get(0));


        System.out.println("Questao 2 ");

        List <Integer> numeros2 = new ArrayList<>();
        numeros2.add(15);
        numeros2.add(2);

        numeros2.add(1, 7);

        System.out.println(numeros2);


        System.out.println("Questao 3");

        List <Integer> numeros3 = new ArrayList<>();
        numeros3.add(15);
        numeros3.add(2);
        numeros3.add(7);
        numeros3.add(10);

        Collections.shuffle(numeros3);

        System.out.println(numeros3);


        System.out.println("Questao 4");

        List <Integer> lista4 = new ArrayList<>();
        lista4.add(15);
        lista4.add(2);
        lista4.add(7);
        lista4.add(10);

        List <Integer> lista42 = new ArrayList<>(Arrays.asList(12,15,8,3,7));
        
        lista4.retainAll(lista42);
        System.out.println(lista4);
        
        
        System.out.println("Questao 5");

        List <Double> lista5 = new ArrayList<>();
        lista5.add(15d);
        lista5.add(2d);
        lista5.add(7d);
        lista5.add(10d);

        double media = lista5.stream()
                              .mapToDouble(Double::doubleValue)
                              .average()
                              .orElse(0.0); 
        System.out.println("A média é: "+media);


        System.out.println("Questao 6");

        List <Integer> numeros6 = new ArrayList<>();
        numeros6.add(15);
        numeros6.add(2);
        numeros6.add(7);
        numeros6.add(10);

        for (int n=numeros6.size()-1; n>=0; n--){
            if (numeros6.get(n) %2!=0){ 
                numeros6.remove(n);
            }
        }
        System.out.println(numeros6);   



        System.out.println("Questao 7");
        
        List <Integer> numeros7 = new ArrayList<>();
        numeros7.add(15);
        numeros7.add(2);
        numeros7.add(7);
        numeros7.add(10);

        List <Integer> listamenor = new ArrayList<>();
        List <Integer> listamaior = new ArrayList<>();

        System.out.println("Digite o numero separador");
        int divisor = scanner.nextInt();

        for (int i: numeros7){
            if (i<=divisor){
                listamenor.add(i);
            }else {
                listamaior.add(i);
            }
        }
        System.out.println(listamenor);
        System.out.println(listamaior);

        

    }
};
    
    //Array

        // int[] numeros = new int[5];
        // numeros[0] = 10; numeros[1] = 20;
        // numeros[1] = 20;

        // for (int numero : numeros) {
        //     System.out.println(numero);
        // }


        //Lista

        // List <String> nomes = new ArrayList<>();
        // nomes.add("Alice");
        // nomes.add("Bob");

        // System.out.println(nomes);

        // List <Float> alturas = new ArrayList<>();

        // List<Double> alturas2 = List.of(1.7, 1.8, 1.9);

        // alturas.add( 1.83F);
        // alturas.add(1.7F);
        
        // System.out.println(alturas.size());
        // System.out.println(alturas);
