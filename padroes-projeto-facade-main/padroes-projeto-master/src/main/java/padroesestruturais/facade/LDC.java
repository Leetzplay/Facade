package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class LDC {

    private List<EngSoft> ldcEmFalta = new ArrayList<EngSoft>();

    public void addLDCEmFalta(EngSoft engsoft) {
        this.ldcEmFalta.add(engsoft);
    }

    public boolean verificarLDCEmFalta(EngSoft engsoft) {
        return this.ldcEmFalta.contains(engsoft);
    }

}

