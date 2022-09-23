package alarmasensorial;

public class Sensor {
    private String nombreZona;
    private boolean encendido;

    public Sensor(String nombreZona){
        this.nombreZona = nombreZona;
        this.encendido = false;
    }

    public String getNombreZona(){
        return this.nombreZona;
    }
}
