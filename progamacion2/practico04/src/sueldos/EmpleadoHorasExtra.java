package sueldos;

public class EmpleadoHorasExtra extends EmpleadoContratado {

    private double horasExtrasTrabajadas;
    private double montoExtra;

    public EmpleadoHorasExtra(String nombre,int dni,double salarioFijo,double montoExtra,double horasExtrasTrabajadas){
        super(nombre,dni,salarioFijo);
        this.montoExtra = montoExtra;
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }
    @Override
    public double getSueldoSemanal(){
        return super.getSueldoSemanal() + this.calcularSueldoExtra();
    }
    public double calcularSueldoExtra(){
        double total = 0;
        for (int i = 0;i < this.horasExtrasTrabajadas;i++){
            total += montoExtra;
        }
        return total;
    }
}
