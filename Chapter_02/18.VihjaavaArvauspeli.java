import java.util.Scanner;

public class VihjaavaArvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int arvattava = 42;
        int arvattuLkm = 0;
        int arvattuLuku = 0;

        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");

        while (true) {
            System.out.print("Arvaa luku: ");
            arvattuLuku = Integer.parseInt(lukija.nextLine());

            if (arvattuLuku == arvattava) {
                arvattuLkm++;
                break;
            }

            if (arvattuLuku > 0 && arvattuLuku <= 100) {
                arvattuLkm++;
                if (arvattava > arvattuLuku) {
                    System.out.println("Lukuni on isompi!");
                    continue;
                } else {
                    System.out.println("Lukuni on pienempi!");
                    continue;
                }
            }

            System.out.println("Epäkelpo luku!");
        }
        System.out.println("Oikein! Arvauksia yhteensä: " + arvattuLkm);

    }
}