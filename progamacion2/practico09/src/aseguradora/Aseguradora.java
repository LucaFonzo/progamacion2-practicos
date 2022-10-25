package aseguradora;

import aseguradora.filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class Aseguradora {
    private ArrayList<Seguro> seguros;

    public Aseguradora(){
        this.seguros = new ArrayList<>();
    }

    public ArrayList<Seguro> buscar(Filtro filtro, Comparator ordenador){
        ArrayList<Seguro> resultado = new ArrayList<>();
        for (int i = 0;i < this.seguros.size();i++){
            if (filtro.cumple(this.seguros.get(i))){
                resultado.add(this.seguros.get(i));
            }
        }
        Collections.sort(resultado,ordenador);
        return resultado;
    }
}
