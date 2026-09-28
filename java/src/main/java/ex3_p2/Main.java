package ex3_p2;

import ex3_p2.produto.Alimento;
import ex3_p2.produto.Eletronico;
import ex3_p2.produto.Vestuario;

public class Main {
    public static void main(String[] args) {
        Alimento alimento = new Alimento("Arroz", "A123", 20.0, 20251231);
        Eletronico eletronico = new Eletronico("Smartphone", "E456", 1500.0, 24);
        Vestuario vestuario = new Vestuario("Camiseta", "V789", 50.0, "M", "Azul");
        alimento.MostrarDados();
        System.out.println();
        eletronico.MostrarDados();
        System.out.println();
        vestuario.MostrarDados();
    }
}
