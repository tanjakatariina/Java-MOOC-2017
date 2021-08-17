import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while(true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }
            lista.add(luettu);
        }

        System.out.println("");

        int summa = 0;
        double keskiarvo = 0;

        for (int i = 0; i < lista.size(); i++) {
            summa += lista.get(i);
            keskiarvo = (double)summa / ((double)lista.size());

        }

        System.out.println("Keskiarvo: " + keskiarvo);
    }
}