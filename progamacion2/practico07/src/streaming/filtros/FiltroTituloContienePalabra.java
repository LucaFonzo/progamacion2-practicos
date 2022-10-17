package streaming.filtros;

import streaming.Pelicula;

public class FiltroTituloContienePalabra extends Filtro{
    private String palabraBuscada;

    public FiltroTituloContienePalabra(String palabraBuscada){
        this.palabraBuscada = palabraBuscada;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return this.palabraBuscada.contains(pelicula.getTitulo());
    }
}
