package alarmasensorial;

import java.util.ArrayList;

public class Alarma {
    private Timbre timbre;
    private ArrayList<Sensor> sensores;
    public Alarma(){
        this.sensores = new ArrayList<>();
    }
    public void comprobar(){
        for (int i = 0;i < sensores.size();i++){
            if (this.sensores.get(i).isEncendido()){
                sonarAlarma(this.sensores.get(i));
            }
        }
    }
    public void aniadirSensor(Sensor s){
        this.sensores.add(s);
    }
    public void sonarAlarma(Sensor zona){
        System.out.println("Se encendio el sensor: " + zona.getNombreZona());
        timbre.hacerSonar();
    }
}
