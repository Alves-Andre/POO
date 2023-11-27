import java.util.Scanner;

public class App {
    public static void main(String[] args){
    Estoque estoque_supermercado = new Estoque();
    Scanner input = new Scanner(System.in);
    
    Produto leite = new Produto("Leite Itambé", true, 30); //passar por parâmetro nome do produto, se é perecível ou não perecível e quantidade inicial em estoque
    Produto extrato_tomate = new Produto("Extrato de Tomate Quero", true, 50);
    Produto arroz = new Produto("Arroz Tio João", true, 100);
    Produto feijao = new Produto("Feijão Carioca Camil",true, 40);
    Produto manteiga = new Produto("Manteiga Porto Alegre", true, 10);
    Produto vassoura = new Produto("Vassoura Real", false, 15);
    Produto rodo = new Produto("Rodo Limpol", false, 15);
    Produto saco_lixo = new Produto("Saco de Lixo Preto 20L", false, 35);
    
    
    estoque_supermercado.cadastrarProduto(leite);
    estoque_supermercado.cadastrarProduto(extrato_tomate);
    estoque_supermercado.cadastrarProduto(arroz);
    estoque_supermercado.cadastrarProduto(feijao);
    estoque_supermercado.cadastrarProduto(manteiga);
    estoque_supermercado.cadastrarProduto(vassoura);
    estoque_supermercado.cadastrarProduto(rodo);
    estoque_supermercado.cadastrarProduto(saco_lixo);
    
    estoque_supermercado.exibirProdutosPereciveis();
    
    estoque_supermercado.exibirProdutosNaoPereciveis();
    
    estoque_supermercado.exibirProdutosEmFalta();//produtos com quantidade zero no estoque
    estoque_supermercado.exibirQuantidadeProdutosCadastrados();
    boolean continua = true;
    while (continua == true){
        System.out.println("\n============== SISTEMA DE ESTOQUE ==============");
        System.out.println("Bem vindo ao sistema de estoque! Escolha uma opção: ");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Exibir produtos peressíveis");
        System.out.println("3- Exibir não produtos peressíveis");
        System.out.println("4- Exibir produtos em falta");
        System.out.println("5- Exibir quantidade de produtos cadastrados");
        System.out.println("0- Sair\n");
        
        String escolha = input.next();

        switch (escolha) {
            case "0":
                continua = false;
            case "1":
                Produto novoProduto = estoque_supermercado.criarProduto();
                estoque_supermercado.cadastrarProduto(novoProduto);
                break;
            case "2":
                estoque_supermercado.exibirProdutosPereciveis();
                break;
            case "3":
                estoque_supermercado.exibirProdutosNaoPereciveis();
                break;
            case "4":
                estoque_supermercado.exibirProdutosEmFalta();
                break;
            case "5":
                estoque_supermercado.exibirQuantidadeProdutosCadastrados();
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
                break;

        }

    }
    
    }
    }