public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimiAlussa) {
        this.nimi = nimiAlussa;
        this.ika = 0;
    }

    public void tulostaHenkilo() {
        System.out.println(this.nimi + ", ikä " + this.ika + " vuotta");
    }

    public void vanhene() {
        this.ika++;
    }

    public int palautaIka() {
        return this.ika;
    }
}