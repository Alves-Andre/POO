
public class VeiculoAquatico extends Veiculo{
    private String tipoMotor;


    public VeiculoAquatico(String nome, String tipoCombutivel, String cor, Integer numeroDeLugares, String tipoMotor) {
        super(nome, tipoCombutivel, cor, numeroDeLugares);
        this.tipoMotor = tipoMotor;
    }

    public void andarNaAgua(){
        System.out.println("Seu veículo está andando na Agua");
    }
}
