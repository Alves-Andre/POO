class SmartTV extends ProdutoEletronico {
    private Boolean alexaIntegrada;
    public SmartTV(String marca, String modelo, double preco, String tamanho, Boolean alexaIntegrada) {
        super(marca, modelo, preco, tamanho);
        this.alexaIntegrada  = alexaIntegrada;
    }
    public Boolean getAlexaIntegrada() {
        return alexaIntegrada;
    }
    public void setAlexaIntegrada(Boolean alexaIntegrada) {
        this.alexaIntegrada = alexaIntegrada;
    }
    
}