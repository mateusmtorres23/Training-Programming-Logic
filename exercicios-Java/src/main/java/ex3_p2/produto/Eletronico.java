package ex3_p2.produto;

public class Eletronico extends Produto {
    private int garantia;

    public Eletronico(String nome, String codigo, double preco, int garantia) {
        super(nome, codigo, preco);
        this.garantia = garantia;
    }

    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("Garantia: " + getGarantia());
    }

    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
