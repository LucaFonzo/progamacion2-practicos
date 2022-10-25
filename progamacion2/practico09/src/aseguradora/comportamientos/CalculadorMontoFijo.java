package aseguradora.comportamientos;

import aseguradora.Seguro;

public class CalculadorMontoFijo extends CalculadorMonto{
    private Double montoFijo;

    public CalculadorMontoFijo(Double montoFijo){
        this.montoFijo = montoFijo;
    }
    @Override
    public Double calcularMonto(Seguro seguro) {
        return montoFijo;
    }
}
