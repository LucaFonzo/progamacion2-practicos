package aseguradora.ordenadores;

import aseguradora.Seguro;

import java.util.Comparator;
import java.util.Set;

public class OrdenadorCompuesto implements Comparator<Seguro> {
    private Comparator comparator1;
    private Comparator comparator2;

    public OrdenadorCompuesto(Comparator comparator1,Comparator comparator2){
        this.comparator1 = comparator1;
        this.comparator2 = comparator2;
    }
    @Override
    public int compare(Seguro s1,Seguro s2){
        int resultado = this.comparator1.compare(s1,s2);
        if (resultado == 0){
            return this.comparator2.compare(s1,s2);
        }
        return resultado;
    }
}
