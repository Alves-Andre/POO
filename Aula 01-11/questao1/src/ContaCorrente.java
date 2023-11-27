
public class ContaCorrente {
    private String nome;
    private Integer idade;
    private String cpf;
    private String dataNascimento;
    private Integer numeroDaConta;
    private Double saldo;
    private Double taxa;

    public ContaCorrente(){
        
    }

    public ContaCorrente(String nome, Integer idade, String cpf, String dataNascimento, Integer numeroDaConta, Double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.taxa = 1.005;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public void depositar(Double valor){
        this.saldo += valor;
        System.out.println("\nDepósito no valor de R$"+valor+" realizado com sucesso! \nSeu saldo agora é de R$"+this.saldo);
    }

    public void sacar(Double valor) {
        if (this.saldo >= valor*taxa){
            this.saldo-=valor*taxa;
            System.out.println("\nSaque no valor de R$"+valor+" realizado com sucesso! \nSeu saldo agora é de R$"+this.saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }


}
