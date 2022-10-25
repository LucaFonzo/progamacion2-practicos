package parcial28_10_2021;

import parcial28_10_2021.calculador.Calculador;

import java.time.LocalDate;

public class PaqueteSimple extends ElementoViaje{

    private String datosAlojamiento;
    private String ciudadOrigen;
    private String ciudadDestino;
    private LocalDate fechaPago;
    private Double costo;
    private Calculador calculadorCosto;

    public PaqueteSimple(Integer id,Integer cantidadMiembros,String datosAlojamiento,String ciudadOrigen,String ciudadDestino,Double costo){
        super(id,cantidadMiembros );
        this.datosAlojamiento = datosAlojamiento;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaPago = null;
        this.costo = costo;
    }

    public void setFechaPago(LocalDate fechaPago){
        this.fechaPago = fechaPago;
    }



    public String getDatosAlojamiento() {
        return datosAlojamiento;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public Double getCosto() {
        return costo;
    }
}
