package facturacionempleados;

import java.util.ArrayList;

public class EmpleadoVentas extends Empleado{
    private ArrayList<Double> ventas;
    private double porcentajePorVentas;
    public EmpleadoVentas(String nombre,String apellido,int dni,double sueldoMensual,double porcentajePorVentas){
        super(nombre,apellido,dni,sueldoMensual);
        this.porcentajePorVentas = porcentajePorVentas;
        this.ventas = new ArrayList<>();
    }

    public void aniadirVenta(Double venta){
        this.ventas.add(venta);
    }

    
}
