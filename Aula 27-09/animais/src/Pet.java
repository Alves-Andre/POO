
public class Pet {
    public String nome;
    public String classe;
    public String familia;
    public Integer idade;
    public boolean estadoVida;
    public Integer calorias;
    public Integer forca;

    public Pet(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.estadoVida = true;
        this.calorias = 10;
        this.forca = 10;
    }

    public void comer() {
        if (this.calorias<=99){
            System.out.println("Seu pet comeu ");
            if (this.calorias>=90){
                this.calorias = 100;
                this.forca -=2;
                if (this.forca<0){
                    this.forca =0;
                }
            }
            else {
                this.calorias+=10;
                this.forca -=2;
                if (this.forca<0){
                    this.forca =0;
                }
            }
        }
        else{
            System.out.println("Seu pet está cheio");
        }
    }

    public void correr() {
        if (this.calorias>=5){
            System.out.println("Seu pet "+this.nome+" correu!");
            this.calorias -=5;
            if (this.forca>=5){
                this.forca-=5;
            }
            else {
                this.forca = 0;
            }
        }else {
            System.out.println("Seu pet não tem energia suficiente para correr");
        }
    }

    public void dormir() {
        System.out.println("Seu pet "+this.nome+" dormiu");
        this.forca+=10;
        if (this.calorias>=2){
            this.calorias-=2;
        }else {
            this.calorias = 0;
        }
    }

    public void morrer() {
        System.out.println("Seu pet "+this.nome+" infelismente morreu");
        this.estadoVida = false;
    }

    public void status() {
        System.out.println("Idade: "+this.idade);
        System.out.println("Vida: "+this.estadoVida);
        System.out.println("Calorias: "+this.calorias);
        System.out.println("Força: "+this.forca);
    }

    public boolean verificaVida() {
        return this.estadoVida;
    }

    public void envelhever() {
        this.idade+=1;
    }

}
