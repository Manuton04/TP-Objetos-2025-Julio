package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionNot implements Condicion{
    private final Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    public boolean cumple(Pista pista){
        return !c1.cumple(pista);
    }
}
