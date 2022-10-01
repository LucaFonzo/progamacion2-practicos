package sueldos;

public class EmpleadoContratado {
    private String nombre;
    private int dni;
    private double salarioFijo;
    public EmpleadoContratado(String nombre,int dni,double salarioFijo){
        this.nombre = nombre;
        this.dni = dni;
        this.salarioFijo = salarioFijo;
    }
    public double getSueldoSemanal(){
        return this.salarioFijo;
    }
}
