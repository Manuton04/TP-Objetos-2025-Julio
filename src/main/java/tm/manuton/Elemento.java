package tm.manuton;

import tm.manuton.Condiciones.Condicion;

import java.util.ArrayList;

public abstract class Elemento {

    protected String Titulo;

    public Elemento(String titulo) {
        this.Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public abstract int getDuracionSeg();

    public abstract int getCantidad();

    public abstract ArrayList<Elemento> buscar(Condicion condicion, ArrayList<Elemento> resultados);

    public abstract void imprimir();
}
