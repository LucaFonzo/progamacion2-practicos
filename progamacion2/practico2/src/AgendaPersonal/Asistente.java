package AgendaPersonal;

public class Asistente {
    private String nombre;
    private double numTelf;
    private String email;
    public Asistente(String nombre,double numTelf,String email){
        this.nombre = nombre;
        this.numTelf = numTelf;
        this.email = email;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumTelf() {
        return this.numTelf;
    }

    public void setNumTelf(double numTelf) {
        this.numTelf = numTelf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
