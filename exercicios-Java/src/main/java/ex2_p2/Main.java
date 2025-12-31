import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Veiculos.*;

import Banco.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            exibirMenuPrincipal();
            if(sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine();
            }else {
                System.out.println("\nERRO: Por favor, digite um número inteiro.");
                sc.nextLine();
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n--- Módulo: Gestão de Veículos selecionado. ---");
                    execVeiculos(sc);
                }
                case 2 -> {
                    System.out.println("\n--- Módulo: Gestão Bancária selecionado. ---");
                    execBanco(sc);
                }
                case 0 -> {
                    System.out.println("\nEncerrando o sistema. Obrigado e até mais!");
                }
                default -> {
                    System.out.println("\nOpção inválida. Escolha 1, 2, ou 0 para sair.");
                }
            }
        } while (opcao != 0);
    }

    private static void exibirMenuPrincipal(){
        System.out.println("--- BEM-VINDO AO SISTEMA ---");
        System.out.println("1 - Sistema de veiculos");
        System.out.println("2 - Sistema bancario");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    private static void exibirMenuVeiculos(){
        System.out.println("=============================================");
        System.out.println("GESTÃO DE VEÍCULOS - MENU");
        System.out.println("1 - Cadastrar Carro");
        System.out.println("2 - Cadastrar Moto");
        System.out.println("3 - Cadastrar Caminhão");
        System.out.println("0 - Voltar ao Menu Principal");
        System.out.print("Sua opção: ");
    }
    private static void exibirMenuBanco(){
        System.out.println("=============================================");
        System.out.println("GESTÃO BANCÁRIA - MENU");
        System.out.println("1 - Cadastrar Conta Corrente");
        System.out.println("2 - Cadastrar Conta Poupança");
        System.out.println("3 - Cadastrar Conta Investimento");
        System.out.println("0 - Voltar ao Menu Principal");
        System.out.print("Sua opção: ");
    }

    private static void execVeiculos(Scanner sc){
        List<Veiculo> veiculosCadastrados = new ArrayList<>();
        int opcaoVei = -1;

        System.out.println("\n--- Módulo: Gestão de Veículos ---");

        do {
            exibirMenuVeiculos();

            if (sc.hasNextInt()){
                opcaoVei = sc.nextInt();
                sc.nextLine();
            }else{
                System.out.println("\nERRO: Por favor, digite um número inteiro.");
                sc.nextLine();
                continue;
            }

            String placa = "", marca = "";
            double preco = 0.0;

            switch (opcaoVei){
                case 1 -> {
                    System.out.print("Placa: ");
                    placa = sc.nextLine();
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Preço: ");
                    preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Número de Portas: ");
                    int numPortas = sc.nextInt();
                    sc.nextLine();
                    veiculosCadastrados.add(new Carro(placa, marca, preco, numPortas));
                    System.out.println("\nCarro cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.print("Placa: ");
                    placa = sc.nextLine();
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Preço: ");
                    preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Cilindradas: ");
                    int cilindradas = sc.nextInt();
                    sc.nextLine();
                    veiculosCadastrados.add(new Moto(placa, marca, preco, cilindradas));
                    System.out.println("\nMoto cadastrada com sucesso!");
                }
                case 3 -> {
                    System.out.print("Placa: ");
                    placa = sc.nextLine();
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Preço: ");
                    preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Capacidade de Carga (toneladas): ");
                    double capacidadeCarga = sc.nextDouble();
                    sc.nextLine();
                    veiculosCadastrados.add(new Caminhao(placa, marca, preco, capacidadeCarga));
                    System.out.println("\nCaminhão cadastrado com sucesso!");
                }
                case 0 -> {
                    System.out.println("\nRetornando ao Menu Principal.");
                }
                default -> {
                    System.out.println("\nOpção inválida. Escolha 1, 2, ou 0 para sair.");
                }
            }
        }while (opcaoVei != 0);
        if (!veiculosCadastrados.isEmpty()) {
            System.out.print("\nDeseja exibir os dados avançados (portas, cilindradas, carga)? (S/N): ");
            String resp = sc.nextLine();

            System.out.println("\n=============================================");
            System.out.println("VEÍCULOS CADASTRADOS:");
            System.out.println("=============================================");
            for (Veiculo v : veiculosCadastrados) {
                System.out.println("\nTipo de Veículo: " + v.getClass().getSimpleName());

                if (resp.equalsIgnoreCase("S")) {
                    if (v instanceof Carro) {
                        ((Carro) v).mostrarDados(true);
                    } else if (v instanceof Moto) {
                        ((Moto) v).mostrarDados(true);
                    } else if (v instanceof Caminhao) {
                        ((Caminhao) v).mostrarDados(true);
                    } else {
                        v.mostrarDados();
                    }
                } else {
                    v.mostrarDados();
                }
                System.out.println("---------------------------------------------");
            }
        }
    }

    private static void execBanco(Scanner sc){
        List<Conta> contasCadastrados = new ArrayList<>();
        int opcaoBan = -1;

        do{
            exibirMenuBanco();

            if (sc.hasNextInt()){
                opcaoBan = sc.nextInt();
                sc.nextLine();
            }else {
                System.out.println("\nERRO: Por favor, digite um número inteiro.");
                sc.nextLine();
                continue;
            }

            String numero, titular;
            double saldo;

            switch (opcaoBan){
                case 1 -> {
                    System.out.print("Número da Conta Corrente: ");
                    numero = sc.nextLine();
                    System.out.print("Titular: ");
                    titular = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    saldo = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Limite: ");
                    double limite = sc.nextDouble();
                    sc.nextLine();
                    contasCadastrados.add(new ContaCorrente(numero, titular, saldo, limite));
                    System.out.println("\nConta Corrente cadastrada com sucesso!");
                }
                case 2 -> {
                    System.out.print("Número da Conta Poupança: ");
                    numero = sc.nextLine();
                    System.out.print("Titular: ");
                    titular = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    saldo = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Taxa de rendimento (%): ");
                    double taxaRendimento = sc.nextDouble();
                    sc.nextLine();
                    contasCadastrados.add(new ContaPoupanca(numero, titular, saldo, taxaRendimento));
                    System.out.println("\nConta Poupança cadastrada com sucesso!");
                }
                case 3 -> {
                    System.out.print("Número da Conta Investimento: ");
                    numero = sc.nextLine();
                    System.out.print("Titular: ");
                    titular = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    saldo = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Taxa de rendimento (%): ");
                    double taxaRendimento = sc.nextDouble();
                    sc.nextLine();
                    contasCadastrados.add(new ContaInvestimento(numero, titular, saldo, taxaRendimento));
                    System.out.println("\nConta Investimento cadastrada com sucesso!");
                }
                case 0 -> {
                    System.out.println("\nRetornando ao Menu Principal.");
                }
            }
                System.out.println();
        }while (opcaoBan != 0);
        if (!contasCadastrados.isEmpty()) {
            System.out.print("\nDeseja exibir os dados avançados (limite, projeções, taxas)? (S/N): ");
            String resp = sc.nextLine();

            System.out.println("\n=============================================");
            System.out.println("CONTAS CADASTRADAS:");
            System.out.println("=============================================");
            for (Conta c : contasCadastrados) {
                System.out.println("\nTipo de Conta: " + c.getClass().getSimpleName());

                if (resp.equalsIgnoreCase("S")) {
                    if (c instanceof ContaCorrente) {
                        ((ContaCorrente) c).mostrarDados(true);
                    } else if (c instanceof ContaPoupanca) {
                        ((ContaPoupanca) c).mostrarDados(true);
                    } else if (c instanceof ContaInvestimento) {
                        ((ContaInvestimento) c).mostrarDados(true);
                    } else {
                        c.mostrarDados(1.0);
                    }
                } else {
                    c.mostrarDados();
                }
                System.out.println("---------------------------------------------");
            }
        }
    }
}