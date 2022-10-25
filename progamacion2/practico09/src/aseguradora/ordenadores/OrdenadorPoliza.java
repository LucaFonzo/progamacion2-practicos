package aseguradora.ordenadores;

import aseguradora.Seguro;

import java.util.Comparator;

public class OrdenadorPoliza implements Comparator<Seguro> {
    @Override
    public int compare(Seguro s1,Seguro s2){
        return s1.getPoliza().compareTo(s2.getPoliza());
    }
}
