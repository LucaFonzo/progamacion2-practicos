package streaming.filtros;

import streaming.Pelicula;

public class FiltroContieneGenero extends Filtro{
    private String generoBuscado;


    public FiltroContieneGenero(String generoBuscado){
        this.generoBuscado = generoBuscado;
    }
    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.tieneGenero(this.generoBuscado);
    }
}
