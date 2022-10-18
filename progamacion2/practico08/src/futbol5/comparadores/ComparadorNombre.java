package futbol5.comparadores;

import futbol5.Socio;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
