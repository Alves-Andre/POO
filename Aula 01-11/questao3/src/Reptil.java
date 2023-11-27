class Reptil extends Animal {
    private String tipoEscama;

    public Reptil(String nome, int idade, String tipoEscama) {
        super(nome, idade);
        this.tipoEscama = tipoEscama;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Escama: " + tipoEscama);
    }

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }
}