import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla Agentti-luokkaasi.

        Agentti bond = new Agentti("James", "Bond");

        bond.toString(); // ei tulosta mitään
        System.out.println(bond);

        Agentti ionic = new Agentti("Ionic", "Bond");
        System.out.println(ionic);
    }
}
