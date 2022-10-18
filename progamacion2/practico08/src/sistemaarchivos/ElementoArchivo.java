package sistemaarchivos;

import java.time.LocalDateTime;

public abstract class ElementoArchivo {
    private String nombre;
    private LocalDateTime fechaCreacion;


    public ElementoArchivo(String nombre,LocalDateTime fechaCreacion){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract boolean tieneNombre(String nombreBuscado);
    public abstract Integer getTamanio();

    public LocalDateTime getFechaCreacion(){
        return this.fechaCreacion;
    }
}
