public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha((this.euroa + lisattava.euroa), (this.senttia + lisattava.senttia)); // luodaan uusi Raha-olio jolla on oikea arvo

        // palautetaan uusi Raha-olio
        return uusi;
    }

    public boolean vahemman(Raha verrattava) {
        if (this.euroa < verrattava.euroa) {
            return true;
        }

        if (this.euroa == verrattava.euroa && this.senttia < verrattava.senttia) {
            return true;
        }

        return false;
    }

    public Raha miinus(Raha vahentaja) {
        int eurot = this.euroa - vahentaja.eurot();
        int sentit = this.senttia - vahentaja.sentit();

        if (sentit < 0) {
            sentit += 100;
            eurot--;
        }

        // jos raha menisi negatiiviseksi, palautetaan nolla
        if (eurot < 0) {
            return new Raha(0, 0);
        }

        return new Raha(eurot, sentit);
    }

    @Override
    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }

}