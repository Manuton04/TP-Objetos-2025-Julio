package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionGenero implements Condicion{
    private final String genero;

    public CondicionGenero(String genero) {
        this.genero = genero.toLowerCase();
    }

    public boolean cumple(Pista pista) {
        return pista.getGenero().toLowerCase().contains(genero);
    }
}
