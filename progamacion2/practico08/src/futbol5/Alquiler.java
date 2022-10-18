package futbol5;

import java.time.LocalDateTime;

public class Alquiler {
    private LocalDateTime fecha;
    private int id_cancha;
    private int monto;

    public Alquiler(LocalDateTime fecha,int id_cancha, int monto){
        this.fecha = fecha;
        this.id_cancha = id_cancha;
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getId_cancha() {
        return id_cancha;
    }

    public int getMonto() {
        return monto;
    }
}
