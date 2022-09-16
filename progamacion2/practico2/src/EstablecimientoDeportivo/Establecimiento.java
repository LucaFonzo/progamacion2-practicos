package EstablecimientoDeportivo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;

public class Establecimiento {
    private String nombre;
    private ArrayList<Cancha> canchas;

    private int cantidadDeTurnosParaSerSocio;
    private int descuento;

    public Establecimiento(String nombre,int descuento,int cantidadDeTurnosParaSerSocio){
        this.nombre = nombre;
        this.descuento = descuento;
        this.cantidadDeTurnosParaSerSocio = cantidadDeTurnosParaSerSocio;
        this.canchas = new ArrayList<Cancha>();
    }
    public LocalDate getFechaLimite(){
        LocalDate hoy = LocalDate.now();
        LocalDate fechaLimite = LocalDate.of(hoy.getYear(),(hoy.getMonth().minus(2)), hoy.getDayOfMonth());

        return fechaLimite;
    }

    public boolean verificarSocio(Usuario usuario){
        int turnosSacadosEnFecha = 0;
        for (int i = 0;i < usuario.getTurnosSacados().size();i++){
            if (ChronoUnit.MONTHS.between(this.getFechaLimite(),usuario.getTurnosSacados().get(i).getFechaTurno()) <= 2){
                turnosSacadosEnFecha++;
            }
        }
        if (turnosSacadosEnFecha >= 4){
            return true;
        }
        return false;
    }
    public void reservarTurno(Turno turno){
        for (int i = 0;i < canchas.size();i++){
            if (!canchas.get(i).getTurnos().contains(turno)){
                canchas.get(i).aniadirTurno(turno);
            }
        }
    }
}
