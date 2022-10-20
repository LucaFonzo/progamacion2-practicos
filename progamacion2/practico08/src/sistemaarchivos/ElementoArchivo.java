package sistemaarchivos;

import java.time.LocalDateTime;

public abstract class ElementoArchivo {
    private String nombre;
    private LocalDateTime fechaCreacion;


    public ElementoArchivo(String nombre,LocalDateTime fechaCreacion){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }
    public boolean tieneFecha(LocalDateTime fechaCreacion){
        return this.fechaCreacion.isAfter(fechaCreacion);
    }
    public String getNombre(){
        return this.nombre;
    }

    public  boolean tieneNombre(String nombreBuscado){
        return this.nombre.equals(nombreBuscado);
    }
    public abstract Integer getTamanio();

    public LocalDateTime getFechaCreacion(){
        return this.fechaCreacion;
    }
}
