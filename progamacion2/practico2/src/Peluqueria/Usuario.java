package Peluqueria;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int dni;
    private ArrayList<Turno> turnosSacados;

    public Usuario(String nombre,int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.turnosSacados = new ArrayList<Turno>();
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public ArrayList<Turno> getTurnosSacados() {
        return turnosSacados;
    }
    public void aniadirTurno(Turno turno){
        this.turnosSacados.add(turno);
    }
}
