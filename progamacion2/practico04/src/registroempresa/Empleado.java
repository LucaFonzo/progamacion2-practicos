package registroempresa;

public class Empleado extends Asociativo {
    private int nroLegajo;
    private double sueldo;

    public Empleado(String nombre,String apellido,int edad,int nroLegajo,double sueldo){
        super(nombre,apellido,edad);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }
    public int getNroLegajo() {
        return nroLegajo;
    }
    public double getSueldo() {
        return sueldo;
    }
    @Override
    public String getInfo(){
        return "Tipo: Empleado " + super.getInfo() + " Nro Legajo: " + this.getNroLegajo() + " Sueldo: " + this.getSueldo();
    }
}
