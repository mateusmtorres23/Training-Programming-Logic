package cinema_ticket_ex;

import java.util.List;
import java.util.ArrayList;

public class Venda {
    private String formaPag;
    private List<String> tipos;
    private List<Integer> idades;

    public Venda(String formaPag, List<Integer> idades, List<String> tipos) {
        List<String> tiposCorrigidos = new ArrayList<>();

        for (int i = 0; i < idades.size(); i++) {
            int idade = idades.get(i);
            String tipo = tipos.get(i);
            if (idade < 0 || idade > 120) {
                throw new IllegalArgumentException("Erro: Idade inválida encontrada: " + idade);
            }
            if (idade <= 5) {
                tipo = "gratuito";
            }
            else if (!tipo.equals("inteira") && !tipo.equals("meia") && !tipo.equals("promocional")) {
                throw new IllegalArgumentException("Erro: Tipo de ingresso inválido: " + tipo);
            }
            tiposCorrigidos.add(tipo);
        }
        this.formaPag = formaPag;
        this.idades = idades;
        this.tipos = tiposCorrigidos;
    }

    public String getFormaPag() {
        return formaPag;
    }
    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }
    public List<Integer> getIdades() {
        return idades;
    }
    public List<String> getTipos() {
        return tipos;
    }
    public int getQuantIng() {
        return this.idades.size();
    }
    public double getValorTotal() {
        double valorTotal = 0.0;
        for (String tipo : this.tipos) {
            switch (tipo) {
                case "inteira" -> valorTotal += 30.00;
                case "meia" -> valorTotal += 15.00;
                case "promocional" -> valorTotal += 21.00;
            }
        }
        return valorTotal;
    }

    public static void main(String[] args) {
    }
}
