import java.util.Scanner;

public class KelvollistenLukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int kelvollisetLuvut = 0;

        while (true) {
            System.out.print("Syötä luku: ");
            int luku = Integer.parseInt(lukija.nextLine());

            if (luku == 9999) {
                break;
            }

            if (luku >= -140 && luku <= 20) {
                kelvollisetLuvut++;
                continue;
            }
            System.out.println("Kelvoton luku");
        }
        System.out.println("Kelvollisia lukuja yhteensä: " + kelvollisetLuvut);
    }
}