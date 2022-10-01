package registroempresa;

public abstract class Asociativo {
    private String nombre;
    private String apellido;
    private int edad;

    public Asociativo(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getInfo(){
        return "Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + " Edad: " + this.getEdad();
    }
}
