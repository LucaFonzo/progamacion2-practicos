package sistemaalquiler;

public class Vehiculo extends  Item{
    private String marca;
    private double kms;
    private String patente;
    private String tipoCombustible;

    private Cliente clienteAsignado;

    public Vehiculo(String marca,double kms,String patente,String tipoCombustible){
        super();
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
        this.tipoCombustible = tipoCombustible;
        this.clienteAsignado = null;
    }
    public void setClienteAsignado(Cliente cliente){
        this.clienteAsignado = cliente;
    }

    @Override
    public void alquilar(Cliente cliente,int fechaAlquiler,int fechaVencimiento) {
        if (this.sePuedeAlquilar()){
            this.setFechaAlquiler(fechaAlquiler);
            this.setFechaVencimiento(fechaVencimiento);
            cliente.aniadirItem(this);
            this.setClienteAsignado(cliente);
        }

    }

    @Override
    public boolean sePuedeAlquilar(){
        if (this.clienteAsignado != null){
            return true;
        }
        return false;
    }
    @Override
    public boolean isVencido(){
        return this.getFechaVencimiento() > this.getFechaAlquiler();
    }
}
