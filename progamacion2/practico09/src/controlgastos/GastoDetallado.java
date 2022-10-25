package controlgastos;

import java.time.LocalDate;
import java.util.ArrayList;

public class GastoDetallado extends Gasto{
    private ArrayList<GastoDetallado> gastos;

    public GastoDetallado(String descripcion, LocalDate fecha){
        super(descripcion,fecha);
        this.gastos = new ArrayList<>();
    }


    @Override
    public Double getMonto() {
        Double total = 0.0;
        for (int i = 0;i < this.gastos.size();i++){
            total += this.gastos.get(i).getMonto();
        }
        return total;
    }
}
