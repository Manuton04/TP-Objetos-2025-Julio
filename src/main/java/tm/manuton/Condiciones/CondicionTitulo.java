package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionTitulo implements Condicion {
    private String titulo;

    public CondicionTitulo(String titulo) {
        this.titulo = titulo.toLowerCase();
    }

    public boolean cumple(Pista pista) {
        return pista.getTitulo().toLowerCase().contains(titulo);
    }
}
