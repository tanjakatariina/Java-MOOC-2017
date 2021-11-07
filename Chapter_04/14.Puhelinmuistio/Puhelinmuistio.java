import java.util.ArrayList;

public class Puhelinmuistio {
    private ArrayList<Henkilo> muistio;

    public Puhelinmuistio() {
        this.muistio = new ArrayList<>();
    }

    public void lisaa(String nimi, String numero) {
        this.muistio.add(new Henkilo(nimi, numero));
    }

    public void tulostaKaikki() {
        for (Henkilo henkilo : muistio) {
            System.out.println(henkilo);
        }
    }

    public String haeNumero(String nimi) {
        for (Henkilo henkilo : muistio) {
            if (henkilo.haeNimi().equals(nimi)) {
                return henkilo.haeNumero();
            }
        }
        return "Numero ei tiedossa";
    }
}