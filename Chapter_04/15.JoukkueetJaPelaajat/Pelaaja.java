public class Pelaaja {

    private String nimi;
    private int maalit;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.maalit = 0;
    }

    public Pelaaja(String nimi, int maalit) {
        this.nimi = nimi;
        this.maalit = maalit;
    }

    public String haeNimi() {
        return this.nimi;
    }

    public int maalit() {
        return this.maalit;
    }

    @Override
    public String toString() {
        return this.haeNimi() + ", maaleja " + this.maalit();
    }

}