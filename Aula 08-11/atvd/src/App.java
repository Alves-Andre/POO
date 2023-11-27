public class App {
    public static void main(String[] args) throws Exception {
        CLT funcionario1 = new CLT("Joao Silva", "01/01/1990", "Masculino", "Desenvolvedor", 5000.0,"CLT", "09:00", "18:00", 12345, 40, "Integral", "123.456.789-00");
        CLT funcionario2 = new CLT("Maria Souza", "15/05/1985", "Feminino", "Gerente de Projetos", 8000.0, "CLT", "08:30", "17:30", 54321, 20, "Meio Período", "987.654.321-00");
        
        PJ mei1 = new PJ("Lucas Ferreira", "10/02/1988", "Masculino", "Consultor Financeiro", 6000.0,"PJ", "12345678901234");
        PJ mei2 = new PJ("Camila Oliveira", "05/09/1995", "Feminino", "Designer Gráfico", 4500.0, "PJ","98765432109876");
        

        GerenciarFuncionarios amazon = new GerenciarFuncionarios();

        amazon.addFuncionario(funcionario1);
        amazon.addFuncionario(funcionario2);
        amazon.addFuncionario(mei1);
        amazon.addFuncionario(mei2);

        amazon.exibirFuncionarios();

        amazon.deletarFuncionario("Maria Souza");
        amazon.exibirFuncionarios();

        amazon.updateNome("Joao Silva", "Andre Alves");
        amazon.exibirFuncionarios();

        amazon.exibirCLT();

        amazon.exibirPJ();
    }
}
