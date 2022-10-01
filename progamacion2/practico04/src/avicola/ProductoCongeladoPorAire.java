package avicola;

import java.time.LocalDateTime;

public class ProductoCongeladoPorAire extends ProductoRefrigerado{
    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeDioxidoDeCarbono;
    private int porcentajeVaporDeAgua;

    public ProductoCongeladoPorAire(LocalDateTime fechaVencimiento, int nroLote, LocalDateTime fechaEnvasado, String granjaOrigen,String codigoSupervision,double temperaturaMantenimiento,int porcentajeNitrogeno,int porcentajeOxigeno,int porcentajeDioxidoDeCarbono,int porcentajeVaporDeAgua){
        super(fechaVencimiento,nroLote,fechaEnvasado,granjaOrigen,codigoSupervision,temperaturaMantenimiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoDeCarbono = porcentajeDioxidoDeCarbono;
        this.porcentajeVaporDeAgua = porcentajeVaporDeAgua;
    }
    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }
    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }
    public int getPorcentajeDioxidoDeCarbono() {
        return porcentajeDioxidoDeCarbono;
    }
    public int getPorcentajeVaporDeAgua() {
        return porcentajeVaporDeAgua;
    }
    @Override
    public String mostrarEtiqueta(){
        return super.mostrarEtiqueta() + " Porcentaje Nitrogeno: " + this.getPorcentajeNitrogeno() + " Porcentaje Oxigeno: " + this.getPorcentajeOxigeno() + " Porcentaje Dioxido De Carbono: " + this.getPorcentajeDioxidoDeCarbono() + " Porcentaje Vapor De Agua: " + this.getPorcentajeVaporDeAgua();
    }
}
