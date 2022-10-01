package avicola;

import java.time.LocalDateTime;

public class ProductoCongeladoPorNitrogeno extends ProductoRefrigerado{
    private String metodoCongelacion;
    private int tiempoEnNitrogeno_segundos;
    public ProductoCongeladoPorNitrogeno(LocalDateTime fechaVencimiento, int nroLote, LocalDateTime fechaEnvasado, String granjaOrigen, String codigoSupervision, double temperaturaMantenimiento,String metodoCongelacion,int tiempoEnNitrogeno_segundos){
        super(fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen,codigoSupervision,temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoEnNitrogeno_segundos = tiempoEnNitrogeno_segundos;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public int getTiempoEnNitrogeno_segundos() {
        return tiempoEnNitrogeno_segundos;
    }
    @Override
    public String mostrarEtiqueta(){
        return super.mostrarEtiqueta() + " Metodo Congelacion: " + this.getMetodoCongelacion() + " Tiempo En Nitrogeno: " + this.getTiempoEnNitrogeno_segundos();
    }

}
