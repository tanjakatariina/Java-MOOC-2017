import java.util.Scanner;

public class YmpyranKehanPituus {
    public static void main(String[] args) {
        // Ota käyttöön scanner
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ympyrän säde: ");
        // Lue käyttäjältä syöte, muuta se kokonaisluvuksi ja kopioi sade
        // kokonaisluku muuttujaan
        int sade = Integer.parseInt(lukija.nextLine());

        // Laske ympyrän kehä
        double keha = 2 * Math.PI * sade;
        System.out.print("Ympyrän kehä: " + keha);
    }
}