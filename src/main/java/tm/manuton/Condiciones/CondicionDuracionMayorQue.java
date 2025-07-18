package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionDuracionMayorQue implements Condicion{
    private final int duracion;

    public CondicionDuracionMayorQue(int duracion) {
        this.duracion = duracion;
    }

    public boolean cumple(Pista pista) {
        return pista.getDuracionSeg() > duracion;
    }

}
