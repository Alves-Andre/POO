
public class Apartamentos {
    public Integer numero;
    public Integer tamanho;
    public String bloco;
    public Boolean mobiliado;
    public Boolean disponivel;
    
    Apartamentos(){

    }

    public Apartamentos(Integer numero, Integer tamanho, String bloco, Boolean mobiliado, Boolean disponivel) {
        this.numero = numero;
        this.tamanho = tamanho;
        this.bloco = bloco;
        this.mobiliado = mobiliado;
        this.disponivel = disponivel;
    }

    public void info(){
        System.out.println("Número: "+this.numero+"; tamanho: "+this.tamanho+"; Bloco: "+this.tamanho+"; mobiliado: "+this.mobiliado+"; Disponível: "+this.disponivel);
    }
    
}
