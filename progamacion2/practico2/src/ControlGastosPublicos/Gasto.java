package ControlGastosPublicos;

public class Gasto {
    private String tipoGasto;
    private double totalGastado;

    public Gasto(String tipoGasto,double totalGastado){
        this.tipoGasto = tipoGasto;
        this.totalGastado = totalGastado;
    }

    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public double getTotalGastado() {
        return totalGastado;
    }

    public void setTotalGastado(double totalGastado) {
        this.totalGastado = totalGastado;
    }
}
