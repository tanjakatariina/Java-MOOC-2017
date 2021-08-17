public class VahenevaLaskuri {

    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon
    private int alkuarvo;

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.alkuarvo = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        if (this.arvo > 0) {
            this.arvo--;
        }
    }

    public void nollaa() {
        if (this.arvo > 0) {
            this.arvo = 0;
        }
    }

    public void palautaAlkuarvo() {
        this.arvo = this.alkuarvo;
    }
}