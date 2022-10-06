package sistemacontrolgastospublicos;

import java.util.ArrayList;

public class Ciudad {

    private String nombre;
    private int poblacion;
    private double gastos;

    private ArrayList<ContribuyenteSimple> contribuyentes;

    public Ciudad(String nombre,int poblacion,double gastos){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.gastos = gastos;
        this.contribuyentes = new ArrayList<>();
    }

    public boolean estaEnDeficit(){
        return this.calcularRecaudacion() < this.getGastos();
    }

    public double calcularRecaudacion(){
        double recaudacionTotal = 0;
        for (int i = 0;i < this.contribuyentes.size();i++){
            recaudacionTotal += this.contribuyentes.get(i).calcularImpuestosAAbonar();
        }
        return recaudacionTotal;
    }

    public double getGastos(){
        return  this.gastos;
    }
}
