import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä luvut: ");

        int luku = Integer.parseInt(lukija.nextLine());
        int summa = 0;
        int lukumaara = 0;
        double keskiarvo = 0;
        int parilliset = 0;
        int parittomat = 0;

        while (luku != -1) {
            if (luku % 2 == 0) {
                parilliset++;
            } else {
                parittomat++;
            }

            lukumaara++;
            summa += luku;
            keskiarvo = 1.0 * summa / lukumaara;
            luku = Integer.parseInt(lukija.nextLine());
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukumaara);
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parilliset);
        System.out.println("Parittomia: " + parittomat);
    }
}