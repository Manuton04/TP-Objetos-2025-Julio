package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionArtista implements Condicion{
    private String artista;

    public CondicionArtista(String artista) {
        this.artista = artista.toLowerCase();
    }

    public boolean cumple(Pista pista) {
        return pista.getArtista().toLowerCase().contains(artista);
    }
}
