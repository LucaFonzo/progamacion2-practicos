package navidad;

public class Ninio {
    private String nombre;
    private Integer dni;

    public Ninio(String nombre,Integer dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getDni() {
        return this.dni;
    }
}
