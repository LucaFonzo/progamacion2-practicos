package facturacionempleados;

public class EmpleadoBonos extends Empleado{
    private double plusBono;
    private int cantidadDeBonosNecesaria;

    public EmpleadoBonos(String nombre,String apellido,int dni,double sueldoMensual,double plusBono,int cantidadDeBonosNecesaria){
        super(nombre,apellido,dni,sueldoMensual);
        this.plusBono = plusBono;
        this.cantidadDeBonosNecesaria = cantidadDeBonosNecesaria;
    }
}
