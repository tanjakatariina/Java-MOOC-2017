import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        System.out.print("Mitä etsitään? ");
        int etsitaan = Integer.parseInt(lukija.nextLine());
        int i = 0;

        while (i < lista.size()) {

            if (lista.get(i) == etsitaan) {
                System.out.println("Luku " + etsitaan + " on indeksissä " + i);
            }

            if (!lista.contains(etsitaan)) {
                System.out.println("Lukua " + etsitaan + " ei löydy.");
                break;
            }

            i++;

        }
    }
}