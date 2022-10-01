package SistemaDeEncuestas;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private int dni;
    private ArrayList<Encuesta> encuestasRealizadas;
    private double sueldo;
    private double plusPorEncuesta;

    public Empleado(String nombre,int dni,double sueldo,double plusPorEncuesta){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.plusPorEncuesta = plusPorEncuesta;
    }
    public void aniadirEncuesta(Encuesta encuesta){
        if (encuesta.getDni() != -1){
            this.encuestasRealizadas.add(encuesta);
        }
    }
    public void cobrarPlus(){
        for (int i = 0;i < encuestasRealizadas.size();i++){
            sueldo += plusPorEncuesta;
        }
    }
    public String getNombre() {
        return this.nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public ArrayList<Encuesta> getEncuestasRealizadas() {
        return new ArrayList<>(this.encuestasRealizadas);
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public double getPlusPorEncuesta() {
        return this.plusPorEncuesta;
    }
}
