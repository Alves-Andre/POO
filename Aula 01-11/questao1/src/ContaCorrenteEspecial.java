
public class ContaCorrenteEspecial extends ContaCorrente{
    private Boolean isPensionista;

    public ContaCorrenteEspecial() {
    }

    public ContaCorrenteEspecial(String nome, Integer idade, String cpf, String dataNascimento, Integer numeroDaConta,
            Double saldo, Boolean isPensionista) {
        super(nome, idade, cpf, dataNascimento, numeroDaConta, saldo);
        setTaxa(1.001);
        this.isPensionista = isPensionista;
    }

}
