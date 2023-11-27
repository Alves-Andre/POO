
public class Funcionarios {
    private String nome;
    private Integer idade;
    private String cargo;
    private double salario;
    private Integer horas_semanais;
    private Integer matricula;

    public Funcionarios() {
    }

    public Funcionarios(String nome, Integer idade, String cargo, double salario, Integer horas_semanais, Integer matricula) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.horas_semanais = horas_semanais;
        this.matricula = matricula;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getHoras_semanais() {
        return horas_semanais;
    }

    public void setHoras_semanais(Integer horas_semanais) {
        this.horas_semanais = horas_semanais;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }


}
