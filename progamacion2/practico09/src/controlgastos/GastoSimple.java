package controlgastos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GastoSimple extends Gasto {
    private Double monto;
    public GastoSimple(String descripcion,LocalDate fecha,Double monto){
        super(descripcion,fecha);
        this.monto = monto;
    }

    @Override
    public Double getMonto() {
        return this.monto;
    }
}
