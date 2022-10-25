package parcial28_10_2021.calculador;

import parcial28_10_2021.ElementoViaje;

import java.time.LocalDate;

public class CalculadorDescuento extends Calculador{
    private LocalDate fechaInicioPromocion;
    private LocalDate fechaFinPromocion;
    private Double descuento;

    public CalculadorDescuento(LocalDate fechaInicioPromocion,LocalDate fechaFinPromocion,Double descuento){
        this.fechaInicioPromocion = fechaInicioPromocion;
        this.fechaFinPromocion = fechaFinPromocion;
        this.descuento = descuento;
    }
    @Override
    public Double calcularCosto(ElementoViaje elementoViaje){
        if (this.fechaInicioPromocion.isBefore(elementoViaje.getFechaPago()) && this.fechaFinPromocion.isAfter(elementoViaje.getFechaPago())){
            return elementoViaje.getCosto() * this.descuento;
        }
        return elementoViaje.getCosto();
    }
}
