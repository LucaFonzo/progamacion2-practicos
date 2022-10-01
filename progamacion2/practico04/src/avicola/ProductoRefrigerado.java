package avicola;

import java.time.LocalDateTime;

public class ProductoRefrigerado extends ProductoFresco {
    private String codigoSupervision;
    private double temperaturaMantenimiento;
    public ProductoRefrigerado(LocalDateTime fechaVencimiento, int nroLote, LocalDateTime fechaEnvasado, String granjaOrigen,String codigoSupervision,double temperaturaMantenimiento){
        super(fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen);
        this.codigoSupervision = codigoSupervision;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getCodigoSupervision() {
        return this.codigoSupervision;
    }

    public double getTemperaturaMantenimiento() {
        return this.temperaturaMantenimiento;
    }
    @Override
    public String mostrarEtiqueta(){
        return super.mostrarEtiqueta() + " Codigo supervision: " + this.getCodigoSupervision() +" Temperatura Mantenimiento: " + this.getTemperaturaMantenimiento();
    }
}
