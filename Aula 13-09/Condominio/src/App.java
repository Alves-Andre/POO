import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Condominio alfavile = new Condominio("Alfavile", "Rua rica quadra burguesa lote caro");

        Apartamentos ap1 = new Apartamentos(101, 50, "A", true,false);
        Apartamentos ap2 = new Apartamentos(102, 50, "A", true,false);
        Apartamentos ap3 = new Apartamentos(103, 50, "A", true,false);
        Apartamentos ap4 = new Apartamentos(104, 50, "A", true,false);
        Apartamentos ap5 = new Apartamentos(105, 50, "A", false,false);
        Apartamentos ap6 = new Apartamentos(106, 50, "A", false,false);
        Apartamentos ap7 = new Apartamentos(107, 50, "A", false,false);
        Apartamentos ap8 = new Apartamentos(108, 50, "A", false,false);
        Apartamentos ap9 = new Apartamentos(109, 50, "A", false,true);
        Apartamentos ap10 = new Apartamentos(110, 50, "A", true,true);
        Apartamentos ap11 = new Apartamentos(111, 50, "A", true,true);
        Apartamentos ap12 = new Apartamentos(112, 50, "A", true,true);
        Apartamentos ap13 = new Apartamentos(113, 50, "A", true,true);
        Apartamentos ap14 = new Apartamentos(114, 50, "A", true,false);
        Apartamentos ap15 = new Apartamentos(115, 50, "A", true,false);

        alfavile.addApartamento(ap1);
        alfavile.addApartamento(ap2);
        alfavile.addApartamento(ap3);
        alfavile.addApartamento(ap4);
        alfavile.addApartamento(ap5);
        alfavile.addApartamento(ap6);
        alfavile.addApartamento(ap7);
        alfavile.addApartamento(ap8);
        alfavile.addApartamento(ap9);
        alfavile.addApartamento(ap10);
        alfavile.addApartamento(ap11);
        alfavile.addApartamento(ap12);
        alfavile.addApartamento(ap13);
        alfavile.addApartamento(ap14);
        alfavile.addApartamento(ap15);

        Locatario cliente1 = new Locatario("André Alves","07/02/2003", "Masculino","07233781184","63 99121-1559");
        Locatario cliente2 = new Locatario("Joao Brito","14/10/2000", "Masculino","12345678910","63 99173-8152");

        alfavile.addCliente(cliente1);
        alfavile.addCliente(cliente2);
        /* 

        System.out.println("Lista de todos os apartamentos");
        alfavile.listarApartamentos();
        System.out.println("\n Lista de todos os apartamentos disponíveis");
        alfavile.apartamentosDisponiveis();
        System.out.println("\n Lista de todos os apartamentos Ocupados");
        alfavile.apartamentosOcupados();
        */ 


        System.out.println("Bem vindo ao sistema de reserva do condomínio Aufavili!");
        while (true){
            int validador = 1;
            System.out.println("\nDigite a opção desejada: ");
            System.out.println("1- Listar apartamentos ");
            System.out.println("2- Listar apartamentos disponíveis ");
            System.out.println("3- Listar apartamentos ocupados");
            System.out.println("4- Listar locações");
            System.out.println("5- Reservar apartamento");
            System.out.println("6- Desocupar apartamento");
            System.out.println("7- Sair");
            System.out.println();

            int escolha = scanner.nextInt();
            switch (escolha){
                case 1:
                System.out.println("\nLista de apartamentos do Aufavili");
                    alfavile.listarApartamentos();
                    break;
                case 2:
                System.out.println("\nLista de apartamentos disponíveis para locação do Aufavili");
                    alfavile.apartamentosDisponiveis();
                    break;
                case 3:
                    System.out.println("\nLista de apartamentos indisponíveis para locação do Aufavili");
                    alfavile.apartamentosOcupados();
                    break;
                case 4:
                    System.out.println("\nLista de locações do condomínio Aufavili");
                    alfavile.listarLocacoes();
                    break;
                case 5:
                    alfavile.apartamentosDisponiveis();
                    System.out.println();
                    System.out.println("\nDigite o número do apartamento desejado: ");
                    int nAp = scanner.nextInt();
                    Apartamentos apEscolhido = alfavile.reservarApartamento(nAp);
                    if (apEscolhido != null){
                        System.out.println("\nDigite seu CPF: ");
                        scanner.nextLine();
                        String cpf = scanner.nextLine();

                        Locatario cliente = alfavile.verificarCliente(cpf);
                        if (cliente!=null){
                            //Cliente existe na base de dados
                            System.out.println("\nSeja bem vindo de volta "+cliente.nome+"!!!\n");
                            System.out.println("Vamos reservar seu apartamento aguarte um momento...");
                            Thread.sleep(3000);
                            Locacao novaLocacao = new Locacao(apEscolhido, cliente);
                            alfavile.addLocacao(novaLocacao);
                            System.out.println("Apartamento reservado com sucesso parabéns!");
                            
                        }else {
                            //Cliente nao existe na base de dados
                            System.out.println("\nVimos que você ainda não tem cadastro na nossa base de dados, vamos fazê-lo agora!!!\n");
                            System.out.println("Digite seu nome: ");
                            String nome = scanner.next();
                            System.out.println("Digite sua data de nascimento: ");
                            String dataNascimento = scanner.next();
                            System.out.println("Digite seu sexo: ");
                            String sexo = scanner.next();
                            System.out.println("Digite seu telefone: ");
                            String telefone = scanner.next();

                            cliente = new Locatario(nome, dataNascimento, sexo, cpf, telefone);
                        }
                        Locacao novaLocacao = new Locacao(apEscolhido, cliente);
                    break;
                    }else {
                        System.out.println("Apartamento inválido");
                        break;
                    }
                case 6:
                    System.out.println("\nDigite seu cpf: ");
                    scanner.nextLine();
                    String cpf = scanner.nextLine();
                    alfavile.desocuparApartamento(cpf);
                    break;
                case 7:
                validador = 0;
                    break;
                default:
                    System.out.println("\nNúmero inválido, tente novamente \n");
                    Thread.sleep(1500);
                    break;
            }
            if (validador==0){break;}
        }
    }
}