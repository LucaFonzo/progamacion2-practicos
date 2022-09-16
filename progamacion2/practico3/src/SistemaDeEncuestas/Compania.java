package SistemaDeEncuestas;

import java.util.ArrayList;

public class Compania {
    private String nombre;
    private ArrayList<Encuesta> encuestasRealizadas;
    private ArrayList<Empleado> empleados;
    public Compania(String nombre){
        this.nombre = nombre;
        this.encuestasRealizadas = new ArrayList<Encuesta>();
        this.empleados = new ArrayList<>();
    }
    public void aniadirEncuestaRealizada(Encuesta encuesta){
        if (encuesta.getDni() != -1){
            encuestasRealizadas.add(encuesta);
        }
    }
    public void aniadirEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
}
