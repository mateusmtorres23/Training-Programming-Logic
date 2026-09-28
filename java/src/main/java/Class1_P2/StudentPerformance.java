package Class1_P2;

import java.util.Scanner;
public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double freq = sc.nextDouble();
        double media = (nota1+nota2)/2;
        System.out.printf("nome: %s%nnota 1: %.1f%nnota2 2: %.1f%nmedia: %.1f%nfrequência: %.1f%n",nome,nota1,nota2,media,freq);
        if(freq<75){
            System.out.println("Reprovado");
        } else if(media>=7){
            System.out.println("Aprovado");
        } else if(media<7 && media>=5){
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
