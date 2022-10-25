package aseguradora.comportamientos;

import aseguradora.Seguro;

public class CalculadorPorcentaje extends CalculadorMonto{
    private Double porcentaje;

    public CalculadorPorcentaje(Double porcentaje){
        this.porcentaje = porcentaje;
    }
    @Override
    public Double calcularMonto(Seguro seguro) {
       return seguro.getMonto() * porcentaje;
    }
}
