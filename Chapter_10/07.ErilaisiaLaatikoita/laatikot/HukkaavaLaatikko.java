package laatikot;

import java.util.ArrayList;

public class HukkaavaLaatikko extends Laatikko{

    private ArrayList<Tavara> laatikot;

    public HukkaavaLaatikko() {
        this.laatikot = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        this.laatikot.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
}