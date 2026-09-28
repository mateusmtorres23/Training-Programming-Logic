package ex2_p2.Veiculos;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String marca, double preco, int cilindradas) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + getCilindradas());
    }
    public void mostrarDados(boolean incluirCilindradas) {
        super.mostrarDados();
        if (incluirCilindradas) {
            System.out.println("Cilindradas: " + getCilindradas());
        }
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
