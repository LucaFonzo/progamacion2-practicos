package controlgastos;

import controlgastos.filtros.Filtro;

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

    @Override
    public ArrayList<Gasto> buscar(Filtro filtro) {
        ArrayList<Gasto> resultado = new ArrayList<>();
        for (int i = 0;i < this.gastos.size();i++){
            ArrayList<Gasto> resultadoHijo = this.gastos.get(i).buscar(filtro);
            resultado.addAll(resultadoHijo);
        }
        if (filtro.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
}
