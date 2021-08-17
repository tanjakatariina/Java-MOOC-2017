public class Maksukortti {

    private double saldo;

    public Maksukortti(double alkuSaldo) {
        this.saldo = alkuSaldo;
    }

    public void syoEdullisesti() {
        if (this.saldo >= 2.60) {
            this.saldo -= 2.60;
        }
    }

    public void syoMaukkaasti() {
        if (this.saldo >= 4.60) {
            this.saldo -= 4.60;
        }
    }

    public void lataaRahaa(double rahaMaara) {
        if (rahaMaara > 0) {
            this.saldo += rahaMaara;
            if (this.saldo > 150) {
                this.saldo = 150;
            }
        }
    }

    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
}