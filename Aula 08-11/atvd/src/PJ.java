
public class PJ extends Funcionario {
    private String CPNJ;

    public PJ(String nome, String dataNascimento, String sexo, String cargo, Double salario, String tipo, String cPNJ) {
        super(nome, dataNascimento, sexo, cargo, salario, tipo);
        CPNJ = cPNJ;
    }

    public String getCPNJ() {
        return CPNJ;
    }

    public void setCPNJ(String cPNJ) {
        CPNJ = cPNJ;
    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("CPNJ: " + getCPNJ());
    }
}
