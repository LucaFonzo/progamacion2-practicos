package parcial28_10_2021.comparadores;

import parcial28_10_2021.ElementoViaje;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<ElementoViaje> {
    @Override
    public int compare(ElementoViaje e1,ElementoViaje e2){
        return e1.getCosto().compareTo(e2.getCosto());
    }
}
