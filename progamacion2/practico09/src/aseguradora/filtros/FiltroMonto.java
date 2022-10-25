package aseguradora.filtros;

import aseguradora.Seguro;

public class FiltroMonto extends Filtro{
    private Double montoMin;


    public FiltroMonto(Double montoMin){
        this.montoMin = montoMin;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getMonto() > this.montoMin;
    }
}
