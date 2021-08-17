import java.util.ArrayList;
import java.util.Scanner;

public class FibonaccinLukujono {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(1);

        int i = 2;
        while (i < 40) {
            lista.add(lista.get(i - 1) + lista.get(i - 2));
            i++;
        }

        while (true) {
            System.out.print("Monesko luku? ");
            int luettu = Integer.parseInt(lukija.nextLine());

            if (luettu == -1) {
                break;
            }

            System.out.println(lista.get(luettu));

        }
        System.out.println("");
        System.out.println("Kiitos!");
    }
}