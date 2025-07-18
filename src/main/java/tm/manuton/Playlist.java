package tm.manuton;

import tm.manuton.Condiciones.Condicion;

import java.util.ArrayList;

public class Playlist extends Elemento{
    protected ArrayList<Elemento> pistas;

    public Playlist(String titulo) {
        super(titulo);
        this.pistas = new ArrayList<>();
    }

    public void addPista(Elemento pista) {
        this.pistas.add(pista);
    }

    public void addPistas(ArrayList<Elemento> pistas) {
        this.pistas.addAll(pistas);
    }

    public ArrayList<Elemento> getPlaylist() {
        return pistas;
    }

    public void removePista(Elemento aEliminar) {
        if (!pistas.isEmpty())
            pistas.remove(aEliminar);
    }

    public ArrayList<Elemento> buscar(Condicion condicion, ArrayList<Elemento> noUsado) {
        ArrayList<Elemento> resultados = new ArrayList<>();
        for (Elemento e : pistas){
            resultados.addAll(e.buscar(condicion, resultados));
        }
        return resultados;
    }

    public void imprimir() {
        System.out.println("Playlist: " + this.getTitulo());
        for (Elemento e : pistas) {
            e.imprimir();
        }
    }

    public void buscarEImprimir(Condicion condicion){
        Playlist aux = new Playlist(this.getTitulo());
        aux.addPistas(buscar(condicion, null));
        aux.imprimir();
    }

    public Playlist getCopia(){
        Playlist copia = new Playlist("Copia de " + this.getTitulo());
        for (Elemento e : pistas) {
            copia.addPista(e);
        }
        return copia;
    }

    public int getDuracionSeg(){
        int total = 0;
        for (Elemento e : pistas) {
            total += e.getDuracionSeg();
        }
        return total;
    }

    public int getCantidad() {
        int total = 0;
        for (Elemento e : pistas) {
            total += e.getCantidad();
        }
        return total;
    }

    public void intercambiarPistas(Elemento e1, Elemento e2){
        if (this.pistas.contains(e1) && this.pistas.contains(e2)) {
            int i1 = 0;
            int i2 = 0;
            for (Elemento e : this.pistas) {
                if (e.equals(e1)) {
                    i1 = this.pistas.indexOf(e);
                }
                if (e.equals(e2)) {
                    i2 = this.pistas.indexOf(e);
                }
            }
            this.pistas.set(i1, e2);
            this.pistas.set(i2, e1);
        }
    }
}
