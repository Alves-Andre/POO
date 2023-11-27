
public class VeiculoTerrestre extends Veiculo{
    private Integer numeroDeRodas;

    

    public VeiculoTerrestre(String nome, String tipoCombutivel, String cor, Integer numeroDeLugares,
            Integer numeroDeRodas) {
        super(nome, tipoCombutivel, cor, numeroDeLugares);
        this.numeroDeRodas = numeroDeRodas;
    }

    public void andarNaTerra(){
        System.out.println("Seu veículo está andando na terra");
    }
}
