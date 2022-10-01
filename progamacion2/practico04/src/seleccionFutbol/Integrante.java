package seleccionFutbol;

import java.time.LocalDateTime;

public class Integrante {
    private String nombre;
    private String apellido;
    private int nroPasaporte;
    private LocalDateTime fechaNac;
    private String estado;

    public Integrante(String nombre,String apellido,int nroPasaporte,LocalDateTime fechaNac,String estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroPasaporte = nroPasaporte;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public boolean estaDisponible(){
        if (this.estado == "En pais de origen"){
            return true;
        }
        return false;
    }

    public String getEstado(){
        return this.estado;
    }
}
