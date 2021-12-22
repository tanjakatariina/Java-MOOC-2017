package laatikot;

import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimipaino;
    private ArrayList<Tavara> laatikot;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.laatikot = new ArrayList<>();
    }

    private int laatikonPaino() {
        int paino = 0;
        for (Tavara t : this.laatikot) {
            paino += t.getPaino();
        }
        return paino;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (laatikonPaino() + tavara.getPaino() <= this.maksimipaino) {
            this.laatikot.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (Tavara t : this.laatikot) {
            if (t.equals(tavara)) {
                return true;
            }
        }
        return false;
    }
}