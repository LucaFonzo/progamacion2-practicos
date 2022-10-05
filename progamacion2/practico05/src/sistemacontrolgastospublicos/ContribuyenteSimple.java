package sistemacontrolgastospublicos;

public class ContribuyenteSimple {
    private String nombre;
    private int codigoIdentificacionTributaria;
    private double montoFijoAAbonar;


    public ContribuyenteSimple(String nombre,int codigoIdentificacionTributaria,double montoFijoAAbonar){
        this.nombre = nombre;
        this.codigoIdentificacionTributaria = codigoIdentificacionTributaria;
        this.montoFijoAAbonar = montoFijoAAbonar;
    }


    public double calcularImpuestosAAbonar(){
        return this.montoFijoAAbonar;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCodigoIdentificacionTributaria() {
        return this.codigoIdentificacionTributaria;
    }

    public double getMontoFijoAAbonar() {
        return this.montoFijoAAbonar;
    }
}
