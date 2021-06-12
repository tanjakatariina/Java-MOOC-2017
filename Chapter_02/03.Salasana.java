import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        while (true) {
            System.out.print("Anna salasana: ");
            String syote = lukija.nextLine();

            if (salasana.equals(syote)) {
                System.out.println("Oikein!");
                System.out.println("Salaisuus on: Terve!");
                break;
            } else {
                System.out.println("Väärin!");
            }
        }
    }
}