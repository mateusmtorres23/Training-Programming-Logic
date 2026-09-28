package ex3_p2.produto;

public class Vestuario extends Produto{
    private String tamanho;
    private String cor;

    public Vestuario(String nome, String codigo, double preco, String tamanho, String cor) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public void MostrarDados() {
        super.MostrarDados();
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Cor: " + getCor());
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
}
