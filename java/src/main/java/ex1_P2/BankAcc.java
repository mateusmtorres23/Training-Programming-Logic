package ex1_P2;
import java.util.Scanner;

public class BankAcc {
    String name;
    int Acc;
    double balance = 1000.00;

    Scanner sc = new Scanner(System.in);

    public void showBalance(){
        System.out.println("your balance: " + this.balance);
    }

    public void deposit() {
        System.out.print("do you want to make a deposit?(y/n) ");
        String q = sc.nextLine();
        if (q.equals("y")) {
            System.out.println("how much do you want to deposit? ");
            double deposit = sc.nextDouble();
            sc.nextLine();
            this.balance += deposit;
            System.out.println("your new balance is: " + this.balance);
        } else {
            System.out.println("ok sir");
        }
    }

    public void withdraw() {
        System.out.print("do you want to make a withdraw?(y/n) ");
        String q = sc.nextLine();
        if (q.equals("y")) {
            System.out.println("how much do you want to withdraw? ");
            double withdraw = sc.nextDouble();
            sc.nextLine();
            if (withdraw > this.balance) {
                System.out.println("insufficient balance");
            } else {
                this.balance -= withdraw;
                System.out.println("your new balance is: " + this.balance);
            }
        } else {
    System.out.println("ok sir");
        }
    }

    public static void main(String[] args) {
        BankAcc acc1 = new BankAcc();
        acc1.name = "Geraldo";
        acc1.Acc = 123456;
        System.out.println("Welcome " + acc1.name + " to your account number: " + acc1.Acc);
        acc1.showBalance();
        acc1.deposit();
        acc1.withdraw();
        acc1.showBalance();
    }
}
