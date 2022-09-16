package ControlGastosPublicos;

public class Impuesto {
    private double totalRecaudado;
    public Impuesto(double totalRecaudado){
        this.totalRecaudado = totalRecaudado;
    }

    public double getTotalRecaudado(){
        return this.totalRecaudado;
    }
}
