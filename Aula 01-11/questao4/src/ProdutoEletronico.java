class ProdutoEletronico {
    private String marca;
    private String modelo;
    private double preco;
    private String tamanho;

    public ProdutoEletronico(String marca, String modelo, double preco, String tamanho) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public double calcularDesconto() {
        double desconto = 0.0;
        if (marca.equals("Samsung") && modelo.equals("Galaxy S20")) {
            desconto = 0.1 * preco;
        } else if (marca.equals("Apple") && modelo.equals("MacBook Pro")) {
            desconto = 0.15 * preco; 
        }else {
            desconto = 0.05 * preco;
        }
        return desconto;
    }
}