package laatikot;

import java.util.ArrayList;

public class YhdenTavaranLaatikko extends Laatikko {

    private ArrayList<Tavara> laatikot;

    public YhdenTavaranLaatikko() {
        this.laatikot = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.laatikot.size() == 1) {
            return;
        }
        this.laatikot.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.laatikot.contains(tavara);
    }
}