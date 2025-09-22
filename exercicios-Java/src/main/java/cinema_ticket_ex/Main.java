package cinema_ticket_ex;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    Scanner sc = new Scanner(System.in);

    public void mainLoop() {
        Financeiro financeiro = new Financeiro();
        while (true) {
            List<String> tipos = new ArrayList<>();
            List<Integer> idades = new ArrayList<>();
            System.out.println("Bem-vindo ao sistema de vendas de ingressos!");
            System.out.print("Quantos ingressos deseja comprar? ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Qual o tipo de ingresso do cliente "+ (i+1) +" (inteira, meia, promocional)? ");
                String tipo = sc.nextLine().trim().toLowerCase();
                tipos.add(tipo);
            }
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Qual a idade do cliente "+(i+1)+"? ");
                int idade = sc.nextInt();
                idades.add(idade);
            }
            System.out.print("Qual a forma de pagamento (dinheiro, cartao)? ");
            String formaPag = sc.next().trim().toLowerCase();
            Venda venda = new Venda(formaPag, idades, tipos);
            System.out.printf("Total a pagar: R$ %.2f%n", venda.getValorTotal());
            if (formaPag.equals("dinheiro")){
                System.out.print("Qual o valor recebido? R$ ");
                double valorRecebido = sc.nextDouble();
                if (valorRecebido < venda.getValorTotal()) {
                    System.out.println("Erro: Valor insuficiente. Venda cancelada.");
                    continue;
                } else {
                    double troco = valorRecebido - venda.getValorTotal();
                    System.out.printf("Troco: R$ %.2f%n", troco);
                }
            }
            financeiro.registerSale(venda);
            System.out.print("Deseja realizar outra venda? (s/n) ");
            String resposta = sc.next().trim().toLowerCase();
            System.out.println();
            if (resposta.equals("n")) {
                break;
            }
        }
        financeiro.displayFinalReport();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.mainLoop();
    }
}
