package Class3_P2;

import java.util.Scanner;

public class BankAccGS {
    private final String holder;
    private final int accountNumber;
    private double balance;

    Scanner sc = new Scanner(System.in);

    public BankAccGS(String holder, int accountNumber, double balance) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public void mainLoop() {
        while (true) {
            infoAcc();
            System.out.println();
            deposit();
            System.out.println();
            infoAcc();
            System.out.println();
            withdraw();
            System.out.println();
            infoAcc();
            System.out.print("Do you want to exit the program?(y/n) ");
            String q = sc.nextLine();
            System.out.println();
            if (q.equals("y")) {
                break;
            }
        }

    }

    public void infoAcc() {
        System.out.println("Holder: " + getHolder());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
    public void deposit() {
        System.out.print("Do you want to make a deposit?(y/n) ");
        String q = sc.nextLine();
        if (q.equals("y")) {
            while (true) {
                System.out.print("How much? ");
                int hm = sc.nextInt();
                sc.nextLine();
                if (hm<0){
                    System.out.println("Error: The input cannot be negative. No changes were made");
                }else{
                    setBalance(getBalance() + hm);
                    break;
                }
            }
        }
    }
    public void withdraw() {
        System.out.print("Do you want to make a withdraw?(y/n) ");
        String q = sc.nextLine();
        if (q.equals("y")) {
            while (true) {
                System.out.print("How much? ");
                int hm = sc.nextInt();
                sc.nextLine();
                if (hm<0){
                    System.out.println("Error: The input cannot be negative. No changes were made");
                }else {
                    setBalance(getBalance() - hm);
                    break;
                }
            }
        }
    }

    public String getHolder() {
        return holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            this.balance = newBalance;
        } else {
            System.out.println("Error: Balance cannot be negative. No changes were made");
        }
    }

    public static void main(String[] args) {
        BankAccGS acc1 = new BankAccGS("Geraldo", 119045, 1000.00);
        acc1.mainLoop();
    }
}