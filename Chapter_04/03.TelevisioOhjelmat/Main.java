import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa Ohjelma käyttävä ohjelmasi tänne

        ArrayList<Ohjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();

            if (nimi.isEmpty()) {
                break;
            }

            System.out.print("Pituus: ");
            int pituus = Integer.parseInt(lukija.nextLine());

            ohjelmat.add(new Ohjelma(nimi, pituus));
        }

        System.out.println("");
        System.out.print("Ohjelman maksimipituus? ");
        int maxPituus = Integer.parseInt(lukija.nextLine());

        int i = 0;
        while (i < ohjelmat.size()) {
            Ohjelma ohjelma = ohjelmat.get(i);

            if (ohjelma.getPituus() <= maxPituus) {
                System.out.println(ohjelma);
            }

            i++;
        }
    }
}