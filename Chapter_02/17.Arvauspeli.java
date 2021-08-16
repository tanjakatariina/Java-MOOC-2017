import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvattava = 7;
        int arvattuLkm = 0;

        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");

        while (true) {
            System.out.print("Arvaa luku: ");
            int arvattuLuku = Integer.parseInt(lukija.nextLine());

            if (arvattuLuku == arvattava) {
                arvattuLkm++;
                break;
            }

            if (arvattuLuku <= 10 && arvattuLuku >= 1) {
                System.out.println("Ei ollut!");
                arvattuLkm++;
                continue;
            }
            System.out.println("Epäkelpo luku!");
        }
        System.out.println("Oikein! Arvauksia yhteensä: " + arvattuLkm);
    }
}