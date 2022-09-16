package EstablecimientoDeportivo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Turno {

    private Usuario usuario;
    private LocalDateTime fechaTurno;

    private double precio;
    private int duracion_horas;

    public Turno(Usuario usuario, LocalDateTime fechaTurno,int duracion_horas,int precio){
        this.usuario = usuario;
        this.fechaTurno = fechaTurno;
        this.duracion_horas = duracion_horas;
        this.precio = precio;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getFechaTurno() {
        return fechaTurno;
    }

    public int getDuracion_horas() {
        return duracion_horas;
    }
}
