package SistemaDeEncuestas;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int dni;
    private ArrayList<Encuesta> encuestasRealizadas;
    public Persona(String nombre,int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.encuestasRealizadas = new ArrayList<>();
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getDni() {
        return this.dni;
    }
    public ArrayList<Encuesta> getEncuestasRealizadas() {
        return this.encuestasRealizadas;
    }
    public void realizarEncuesta(Encuesta encuesta){
        for (int i = 0;i < encuestasRealizadas.size();i++){
            if (encuestasRealizadas.get(i).getPreguntas().equals(encuesta.getPreguntas())){
                return;
            }
        }
        encuesta.setDni(this.dni);
        encuesta.getEmpleado().aniadirEncuesta(encuesta);
    }
}
