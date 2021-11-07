public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;
    private int hinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
        this.hinta = this.neliohinta * this.nelioita;
    }

    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }
        return false;

    }

    public int hintaero(Asunto verrattava) {
        return Math.abs(this.hinta - verrattava.hinta);
    }

    public boolean kalliimpi(Asunto verrattava) {
        if (this.hinta > verrattava.hinta) {
            return true;
        }
        return false;
    }
}