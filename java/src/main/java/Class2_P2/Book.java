package Class2_P2;

public class Book {
    String tit, aut;
    int quantP;
    boolean emp = false;

    public void emprestar() {
        this.emp = true;
    }
    public void devolver(){
        this.emp = false;
    }
    public void exibirInfo() {
        System.out.println();
        System.out.println("Título: " + tit);
        System.out.println("Autor: " + aut);
        System.out.println("Quantidade de paginas: " + quantP);
        System.out.println("Status: " + emp);
    }
}
