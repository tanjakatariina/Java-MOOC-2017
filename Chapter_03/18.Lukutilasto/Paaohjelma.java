import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;

        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();

        System.out.println("Anna lukuja:");

        while (luku != -1) {
            luku = Integer.parseInt(lukija.nextLine());

            if (luku != -1) {
                tilasto.lisaaLuku(luku);
                if (luku % 2 == 0) {
                    parilliset.lisaaLuku(luku);
                } else {
                    parittomat.lisaaLuku(luku);
                }
            }
        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + parilliset.summa());
        System.out.println("Parittomien : " + parittomat.summa());
    }
}