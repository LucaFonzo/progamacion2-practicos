package futbol5.comparadores;

import futbol5.Socio;

import java.util.Comparator;

public class ComparadorCumplioPago implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return Boolean.compare(o1.tienePaga(),o2.tienePaga());
    }
}
