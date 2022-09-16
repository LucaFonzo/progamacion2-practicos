import java.awt.*;

public class ElectroDomestico {
    final static double TOPECONSUMO = 45.0;
    private String nombre;
    private Double precioBase;
    private Color color;
    private Double consumoEnergetico_kiloWats;
    private Double peso_kilos;
    public ElectroDomestico(String nombre){
        this.nombre = nombre;
        this.precioBase = 100.0;
        this.color = Color.lightGray;
        this.consumoEnergetico_kiloWats = 10.0;
        this.peso_kilos = 2.0;
    }
    //GETS
    public String getNombre(){
        return this.nombre;
    }
    public Double getPrecioBase(){
        return this.precioBase;
    }
    public Color getColor(){
        return this.color;
    }
    public Double getConsumoEnergetico_kiloWats(){
        return this.consumoEnergetico_kiloWats;
    }
    public Double getPeso_kilos(){
        return this.peso_kilos;
    }
    //SETS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecioBase(Double precioBase){
        this.precioBase = precioBase;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setConsumoEnergetico_kiloWats(Double consumoEnergetico_kiloWats){
        this.consumoEnergetico_kiloWats = consumoEnergetico_kiloWats;
    }
    public void setPeso_kilos(Double peso_kilos){
        this.peso_kilos = peso_kilos;
    }

    public boolean itsLowConsumption(){
        if (this.consumoEnergetico_kiloWats <= TOPECONSUMO){
            return true;
        }
        return false;
    }
    public double calcBalance(){
        double balance = this.consumoEnergetico_kiloWats / this.peso_kilos;
        return balance;
    }
    public boolean itsHighGama(){
        double balance = calcBalance();
        if (balance > 3){
            return true;
        }
        return false;
    }

}
