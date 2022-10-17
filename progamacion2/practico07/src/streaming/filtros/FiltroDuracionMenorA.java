package streaming.filtros;

import streaming.Pelicula;

public class FiltroDuracionMenorA extends Filtro{
    private int duracionMax;

    public FiltroDuracionMenorA(int duracionMax){
        this.duracionMax = duracionMax;
    }

    @Override
    public boolean cumple(Pelicula pelicula){
        return pelicula.getDuracion_minutos() < this.duracionMax;
    }
}
