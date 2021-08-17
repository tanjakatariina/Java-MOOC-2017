import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

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
        int summa = 0;

        for (int i = 0; i < lista.size(); i++) {
            summa += lista.get(i);
        }
        System.out.println("Summa: " + summa);
    }
}