package fabricademuebles;

import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Mueble> productosDisponibles;

    public Fabrica(String nombre){
        this.nombre = nombre;
        this.productosDisponibles = new ArrayList<Mueble>();
    }
    public double calcularPrecioVentaProductos(){
        double total = 0;
        for (int i = 0;i < productosDisponibles.size();i++){
            total += productosDisponibles.get(i).getPrecioVenta();
        }
        return total;
    }
    public double calcularPrecioFabricacionProductos(){
        double total = 0;
        for (int i = 0;i < productosDisponibles.size();i++){
            total += productosDisponibles.get(i).getCostoFabricacion();
        }
        return total;
    }
}
