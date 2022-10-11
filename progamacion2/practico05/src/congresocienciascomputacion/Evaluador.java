package congresocienciascomputacion;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private String tipo;
    private ArrayList<Trabajo> trabajosEncargados;
    private ArrayList<String> temasTratados;

    public Evaluador(String nombre,String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.trabajosEncargados = new ArrayList<>();
        this.temasTratados = new ArrayList<>();
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public boolean trataTema(String tema){
        return this.temasTratados.contains(tema);
    }

    public void aniadirTrabajo(Trabajo t){
        this.trabajosEncargados.add(t);
    }

    public int getCantidadDeTemas(){
        return this.temasTratados.size();
    }

    public int getCantidadDeTrabajosAsignados(){
        return this.trabajosEncargados.size();
    }
}
