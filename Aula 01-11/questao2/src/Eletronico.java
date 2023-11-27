class Eletronico extends Produto {
    private double taxaImpostoEletronico;

    public Eletronico(String nome, double precoBase) {
        super(nome, precoBase);
        this.taxaImpostoEletronico = 0.1;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoComImposto = precoBase * (1 + taxaImpostoEletronico);
        return precoComImposto;
    }
}
