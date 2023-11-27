class Vestuario extends Produto {
    private double taxaImpostoVestuario;

    public Vestuario(String nome, double precoBase) {
        super(nome, precoBase);
        this.taxaImpostoVestuario = 0.09;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoComImposto = precoBase * (1 + taxaImpostoVestuario);
        return precoComImposto;
    }
}