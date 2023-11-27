class Mamifero extends Animal {
    private String tipoPelo;

    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Pelo: " + tipoPelo);
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
}
