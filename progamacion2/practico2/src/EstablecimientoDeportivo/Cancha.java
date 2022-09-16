package EstablecimientoDeportivo;

import java.util.ArrayList;

public class Cancha {
    private double precio;
    private ArrayList<Turno> turnos;
    public Cancha(double precio){
        this.precio = precio;
        this.turnos = new ArrayList<>();
    }
    public void aniadirTurno(Turno turno){
        this.turnos.add(turno);
    }

    public ArrayList<Turno> getTurnos(){
        return this.turnos;
    }
}
