class Veiculo {
    private String nome;
    private double velocidadeMedia;

    public Veiculo(String nome, double velocidadeMedia) {
        this.nome = nome;
        this.velocidadeMedia = velocidadeMedia;
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }



    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }



    public double calcularTempoViagem(double distancia) {
        return distancia/velocidadeMedia;
    }
}