package tm.manuton;

import tm.manuton.Condiciones.Condicion;

import java.util.ArrayList;

public class PlaylistAutomatica extends Playlist {

    private Condicion condicion;
    private Playlist playlist;

    public PlaylistAutomatica(String titulo, Condicion condicion, Playlist playlist) {
        super(titulo);
        this.condicion = condicion;
        this.playlist = playlist;
        super.pistas = playlist.buscar(condicion, null);
    }

    public void setCondicion (Condicion condicion) {
        this.condicion = condicion;
        super.pistas = playlist.buscar(condicion, null);
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public ArrayList<Elemento> getPistas() {
        super.pistas = playlist.buscar(condicion, null);
        return super.pistas;
    }

    public void imprimir() {
        super.pistas = playlist.buscar(condicion, null);
        System.out.println("Playlist Automatica: " + this.getTitulo());
        for (Elemento e : super.pistas) {
            e.imprimir();
        }
    }

}
