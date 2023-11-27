public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial();

        ContaCorrente contaNormal1 = new ContaCorrente("Joao Pedro", 30, "123.456.789-00", "01/05/1990", 12345, 1000.0);
        ContaCorrenteEspecial contaEspecial1= new ContaCorrenteEspecial("Vinicius Daniel", 30, "123.456.789-00", "08/10/1999", 61723, 500.0, false);


        contaNormal1.sacar(50.00);
        contaNormal1.depositar(10.00);
        contaEspecial1.sacar(50.00);
        contaEspecial1.depositar(10.00);
    }
}
