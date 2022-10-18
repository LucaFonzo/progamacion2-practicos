package futbol5.comparadores;

import futbol5.Socio;

import java.util.Comparator;

public class OrdenadorInverso implements Comparator<Socio> {
    private Comparator<Socio> comparator;

    public OrdenadorInverso(Comparator<Socio> comparator){
        this.comparator = comparator;
    }
    @Override
    public int compare(Socio o1, Socio o2) {
        return -this.comparator.compare(o1,o2);
    }
}
