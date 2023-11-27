
public class CLT extends Funcionario{
    private String horaEntrada;
    private String horaSaida;
    private Integer numeroCLT;
    private Integer horasSemanais;
    private String jornadaDeTrabalho;
    private String cpf;
    
    public CLT(String nome, String dataNascimento, String sexo, String cargo, Double salario,  String tipo,
            String horaEntrada, String horaSaida, Integer numeroCLT, Integer horasSemanais, String jornadaDeTrabalho, String cpf) {
        super(nome, dataNascimento, sexo, cargo, salario, tipo);
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.numeroCLT = numeroCLT;
        this.horasSemanais = horasSemanais;
        this.jornadaDeTrabalho = jornadaDeTrabalho;
        this.cpf = cpf;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Integer getNumeroCLT() {
        return numeroCLT;
    }

    public void setNumeroCLT(Integer numeroCLT) {
        this.numeroCLT = numeroCLT;
    }

    public Integer getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(Integer horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public String getJornadaDeTrabalho() {
        return jornadaDeTrabalho;
    }

    public void setJornadaDeTrabalho(String jornadaDeTrabalho) {
        this.jornadaDeTrabalho = jornadaDeTrabalho;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Jornada de Trabalho: " + getJornadaDeTrabalho());
        System.out.println("Hora de Entrada: " + getHoraEntrada());
        System.out.println("Hora de Saída: " + getHoraSaida());
        System.out.println("Número da CLT: " + getNumeroCLT());
        System.out.println("Horas Semanais: " + getHorasSemanais());
        System.out.println("CPF: " + getCpf());
    }
}
