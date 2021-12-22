package henkilot;

public class Opiskelija extends Henkilo {

    private int pisteet;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.pisteet = 0;
    }

    public void opiskele() {
        this.pisteet++;
    }

    public int opintopisteita() {
        return this.pisteet;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + this.pisteet;
    }
}