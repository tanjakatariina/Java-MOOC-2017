import java.util.Scanner;

public class Laskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());

        System.out.print("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());

        System.out.print("Anna operaatio: ");
        String operaatio = lukija.nextLine();

        if (operaatio.equals("+")) {
            int summa = eka + toka;
            System.out.println(eka + " + " + toka + " = " + summa);
        } else if (operaatio.equals("-")) {
            int miinus = eka - toka;
            System.out.println(eka + " - " + toka + " = " + miinus);
        } else if (operaatio.equals("*")) {
            int kerto = eka * toka;
            System.out.println(eka + " * " + toka + " = " + kerto);
        } else if (operaatio.equals("/")) {
            double jako = (double) eka / toka;
            System.out.println(eka + " / " + toka + " = " + jako);
        } else {
            System.out.println("Operaatiota ei tunnistettu!");
        }
    }
}