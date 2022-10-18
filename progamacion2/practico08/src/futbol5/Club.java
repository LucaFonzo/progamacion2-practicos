package futbol5;

import futbol5.filtro.Filtro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    private String nombre;
    private ArrayList<Socio> socios;

    public Club(String nombre){
        this.nombre = nombre;
        this.socios = new ArrayList<>();
    }

    public ArrayList<Socio> buscarFiltro(Filtro filtro){
        ArrayList<Socio> resultado = new ArrayList<>();
        for (int i = 0;i < this.socios.size();i++){
            if (filtro.cumple(this.socios.get(i))){
                resultado.add(this.socios.get(i));
            }
        }
        return resultado;
    }

    public ArrayList<Socio> buscarOrdenado(Filtro filtro,Comparator orden){
        ArrayList<Socio> resultado = buscarFiltro(filtro);
        Collections.sort(resultado,orden);
        return resultado;
    }
}
