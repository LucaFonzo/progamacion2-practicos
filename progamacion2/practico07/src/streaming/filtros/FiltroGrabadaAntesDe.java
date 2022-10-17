package streaming.filtros;

import streaming.Pelicula;

public class FiltroGrabadaAntesDe extends Filtro{
    private int anioMax;

    public FiltroGrabadaAntesDe(int anioMax){
        this.anioMax = anioMax;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.getAnioEstreno() < anioMax;
    }
}
