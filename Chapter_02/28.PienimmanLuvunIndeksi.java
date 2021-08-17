import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());

            if (luettu == 9999) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        int pienin = lista.get(0);
        int i = 0;
        while (i < lista.size()) {
            int luku = lista.get(i);

            if (pienin > luku) {
                pienin = luku;
            }

            i++;
        }

        System.out.println("Pienin luku on " + pienin);

        int j = 0;
        while (j < lista.size()) {

            if (lista.get(j) == pienin) {
                System.out.println("Pienin luku löytyy indeksistä " + j);
            }
            j++;
        }
    }
}