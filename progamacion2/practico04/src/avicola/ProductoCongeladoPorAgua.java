package avicola;

import java.time.LocalDateTime;

public class ProductoCongeladoPorAgua extends ProductoRefrigerado {
    private String salinidadAgua;
    public ProductoCongeladoPorAgua(LocalDateTime fechaVencimiento, int nroLote, LocalDateTime fechaEnvasado, String granjaOrigen, String codigoSupervision, double temperaturaMantenimiento,String salinidadAgua){
        super(fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen,codigoSupervision,temperaturaMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }
    public String getSalinidadAgua() {
        return salinidadAgua;
    }
    @Override
    public String mostrarEtiqueta(){
        return super.mostrarEtiqueta() + " Salinidad Agua: " + this.getSalinidadAgua();
    }
}
