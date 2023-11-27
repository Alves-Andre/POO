import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    public List<Produto> produtos;

    public Estoque(){
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void exibirProdutosPereciveis() {
        System.out.println("Produtos peressíveis: ");
        for (Produto produto : produtos) {
            if (produto.peressivel == true){
                System.out.println("-"+produto.nome);
            }
        }
    }
    
    public void exibirProdutosNaoPereciveis() {
        System.out.println("Produtos Não peressíveis: ");
        for (Produto produto : produtos) {
            if (produto.peressivel == false){
                System.out.println("-"+produto.nome);
            }
        }
    }

    public void exibirProdutosEmFalta() {
        System.out.println("Produtos em falta: ");
        for (Produto produto : produtos) {
            if (produto.quantidade == 0){
                System.out.println("-"+produto.nome);
            }
        }
    }

    public void exibirQuantidadeProdutosCadastrados() {
        System.out.println("Existem atualmente "+this.produtos.size()+" produtos cadastrados!");
    }

    public Produto criarProduto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String nome = input.nextLine();
        boolean perecivel;
        System.out.println("O produto é perecível? s/n");
        String ePeressivel = input.next();
        if ("s".equals(ePeressivel)){
            perecivel = true;
        }
        else if ("n".equals(ePeressivel)){
            perecivel = false;
        }
        else {
            System.out.println("escolha inválida. Não foi possível cadastrar o produto.");
            return null;
        }
        System.out.println("Digite a quantidade em estoque desse produto: ");
        Integer qtd = input.nextInt();
        Produto novoProduto = new Produto(nome, perecivel, qtd);
        return novoProduto;

    }


}
