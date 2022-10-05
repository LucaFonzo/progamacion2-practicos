package sistemacontrolgastospublicos;

public class MonoTributista extends  ContribuyenteSimple{

    private double facturadoPorVentas;
    private double porcentajeFacturado;
    private double porcentajeMontoFijo;

    public MonoTributista(String nombre,int codigoIdentificacionTributaria,double montoFijoAAbonar,double porcentajeFacturado,double porcentajeMontoFijo,double facturadoPorVentas){
        super(nombre,codigoIdentificacionTributaria,montoFijoAAbonar);
        this.porcentajeFacturado = porcentajeFacturado;
        this.porcentajeMontoFijo = porcentajeMontoFijo;
        this.facturadoPorVentas = facturadoPorVentas;
    }

    @Override
    public double calcularImpuestosAAbonar(){
        return this.getMontoFijoAAbonar() * this.getPorcentajeMontoFijo() + this.getFacturadoPorVentas() * this.getPorcentajeFacturado();
    }

    public double getFacturadoPorVentas() {
        return this.facturadoPorVentas;
    }

    public double getPorcentajeFacturado() {
        return this.porcentajeFacturado;
    }

    public double getPorcentajeMontoFijo() {
        return this.porcentajeMontoFijo;
    }
}
