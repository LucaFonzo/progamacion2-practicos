package Peluqueria;

import java.util.ArrayList;

public class Peluquero {
    private String nombre;
    private int dni;
    private ArrayList<Turno> turnosOcupados;

    public Peluquero(String nombre,int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.turnosOcupados = new ArrayList<Turno>();
    }

    public ArrayList<Turno> getTurnosOcupados(){
        return this.turnosOcupados;
    }
}
