package parcial28_10_2021;

import java.time.LocalDate;

public abstract class ElementoViaje{
    private Integer id;
    private Integer cantidadMiembros;

    public ElementoViaje(Integer id,Integer cantidadMiembros){
        this.id = id;
        this.cantidadMiembros = cantidadMiembros;
    }

    public Integer getId() {
        return id;
    }
    public Integer getCantidadMiembros() {
        return cantidadMiembros;
    }

    public abstract LocalDate getFechaPago();
    public abstract String getCiudadOrigen();
    public abstract String getCiudadDestino();
    public abstract Double getCosto();
}
