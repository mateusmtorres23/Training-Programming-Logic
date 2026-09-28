package ex2_p2.Veiculos;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, double preco, int numPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de portas: " + getNumPortas());
    }
    public void mostrarDados(boolean incluirPortas) {
        super.mostrarDados();
        if (incluirPortas) {
            System.out.println("Número de Portas: " + getNumPortas());
        }
    }

    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
