package streaming.filtros;

import streaming.Pelicula;

public class FiltroDirector extends Filtro{
    private String directorBuscado;

    public FiltroDirector(String directorBuscado){
        this.directorBuscado = directorBuscado;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return this.directorBuscado.equals(pelicula.getDirector());
    }
}
