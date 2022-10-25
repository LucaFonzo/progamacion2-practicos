package controlgastos;

import controlgastos.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public class GastoPendiente {
    private Gasto gastoPendiente;
    private Double porcentajeActualizacion;
    private Integer diasPendientes;
    private boolean isPago;
    private Double montoFijo;


    public GastoPendiente(Gasto gastoPendiente, Double porcentajeActualizacion, Integer diasPendientes){
        this.gastoPendiente = gastoPendiente;
        this.porcentajeActualizacion = porcentajeActualizacion;
        this.diasPendientes = diasPendientes;
        this.montoFijo = this.calcularMonto();
        this.isPago = false;
    }

    public Double getMonto(){
        if (this.isPago){
            return this.montoFijo;
        }
        return this.calcularMonto();
    }

    public void pagarGasto(){
        this.isPago =  true;
        this.montoFijo = this.calcularMonto();
    }

    public Double calcularMonto(){
        return gastoPendiente.getMonto() * gastoPendiente.getMonto() * this.porcentajeActualizacion;
    }
}
