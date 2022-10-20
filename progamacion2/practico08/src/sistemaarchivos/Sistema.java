package sistemaarchivos;

import sistemaarchivos.filtro.Filtro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    private ArrayList<ElementoArchivo> elementoArchivos;

    public Sistema(){
        this.elementoArchivos = new ArrayList<>();
    }

    public ArrayList<ElementoArchivo> buscar(Filtro filtro, Comparator orden){
        ArrayList<ElementoArchivo> resultado = new ArrayList<>();
        for (int i = 0;i < this.elementoArchivos.size();i++){
            if (filtro.cumple(this.elementoArchivos.get(i))){
                resultado.add(this.elementoArchivos.get(i));
            }
        }
        Collections.sort(resultado,orden);
        return resultado;
    }
}
