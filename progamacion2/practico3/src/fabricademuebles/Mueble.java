package fabricademuebles;

public class Mueble {
    private int porcentajeVenta;
    private double peso;
    private double costoFabricacion;
    private String tipoMadera;
    private String color;

    public Mueble(double peso,double costoFabricacion,String tipoMadera,String color,int porcentajeVenta){
        this.peso = peso;
        this.costoFabricacion = costoFabricacion;
        this.tipoMadera = tipoMadera;
        this.color = color;
        this.porcentajeVenta = porcentajeVenta;
    }
    public double getCostoFabricacion(){
        return this.costoFabricacion;
    }
    public double getPrecioVenta(){
        return this.costoFabricacion + this.costoFabricacion * porcentajeVenta / 100;
    }
}
