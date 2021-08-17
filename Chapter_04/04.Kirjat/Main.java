import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();

            if (nimi.isEmpty()) {
                break;
            }

            System.out.print("Sivuja: ");
            int sivuja = Integer.parseInt(lukija.nextLine());

            System.out.print("Kirjoitusvuosi: ");
            int vuosi = Integer.parseInt(lukija.nextLine());

            if (!nimi.isEmpty()) {
                kirjat.add(new Kirja(nimi, sivuja, vuosi));
            }
        }

        System.out.print("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();

        for (Kirja tulostaa : kirjat) {
            if (tulostus.equals("kaikki")) {
                System.out.println(tulostaa);
            }

            if (tulostus.equals("nimi")) {
                System.out.println(tulostaa.getNimi());
            }
        }
    }
}