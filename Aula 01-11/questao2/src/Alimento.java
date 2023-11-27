class Alimento extends Produto {
    private double taxaImpostoAlimento;

    public Alimento(String nome, double precoBase) {
        super(nome, precoBase);
        this.taxaImpostoAlimento = 0.05;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoComImposto = precoBase * (1 + taxaImpostoAlimento);
        return precoComImposto;
    }
}