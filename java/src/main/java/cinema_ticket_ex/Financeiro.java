package cinema_ticket_ex;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {

    private final List<Venda> vendas;

    public Financeiro() {
        this.vendas = new ArrayList<>();
    }

    public void registerSale(Venda venda) {
        if (venda != null) {
            getVendas().add(venda);
        }
    }

    public void displayFinalReport() {
        int totalTicketsSold = 0;
        int totalFullPrice = 0;
        int totalHalfPrice = 0;
        int totalPromotional = 0;
        int totalFree = 0;
        double totalRevenue = 0.0;

        for (Venda venda : getVendas()) {
            List<String> ticketTypes = venda.getTipos();
            totalTicketsSold += ticketTypes.size();

            for (String type : ticketTypes) {
                switch (type) {
                    case "inteira" -> totalFullPrice++;
                    case "meia" -> totalHalfPrice++;
                    case "promocional" -> totalPromotional++;
                    case "gratuito" -> totalFree++;
                }
            }
            totalRevenue += venda.getValorTotal();
        }
        System.out.println("\n--- Relatório Financeiro ---");
        System.out.println("Total de ingressos vendidos: " + totalTicketsSold);
        System.out.println(" - inteiras: " + totalFullPrice);
        System.out.println(" - meias: " + totalHalfPrice);
        System.out.println(" - promocionais: " + totalPromotional);
        System.out.println(" - gratuitos: " + totalFree);
        System.out.printf("Total arrecadado: R$ %.2f%n", totalRevenue);
    }

    public List<Venda> getVendas() {
        return vendas;
    }
}