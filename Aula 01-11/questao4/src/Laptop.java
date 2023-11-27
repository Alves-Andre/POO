class Laptop extends ProdutoEletronico {
    private Boolean toutchScreen;
    public Laptop(String marca, String modelo, double preco, String tamanho, Boolean toutchScreen) {
        super(marca, modelo, preco, tamanho);
        this.toutchScreen = toutchScreen;
    }
    public Boolean getToutchScreen() {
        return toutchScreen;
    }
    public void setToutchScreen(Boolean toutchScreen) {
        this.toutchScreen = toutchScreen;
    }
    
}