package ex3_p2.produto;

public class Alimento extends Produto {
    private int dataValidade;

    public Alimento(String nome, String codigo, double preco, int garantia) {
        super(nome, codigo, preco);
        this.dataValidade = garantia;
    }

    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("Data de validade: " + getDataValidade());
    }

    public int getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }
}
