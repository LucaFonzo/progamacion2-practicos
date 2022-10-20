package sistemaarchivos.comparadores;

import sistemaarchivos.ElementoArchivo;

import java.util.Comparator;

public class ComparadorFecha implements Comparator<ElementoArchivo> {

    @Override
    public int compare(ElementoArchivo o1, ElementoArchivo o2) {
        return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());
    }
}
