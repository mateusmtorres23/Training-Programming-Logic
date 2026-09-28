package ex2_p2.Veiculos;

public class Veiculo {
    private String placa, marca;
    private double preco;

    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Preço: " + getPreco());
    }
    public void mostrarDados(double desconto) {
        double percentual = 1.0 - (desconto / 100.0);
        double precoComDesconto = this.preco * percentual;

        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Preço com " + desconto + "% de desconto: " + precoComDesconto);
    }

    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public double getPreco() {
        return preco;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
