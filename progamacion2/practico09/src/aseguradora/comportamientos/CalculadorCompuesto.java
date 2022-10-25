package aseguradora.comportamientos;

import aseguradora.Seguro;

public class CalculadorCompuesto extends CalculadorMonto{
    private CalculadorMonto calculadorMonto1;
    private CalculadorMonto calculadorMonto2;

    public CalculadorCompuesto(CalculadorMonto calculadorMonto1,CalculadorMonto calculadorMonto2){
        this.calculadorMonto1 = calculadorMonto1;
        this.calculadorMonto2 = calculadorMonto2;
    }
    @Override
    public Double calcularMonto(Seguro seguro) {
        return calculadorMonto1.calcularMonto(seguro) + calculadorMonto2.calcularMonto(seguro);
    }
}
