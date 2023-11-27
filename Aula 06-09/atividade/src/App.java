public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    Livro biblia = new Livro("Bíblia Sagrada", "Sociedade Bíblica do Brasil", "1/1/1", "9788531102981", "português", "Deus");
    Livro anne = new Livro("Anne with an E", "Saraiva", "10/12/1865",  "12863817231", "Português", "Anne Shirley");    

    Biblioteca catolica = new Biblioteca("Unicatolica","1202 Sul");

    catolica.livros.add(biblia);
    catolica.livros.add(anne);
        
    catolica.visualizarLivros();
    }
}
