package ex3_p2.produto;

public class Produto {
    private final String nome, codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;

    }

    public void MostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Código: " + getCodigo());
        System.out.println("Preço: R$" + getPreco());
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

}

