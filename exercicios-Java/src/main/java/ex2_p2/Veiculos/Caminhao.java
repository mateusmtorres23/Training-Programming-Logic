package ex2_p2.Veiculos;

public class Caminhao extends Veiculo {
    private double capacidadeCarga; // em toneladas

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de Carga: " + getCapacidadeCarga() + " toneladas");
    }
    public void mostrarDados(boolean incluirCarga) {
        super.mostrarDados();
        if (incluirCarga) {
            System.out.println("Capacidade de Carga: " + getCapacidadeCarga() + " toneladas");
        }
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
