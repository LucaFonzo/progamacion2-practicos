package congresocienciascomputacion;

import java.util.ArrayList;

public class Comite {
    private String nombre;
    private ArrayList<Evaluador> evaluadores;

    public Comite(String nombre){
        this.nombre = nombre;
        this.evaluadores = new ArrayList<Evaluador>();
    }
}
