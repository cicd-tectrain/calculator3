
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner benutzereingabe = new Scanner(System.in);
        double x;
        double y;

        Calculator calculator = new Calculator();
        System.out.println("Bitte geben Sie die erste Zahl ein: ");
        x = benutzereingabe.nextDouble();
        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        y = benutzereingabe.nextDouble();
        double summe = x + y;
        System.out.println(x + " + " + y + " = " + summe);



    }
}