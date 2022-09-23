package contactoscelular;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Contacto {
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNac;
    private int numTelf;
    private String direccion;
    private String email;
    public Contacto(String nombre,String apellido,LocalDateTime fechaNac,int numTelf,String direccion,String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.numTelf = numTelf;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getNumTelf(){
        return this.numTelf;
    }

    public String mostrarInfo(){return "Nombre: " + this.nombre +" Apellido: " + this.apellido + " Edad: " + this.calcularEdad() + " Numero telefono: " + this.numTelf + " Ciudad: ";}
    public long calcularEdad(){return ChronoUnit.YEARS.between(this.fechaNac,LocalDateTime.now());}

    public boolean verificarRepetidoPorTelefono(Contacto c){
        return this.numTelf == c.getNumTelf() && !(this.equals(c));

    }

    public boolean verificarRepetido(Contacto c){
        return this.apellido == c.getApellido() && this.nombre == c.getNombre() && !(this.equals(c)) ;
    }
}
