package tm.manuton.Condiciones;

import tm.manuton.Pista;

public class CondicionAlbum implements Condicion{
    private String album;

    public CondicionAlbum(String album) {
        this.album = album.toLowerCase();
    }

    public boolean cumple(Pista pista) {
        return pista.getAlbum().toLowerCase().contains(album);
    }
}
