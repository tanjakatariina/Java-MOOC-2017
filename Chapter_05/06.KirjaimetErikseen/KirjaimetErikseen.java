import java.util.Scanner;

public class KirjaimetErikseen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna Nimi: ");
        String merkkijono = lukija.nextLine();

        int i = 0;
        while (i < merkkijono.length()) {
            System.out.println((i + 1) + ". kirjain: " + merkkijono.charAt(i));
            i++;
        }
    }
}