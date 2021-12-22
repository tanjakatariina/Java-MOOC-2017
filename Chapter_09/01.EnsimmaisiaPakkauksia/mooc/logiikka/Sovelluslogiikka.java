package mooc.logiikka;

import mooc.ui.Kayttoliittyma;

public class Sovelluslogiikka {

    private Kayttoliittyma kayttoliittyma;

    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma) {
        this.kayttoliittyma = kayttoliittyma;
    }

    public void suorita(int montaKertaa) {
        int i = 0;
        while (i < montaKertaa) {
            System.out.println("Sovelluslogiikka toimii");
            this.kayttoliittyma.paivita();
            i++;
        }
    }

}