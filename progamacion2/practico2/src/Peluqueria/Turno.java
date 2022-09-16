package Peluqueria;

import java.time.LocalDateTime;

public class Turno {
    private Usuario usuario;
    private LocalDateTime fechaTurno;
    private double precio;
    public Turno(Usuario usuario, LocalDateTime fechaTurnom,double precio){
        this.usuario = usuario;
        this.fechaTurno = fechaTurno;
        this.precio = precio;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public double getPrecio(){
        return this.precio;
    }
    public LocalDateTime getFechaTurno() {
        return this.fechaTurno;
    }

    public void setPrecio(double p){
        this.precio = p;
    }
}
