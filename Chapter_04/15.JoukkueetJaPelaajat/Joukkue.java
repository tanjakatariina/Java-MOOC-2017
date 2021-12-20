import java.util.ArrayList;

public class Joukkue {

    private String nimi;
    private ArrayList<Pelaaja> pelaajat;
    private int maksimikoko;

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.pelaajat = new ArrayList<Pelaaja>();
        this.maksimikoko = 16;
    }

    public String haeNimi() {
        return this.nimi;
    }

    public void lisaaPelaaja(Pelaaja pelaaja) {
        if (this.pelaajat.size() < this.maksimikoko) {
            this.pelaajat.add(pelaaja);
        }
    }

    public void tulostaPelaajat() {
        for (Pelaaja pelaaja : pelaajat) {
            System.out.println(pelaaja);
        }
    }

    public void asetaMaksimikoko(int maksimikoko) {
        this.maksimikoko = maksimikoko;
    }

    public int koko() {
        return this.pelaajat.size();
    }

    public int maalit() {
        int kaikkiMaalit = 0;

        for (Pelaaja pelaaja : pelaajat) {
            kaikkiMaalit += pelaaja.maalit();
        }

        return kaikkiMaalit;
    }

}