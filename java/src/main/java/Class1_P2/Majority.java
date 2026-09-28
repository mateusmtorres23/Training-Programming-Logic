package Class1_P2;

import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Legal age");
        } else {
            System.out.println("Minor");
        }
        sc.close();
    }
}
