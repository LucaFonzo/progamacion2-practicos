package sistemaalquiler;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Item {

    private LocalDate fechaAlquiler;
    private LocalDate fechaVencimiento;
    private long diasAlquiladas;


    public Item(){
        this.fechaAlquiler = null;
        this.fechaVencimiento = null;
        this.diasAlquiladas = 0;
    }


    public void setDiasAlquiladas(long diasAlquiladas){
        this.diasAlquiladas = diasAlquiladas;
    }
    public long getDiasAlquiladas(){
        return this.diasAlquiladas;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public abstract boolean sePuedeAlquilar();

    public abstract boolean isVencido();

    public abstract void alquilar(Cliente cliente,long diasAlquiladas);
}
