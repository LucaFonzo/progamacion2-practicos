package sueldos;

public class EmpleadoPorComision extends EmpleadoContratado {
    private int cantidadDeVentas;
    private double porcentajePorVenta;

    public EmpleadoPorComision(String nombre,int dni,double salarioFijo,int cantidadDeVentas,double porcentajePorVenta){
        super(nombre,dni,salarioFijo);
        this.cantidadDeVentas = cantidadDeVentas;
        this.porcentajePorVenta = porcentajePorVenta;
    }
    @Override
    public double getSueldoSemanal(){
        return super.getSueldoSemanal() + ( super.getSueldoSemanal() * this.calcularPorcentaje() / 100);
    }
    public double calcularPorcentaje(){
        double total = 0;
        for (int i = 0;i < this.cantidadDeVentas;i++){
            total += this.porcentajePorVenta;
        }
        return total;
    }
}
