package avicola;

import java.time.LocalDateTime;

public class ProductoFresco{
    private LocalDateTime fechaVencimiento;
    private int nroLote;
    private LocalDateTime fechaEnvasado;
    private String granjaOrigen;
    public ProductoFresco(LocalDateTime fechaVencimiento,int nroLote,LocalDateTime fechaEnvasado,String granjaOrigen){
        this.fechaVencimiento = fechaVencimiento;
        this.nroLote = nroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getNroLote() {
        return nroLote;
    }

    public LocalDateTime getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public String mostrarEtiqueta(){
        return "Fecha vencimiento: " + this.getFechaEnvasado() +" Nro Lote: " + this.getNroLote() + " Fecha envasado: " + this.getFechaEnvasado() + " Granja origen: " + this.getGranjaOrigen();
    }
}
