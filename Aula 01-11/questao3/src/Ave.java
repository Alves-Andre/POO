class Ave extends Animal {
    private String tipoPena;

    public Ave(String nome, int idade, String tipoPena) {
        super(nome, idade);
        this.tipoPena = tipoPena;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Pena: " + tipoPena);
    }

    public String getTipoPena() {
        return tipoPena;
    }

    public void setTipoPena(String tipoPena) {
        this.tipoPena = tipoPena;
    }
}