package Peluqueria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Peluqueria {
    private String nombre;
    private int cantidadDeTurnosParaSocio;
    private ArrayList<Peluquero> peluqueros;

    public Peluqueria(String nombre){
        this.nombre = nombre;
        this.cantidadDeTurnosParaSocio = 1;
        this.peluqueros = new ArrayList<Peluquero>();
    }
    public LocalDate getFechaLimite(){
        LocalDate hoy = LocalDate.now();
        LocalDate fechaLimite = LocalDate.of(hoy.getYear(),(hoy.getMonth().minus(1)), hoy.getDayOfMonth());

        return fechaLimite;
    }
    public boolean verificarSocio(Usuario usuario){
        int cantidadDeTurno = 0;
        for (int i = 0; i < usuario.getTurnosSacados().size();i++){
            if (ChronoUnit.MONTHS.between(usuario.getTurnosSacados().get(i).getFechaTurno(),this.getFechaLimite()) <= 1){
                cantidadDeTurno++;
            }
        }
        if (cantidadDeTurno >= this.cantidadDeTurnosParaSocio){
            return true;
        }
        return false;
    }
    public boolean reservarTurno(Turno turno,Peluquero peluquero){
        for (int i = 0;i < peluquero.getTurnosOcupados().size();i++){
            if (peluquero.getTurnosOcupados().get(i).getFechaTurno() == turno.getFechaTurno()){
                return false;
            }
        }
        if (this.verificarSocio(turno.getUsuario())){
            double nuevoPrecio = turno.getPrecio() - turno.getPrecio() * 0.1;
            turno.setPrecio(nuevoPrecio);
        }
        peluquero.getTurnosOcupados().add(turno);
        return true;
    }
}
