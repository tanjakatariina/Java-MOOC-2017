import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna pisteet [0-100]: ");
        int arvosana = Integer.parseInt(lukija.nextLine());

        if (arvosana > 100) {
            System.out.println("uskomatonta!");
        } else if (arvosana >= 91) {
            System.out.println("Arvosana: 5");
        } else if (arvosana >= 81) {
            System.out.println("Arvosana: 4");
        } else if (arvosana >= 71) {
            System.out.println("Arvosana: 3");
        } else if (arvosana >= 61) {
            System.out.println("Arvosana: 2");
        } else if (arvosana >= 51) {
            System.out.println("Arvosana: 1");
        } else if (arvosana >= 0) {
            System.out.println("Arvosana: hylätty");
        } else {
            System.out.println("mahdotonta!");
        }
    }
}