package alarmasensorial;

public class Sensor {
    private String nombreZona;
    private boolean encendido;

    public Sensor(String nombreZona){
        this.nombreZona = nombreZona;
        this.encendido = false;
    }

    public boolean isEncendido(){
        return this.encendido;
    }

    public String getNombreZona(){
        return this.nombreZona;
    }
}
