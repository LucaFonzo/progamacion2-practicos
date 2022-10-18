package futbol5.comparadores;

import futbol5.Socio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> comparator1;
    private Comparator<Socio> comparator2;

    public ComparadorCompuesto(Comparator<Socio> comparator1,Comparator<Socio> comparator2){
        this.comparator1 = comparator1;
        this.comparator2 = comparator2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        int res = comparator1.compare(o1,o2);

        if (res == 0){
            return comparator2.compare(o1,o2);
        }
        return res;
    }
}
