package futbol5;

import java.time.LocalDateTime;

public class Cuota {
    private Double montoCuota;
    private LocalDateTime fechaPago;

    public Cuota(Double montoCuota,LocalDateTime fechaPago){
        this.montoCuota = montoCuota;
        this.fechaPago = fechaPago;
    }

    public Double getMontoCuota() {
        return montoCuota;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }
}
