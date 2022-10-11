package sistemaalquiler;

import java.time.LocalDateTime;

public abstract class Item {

    private int fechaAlquiler;
    private int fechaVencimiento;


    public Item(){
        this.fechaAlquiler = 0;
        this.fechaVencimiento = 0;
    }

    public int getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public abstract boolean sePuedeAlquilar();

    public abstract void alquilar(Cliente cliente,int fechaAlquiler,int fechaVencimiento);
}
