import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            lista.add(luettu);
        }
        System.out.print("Ketä etsitään: ");
        String etsitaan = lukija.nextLine();

        if (lista.contains(etsitaan)) {
            System.out.println(etsitaan + " löytyi!");
        } else {
            System.out.println(etsitaan + " ei löytynyt!");
        }
    }
}