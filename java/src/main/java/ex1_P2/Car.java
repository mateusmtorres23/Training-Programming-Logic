package ex1_P2;
import java.util.Scanner;
public class Car {
    String model, brand;
    int year, speed = 0;
    Scanner sc = new Scanner(System.in);

    public void accelerate() {
        System.out.print("how much do you want to accelerate? ");
        int acceleration = sc.nextInt();
        sc.nextLine();
        this.speed += acceleration;
        System.out.println("your new speed is: " + this.speed + " km/h");
    }
    public void brake() {
        System.out.print("how much do you want to brake? ");
        int brake = sc.nextInt();
        sc.nextLine();
        if (brake > this.speed) {
            this.speed = 0;
        } else {
            this.speed -= brake;
        }
        System.out.println("your new speed is: " + this.speed + " km/h");
    }
    public void showStatus() {
        System.out.println("Car model: " + this.model);
        System.out.println("Car brand: " + this.brand);
        System.out.println("Car year: " + this.year);
        System.out.println("Car speed: " + this.speed + " km/h");
    }
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Mustang GT";
        car1.brand = "Ford";
        car1.year = 2025;
        System.out.println("Welcome to your car!");
        car1.showStatus();
        car1.accelerate();
        car1.brake();
        car1.showStatus();
    }
}
