public class Tuote {

    private String tuote;
    private double hinta;
    private int lukumaara;

    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.tuote = nimiAlussa;
        this.hinta = hintaAlussa;
        this.lukumaara = maaraAlussa;
    }

    public void tulostaTuote() {
        System.out.println(this.tuote + ", hinta " + this.hinta + ", " + this.lukumaara + " kpl");
    }
}