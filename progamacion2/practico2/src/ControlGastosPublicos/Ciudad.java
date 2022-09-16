package ControlGastosPublicos;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private double totalRecaudado;

    private ArrayList<Gasto> gastos;
    public Ciudad(String nombre,int poblacion){
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.totalRecaudado = 0;
        this.gastos = new ArrayList<>();
    }

    public void aniadirRecaudacion(Impuesto imp1,Impuesto imp2,Impuesto imp3,Impuesto imp4,Impuesto imp5){
        this.totalRecaudado = imp1.getTotalRecaudado() + imp2.getTotalRecaudado() + imp3.getTotalRecaudado() + imp4.getTotalRecaudado() + imp5.getTotalRecaudado();
    }
    public void aniadirGasto(Gasto gastoNuevo){
        gastos.add(gastoNuevo);
    }

    public boolean gastaMasDeLoQueRecauda(){
        double totalGastado = getTotalGastado();
        if (totalGastado > totalRecaudado){
            return true;
        }
        return false;
    }

    public double getTotalGastado(){
        double totalGastado = 0;
        for (int i = 0;i < gastos.size();i++){
            totalGastado += gastos.get(i).getTotalGastado();
        }
        return totalGastado;
    }
}
