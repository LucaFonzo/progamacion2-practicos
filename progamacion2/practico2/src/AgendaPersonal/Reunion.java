package AgendaPersonal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private String tema;
    private int duracionReunion_minutos;
    private LocalDateTime fecha;
    private ArrayList<Usuario> participantes;
    private ArrayList<Asistente> asistentes;

    public Reunion(String lugar, String tema, int duracionReunion_minutos, LocalDateTime fecha){
        this.lugar = lugar;
        this.tema = tema;
        this.duracionReunion_minutos = duracionReunion_minutos;
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
        this.asistentes = new ArrayList<>();
    }
    //GET
    public String getLugar() {
        return lugar;
    }

    public String getTema() {
        return tema;
    }

    public int getDuracionReunion_minutos() {
        return duracionReunion_minutos;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    //SETS
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setDuracionReunion_minutos(int duracionReunion_minutos) {
        this.duracionReunion_minutos = duracionReunion_minutos;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void aniadirParticipante(Usuario participante){
        participantes.add(participante); //Revisar si ya existe un participante
    }
    public void aniadirAsistente(Asistente a){
        asistentes.add(a); //Revisar si ya existe un asistente
    }

    public void eliminarParticipante(Usuario participante){
        participantes.remove(participante);
    }
    public void eliminarAsistente(Asistente a){
        asistentes.remove(a);
    }
}
