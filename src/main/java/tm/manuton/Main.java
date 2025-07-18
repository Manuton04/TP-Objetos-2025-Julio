package tm.manuton;

import tm.manuton.Condiciones.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Hecho por Manuel Torres -- Trabajo practico de Programación Orientada a Objetos -- 2025 Julio
    // Libreria de Musica
    public static void main(String[] args) {

        Playlist Libreria = new Playlist("Libreria de Musica");

        Pista p1 = new Pista(1, "El Tiempo No Para", 311, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional");
        Pista p2 = new Pista(2, "Mi Caramelo", 290, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional");
        Pista p3 = new Pista(3, "Party Rock Anthem", 408, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
        Pista p4 = new Pista(4, "Sorry for Party Rocking", 421, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
        Pista p5 = new Pista(5, "Fix You", 255, "Coldplay", "X&Y", 2005, "Rock alternativo");
        Pista p6 = new Pista(6, "Speed of Sound", 455, "Coldplay", "X&Y", 2005, "Rock alternativo");
        Pista p7 = new Pista(7, "Viva la Vida", 320, "Coldplay", "Viva la Vida", 2008, "Rock alternativo");
        Pista p8 = new Pista(8, "With or without you", 360, "U2", "The Joshua Tree", 1987, "Rock");
        Pista p9 = new Pista(9, "Vertigo", 355, "U2", "How to Dismantle an Atomic Bomb", 2004, "rock");
        Pista p10 = new Pista(10, "City of Blinding Lights", 284, "U2", "How to Dismantle an Atomic Bomb", 2004, "Rock");
        Pista p11 = new Pista(11, "A la luz de la luna", 438, "El Indio Solari", "Pajaritos, bravos muchachitos", 2013, "rock nacional");
        Pista p12 = new Pista(12, "Yo Canibal", 258, "Patricio Rey y sus Redonditos de Ricota", "Lobo Suelto, Cordero Atado", 1993, "Rock Nacional");

        // Punto 1:
        Libreria.addPistas(new ArrayList<Elemento>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)));

        //Punto 2:
        Playlist ClasicosDelRock = new Playlist("Clasicos del Rock");
        ClasicosDelRock.addPista(p1);
        ClasicosDelRock.addPista(p2);
        ClasicosDelRock.addPista(p8);
        ClasicosDelRock.addPista(p9);
        ClasicosDelRock.addPista(p10);
        ClasicosDelRock.addPista(p12);

        Playlist LoMejor = new Playlist("Lo Mejor");
        LoMejor.addPista(p3);
        LoMejor.addPista(p4);
        LoMejor.addPista(p7);
        LoMejor.addPista(p12);

        Playlist Coldplay = new Playlist("Coldplay");
        Coldplay.addPista(p5);
        Coldplay.addPista(p6);
        Coldplay.addPista(p7);

        Playlist ElIndio = new Playlist("El Indio");
        ElIndio.addPista(p12);
        ElIndio.addPista(p11);

        //Punto 3:
        System.out.println("Punto 3:");
        ClasicosDelRock.imprimir();
        System.out.println();
        LoMejor.imprimir();
        System.out.println();
        Coldplay.imprimir();
        System.out.println();

        Condicion Seg400 = new CondicionDuracionMayorQue(400);
        Condicion generoRock = new CondicionGenero("rock");
        Condicion noLmfao = new CondicionNot(new CondicionArtista("LMFAO"));
        Condicion rockNoLmfao = new CondicionAnd(generoRock, noLmfao);
        Condicion anio2006 = new CondicionAnioMayorQue(2006);
        Condicion coldplay = new CondicionArtista("Coldplay");
        Condicion rock2006 = new CondicionAnd(generoRock, anio2006);
        Condicion rockColdplay = new CondicionAnd(coldplay, generoRock);
        Condicion c = new CondicionOr(rock2006, rockColdplay);


        //Punto 4:
        System.out.println("Punto 4:");
        Libreria.buscarEImprimir(Seg400);
        System.out.println();
        Libreria.buscarEImprimir(generoRock);
        System.out.println();
        Libreria.buscarEImprimir(rockNoLmfao);
        System.out.println();
        Libreria.buscarEImprimir(c);
        System.out.println();

        //Punto 5:
        System.out.println("Punto 5:");
        System.out.println("Duracion Playlist " + ClasicosDelRock.getTitulo() + ": " + ClasicosDelRock.getDuracionSeg() + " segundos");
        System.out.println("Duracion Playlist " + LoMejor.getTitulo() + ": " + LoMejor.getDuracionSeg() + " segundos");
        System.out.println("Duracion Playlist " + Coldplay.getTitulo() + ": " + Coldplay.getDuracionSeg() + " segundos");
        System.out.println("Duracion Playlist " + ElIndio.getTitulo() + ": " + ElIndio.getDuracionSeg() + " segundos");
        System.out.println();
        Playlist aux = new Playlist("Busqueda por duracion > 400Seg");
        aux.addPistas(Libreria.buscar(Seg400, null));
        aux.imprimir();
        System.out.println("Duracion: " + aux.getDuracionSeg() + " segundos");
        System.out.println();

        //Punto 6:
        Playlist LoMejorCopia = LoMejor.getCopia();
        LoMejorCopia.setTitulo("Lo mejor++");
        LoMejorCopia.intercambiarPistas(p3, p7);
        System.out.println("Punto 6:");
        LoMejor.imprimir();
        System.out.println();
        LoMejorCopia.imprimir();
        System.out.println();

        //Punto 7:
        PlaylistAutomatica todoLoDeColdPlay = new PlaylistAutomatica("Todo lo de Coldplay", coldplay, Libreria);
        System.out.println("Punto 7:");
        todoLoDeColdPlay.imprimir();
        System.out.println();

        //Punto 8:
        Pista p13 = new Pista(13, "Paradise", 365, "Coldplay", "Mylo Xyloto", 2011, "Rock alternativo");
        Libreria.addPista(p13);
        System.out.println("Punto 8:");
        todoLoDeColdPlay.imprimir();
        System.out.println();

    }
}