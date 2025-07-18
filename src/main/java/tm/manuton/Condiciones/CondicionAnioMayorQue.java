package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionAnioMayorQue implements Condicion{
    private final int anio;

    public CondicionAnioMayorQue(int anio) {
        this.anio = anio;
    }

    public boolean cumple(Pista pista) {
        return pista.getAnio() > anio;
    }
}
