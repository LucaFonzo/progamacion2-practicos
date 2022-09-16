package ControlGastosPublicos;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;
    public Provincia(String nombre){
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }
    public boolean isMasDeLaMitadDeCiudadesEnDeficit(){
        int contador = 0;
        for (int i = 0;i< ciudades.size();i++){
            if (ciudades.get(i).gastaMasDeLoQueRecauda()){
                contador++;
            }
        }
        if (contador > (ciudades.size() / 2)){
            return true;
        }
        return false;
    }
}
