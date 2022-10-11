package congresocienciascomputacion;

import java.util.ArrayList;

public class Comite {
    private String nombre;
    private ArrayList<String> temasGenerales;
    private ArrayList<String> temasExpertos;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Trabajo> trabajos;

    public Comite(String nombre){
        this.nombre = nombre;
        this.evaluadores = new ArrayList<Evaluador>();
        this.temasExpertos = new ArrayList<>();
        this.temasGenerales = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }

    public void asignarEvaluador(Trabajo trabajo){
        for (int i = 0;i < this.evaluadores.size();i++){
            if (trabajo.sirveEvaluador(this.evaluadores.get(i))){
                trabajo.setEvaluador(this.evaluadores.get(i));
                return;
            }
        }
    }

    public ArrayList<Trabajo> queTrabajosSePuedenAsignarle(Evaluador evaluador){
        ArrayList<Trabajo> trabajosSePuedenAsignar = new ArrayList<>();
        for (int i = 0;i < this.trabajos.size();i++){
            if (this.trabajos.get(i).sirveEvaluador(evaluador)){
                trabajosSePuedenAsignar.add(this.trabajos.get(i));
            }
        }
        return trabajosSePuedenAsignar;
    }


}
