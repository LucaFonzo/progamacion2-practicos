package aseguradora.ordenadores;

import aseguradora.Seguro;

import java.util.Comparator;
import java.util.Set;

public class OrdenadorDni implements Comparator<Seguro> {
    @Override
    public int compare(Seguro o1, Seguro o2) {
        return o1.getDni().compareTo(o2.getDni());
    }
}
