package aseguradora;

import aseguradora.comportamientos.CalculadorMonto;

import java.util.Comparator;

public class SeguroSimple extends Seguro {
    private Integer nroPoliza;
    private String descPoliza;
    private Double montoAsegurado;
    private CalculadorMonto calculadorMonto;


    public SeguroSimple(Integer dni,Integer nroPoliza,String descPoliza,Double monto){
        super(dni);
        this.nroPoliza = nroPoliza;
        this.descPoliza = descPoliza;
        this.montoAsegurado = monto;
    }

    @Override
    public Double getMonto() {
        return this.calculadorMonto.calcularMonto(this);
    }

    public Double getMontoAsegurado(){
        return this.montoAsegurado;
    }

    @Override
    public Integer getPoliza() {
        return this.nroPoliza;
    }

    @Override
    public boolean tienePalabra(String palabraBuscada) {
        return descPoliza.contains(palabraBuscada);
    }
}
