package tm.manuton;

import tm.manuton.Condiciones.Condicion;

import java.util.ArrayList;

public class Pista extends Elemento{

    private int id;
    private int duracionSeg;
    private String artista;
    private int anio;
    private String genero;
    private ArrayList<String> comentarios;
    private String album;

    public Pista(int id, String titulo, int duracionSeg, String artista, String album, int anio, String genero) {
        super(titulo);
        this.id = id;
        this.duracionSeg = duracionSeg;
        this.artista = artista;
        this.anio = anio;
        this.genero = genero;
        this.comentarios = new ArrayList<>();
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void setDuracionSeg(int duracionSeg) {
        this.duracionSeg = duracionSeg;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void addComentario(String comentario) {
        if (comentario != null && !comentario.isEmpty()) {
            comentarios.add(comentario);
        }
    }

    public void resetComentarios() {
        comentarios = new ArrayList<>();
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public ArrayList<Elemento> buscar(Condicion condicion, ArrayList<Elemento> temp){
        ArrayList<Elemento> resultados = new ArrayList<>();
        if (condicion.cumple(this)) {
            if (!temp.contains(this))
                resultados.add(this);
        }
        return resultados;
    }

    public void imprimir() {
        System.out.println(this.getTitulo() + " - " + this.getArtista() + " - " + this.getAlbum() + "(" + this.getGenero() + ", " + this.getAnio() + ")");
    }

    public int getCantidad() {
        return 1;
    }
}
