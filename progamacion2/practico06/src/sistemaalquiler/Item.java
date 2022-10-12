package sistemaalquiler;

import java.time.LocalDateTime;

public abstract class Item {

    private int fechaAlquiler;
    private int fechaVencimiento;


    public Item(){
        this.fechaAlquiler = 0;
        this.fechaVencimiento = 0;
    }

    public void setFechaAlquiler(int fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public abstract boolean sePuedeAlquilar();

    public abstract boolean isVencido();

    public abstract void alquilar(Cliente cliente,int fechaAlquiler,int fechaVencimiento);
}
