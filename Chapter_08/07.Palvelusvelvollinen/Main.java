public class Main {

    public static void main(String[] args) {
        Sivari sivari = new Sivari();
        Asevelvollinen asevelvollinen = new Asevelvollinen(2);

        System.out.println("Päiviä jäljellä sivari: " + sivari.paiviaJaljella());
        System.out.println("Päiviä jäljellä asevelvollinen: " + asevelvollinen.paiviaJaljella());

        sivari.palvele();
        asevelvollinen.palvele();

        System.out.println("Päiviä jäljellä sivari: " + sivari.paiviaJaljella());
        System.out.println("Päiviä jäljellä asevelvollinen: " + asevelvollinen.paiviaJaljella());

        asevelvollinen.palvele();
        System.out.println("Päiviä jäljellä asevelvollinen: " + asevelvollinen.paiviaJaljella());

        asevelvollinen.palvele();
        System.out.println("Päiviä jäljellä asevelvollinen: " + asevelvollinen.paiviaJaljella());
    }
}