public class YlhaaltaRajoitettuLaskuri {

    private int arvo;
    private int ylaraja;

    public YlhaaltaRajoitettuLaskuri(int ylarajanAlkuarvo) {
        this.arvo = 0;
        this.ylaraja = ylarajanAlkuarvo;
    }

    public void seuraava() {
        if (this.arvo >= this.ylaraja) {
            this.arvo = 0;
        } else {
            this.arvo++;
        }
    }

    public int arvo() {
        return this.arvo;
    }

    public void asetaArvo(int uusiArvo) {
        if(uusiArvo <= ylaraja && uusiArvo > 0) {
            this.arvo = uusiArvo;
        }
    }

    public int getArvo() {
        return this.arvo;
    }

    public int getYlaraja() {
        return this.ylaraja;
    }

    public String toString() {
        if (this.arvo < 10) {
            return "0" + this.arvo;
        }
        return "" + this.arvo;
    }
}