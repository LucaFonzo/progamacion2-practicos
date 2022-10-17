package companiaenvios;

public class Persona {
    private String nombre;
    private String ciudad;
    private String direccion;

    public Persona(String nombre,String ciudad,String direccion){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
