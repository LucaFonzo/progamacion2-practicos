package futbol5.comparadores;

import futbol5.Alquiler;
import futbol5.Cancha;
import futbol5.Socio;

import java.util.Comparator;

public class ComparadorCantidadAlquileres implements Comparator<Socio> {
    private Cancha cancha;

    public ComparadorCantidadAlquileres(Cancha cancha){
        this.cancha = cancha;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getCantidadAlquileresCancha(this.cancha) - o2.getCantidadAlquileresCancha(this.cancha);
    }
}
