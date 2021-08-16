import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mihin asti? ");
        int loppuLuku = Integer.parseInt(lukija.nextLine());

        System.out.print("Mistä lähtien? ");
        int alkuLuku = Integer.parseInt(lukija.nextLine());;

        while (alkuLuku <= loppuLuku) {
            System.out.println(alkuLuku);
            alkuLuku++;
        }
    }
}