package sistemaarchivos.comparadores;

import sistemaarchivos.ElementoArchivo;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<ElementoArchivo> {
    @Override
    public int compare(ElementoArchivo o1, ElementoArchivo o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
