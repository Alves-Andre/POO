class Smartphone extends ProdutoEletronico {
    private Boolean nfc;
    public Smartphone(String marca, String modelo, double preco, String tamanho, Boolean nfc) {
        super(marca, modelo, preco, tamanho);
        this.nfc = nfc;
    }
    public Boolean getNfc() {
        return nfc;
    }
    public void setNfc(Boolean nfc) {
        this.nfc = nfc;
    }
    
}