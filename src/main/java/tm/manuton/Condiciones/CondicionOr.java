package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionOr implements Condicion{
    private final Condicion c1;
    private final Condicion c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Pista pista) {
        return c1.cumple(pista) || c2.cumple(pista);
    }
}
