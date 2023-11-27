import java.util.ArrayList;
import java.util.List;

public class GerenciarFuncionarios {
    public List<Funcionario> listaFuncionarios;

    public GerenciarFuncionarios() {
        this.listaFuncionarios = new ArrayList<>();
    }
    
    public void addFuncionario (Funcionario func){
        this.listaFuncionarios.add(func);
        System.out.println("Funcionario adicionado com sucesso!");
    }

    public void exibirFuncionarios(){
        System.out.println("\nFuncionários da empresa: \n");
        for (Funcionario funcionario:listaFuncionarios) {
            System.out.println(funcionario.getNome());
        }
    }

    public void deletarFuncionario(String nome){
        for (Integer i = this.listaFuncionarios.size()-1; i>0; i--){
            if (this.listaFuncionarios.get(i).getNome() == nome){
                this.listaFuncionarios.remove(this.listaFuncionarios.get(i));
                System.out.println("\nFuncionário "+nome+" deletado com sucesso!");
            }
        }
    }

    public void updateNome(String nomeAntigo, String nomeNovo) {
        for (Funcionario func : this.listaFuncionarios){
            if (func.getNome() == nomeAntigo){
                func.setNome(nomeNovo);
                System.out.println("\nNome atualizado com sucesso");
            }
        }
    }

    public void exibirCLT() {
        System.out.println("\nFuncionários CLT da empresa: \n");
        for (Funcionario funcionario:listaFuncionarios) {
            if (funcionario.getTipo() == "CLT"){
                System.out.println(funcionario.getNome());
            }
            //System.out.println(funcionario.getClass());
            
        }
    }

    public void exibirPJ() {
        System.out.println("\nFuncionários PJ da empresa: \n");
        for (Funcionario funcionario:listaFuncionarios) {
            if (funcionario.getTipo() == "PJ"){
                System.out.println(funcionario.getNome());
            }
            
        }
    }
}
