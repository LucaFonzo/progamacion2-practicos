package SistemaDeEncuestas;

import java.util.ArrayList;

public class Encuesta{
    private ArrayList<String> preguntas;

    private Empleado empleado;
    private int dni;
    public Encuesta(Empleado empleado){
        this.empleado = empleado;
        this.dni = -1;
    }
    public ArrayList<String> getPreguntas() {
        return this.preguntas;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    public int getDni() {
        return this.dni;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
}
