import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Ensimmäinen: ");
        int ekaLuku = Integer.parseInt(lukija.nextLine());

        System.out.print("Viimeinen: ");
        int tokaLuku = Integer.parseInt(lukija.nextLine());

        int i = 0;
        int summa = 0;

        while (i + ekaLuku <= tokaLuku) {
            summa += ekaLuku + i;
            i++;
        }
        System.out.println("Summa on " + summa);
    }
}