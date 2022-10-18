package futbol5.comparadores;

import futbol5.Socio;

import java.util.Comparator;

public class ComparadorCumplioPago implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        if (o1.tienePaga()){
            return 1;
        }else if (o2.tienePaga()){
            return -1;
        }else {
            return 0;
        }
    }
}
