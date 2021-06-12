import java.util.Scanner;

public class IkienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.print("Kerro nimi: ");
        String ekaNimi = lukija.nextLine();

        System.out.print("Kerro ikä: ");
        int ekaIka = Integer.parseInt(lukija.nextLine());

        System.out.print("Kerro nimi: ");
        String tokaNimi = lukija.nextLine();

        System.out.print("Kerro ikä: ");
        int tokaIka = Integer.parseInt(lukija.nextLine());

        int yhteensa = ekaIka + tokaIka;

        System.out.println(ekaNimi + " ja " + tokaNimi + " ovat yhteensä "
                + yhteensa + " vuotta vanhoja.");
    }
}