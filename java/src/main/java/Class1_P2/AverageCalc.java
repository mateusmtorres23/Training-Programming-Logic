package Class1_P2;

import java.util.Scanner;
public class AverageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade1 = sc.nextInt();
        double grade2 = sc.nextInt();
        double media = (grade2+grade1)/2;
        if(media<7.0){
            System.out.println("reprovado");
        } else{
            System.out.println("aprovado");
        }
        sc.close();
    }

}
