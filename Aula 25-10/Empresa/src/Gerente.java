
public class Gerente extends Funcionarios{
    private String telefone_coorporativo;

    public Gerente(){
        
    }

    public Gerente(String nome, Integer idade, String cargo, double salario, Integer horas_semanais, Integer matricula,
            String telefone_coorporativo) {
        super(nome, idade, cargo, salario, horas_semanais, matricula);
        this.telefone_coorporativo = telefone_coorporativo;
    }

    public String getTelefone_coorporativo() {
        return telefone_coorporativo;
    }

    public void setTelefone_coorporativo(String telefone_coorporativo) {
        this.telefone_coorporativo = telefone_coorporativo;
    }


}
