package facturacionempleados;

import java.util.ArrayList;

public class EmpleadoVentas extends Empleado{
    private ArrayList<Double> ventas;
    private double porcentajeTotalVentas;
    public EmpleadoVentas(String nombre,String apellido,int dni,double sueldoMensual,double porcentajeTotalVentas){
        super(nombre,apellido,dni,sueldoMensual);
        this.porcentajeTotalVentas = porcentajeTotalVentas;
        this.ventas = new ArrayList<>();
    }

    public void aniadirVenta(Double venta){
        this.ventas.add(venta);
    }

    
}
