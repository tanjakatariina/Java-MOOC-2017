import java.util.Scanner;

public class MarsinLampotilanKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;
        int summa = 0;
        int lukuja = 0;
        double keskiarvo = 0;

        while(true) {
            System.out.print("Syötä mittaus: ");
            luku = Integer.parseInt(lukija.nextLine());

            if (luku == 9999) {
                break;
            }

            if (luku >= -140 && luku <= 20) {
                summa += luku;
                lukuja++;
                continue;
            }
            System.out.println("Kelvoton luku, lukua ei lasketa.");
        }
        System.out.println("");
        keskiarvo = (double)summa / (double)lukuja;
        System.out.println("Mittausten keskiarvo: " + keskiarvo);
    }
}