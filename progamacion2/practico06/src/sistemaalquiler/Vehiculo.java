package sistemaalquiler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;

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
    public void alquilar(Cliente cliente, long diasAlquiladas) {
        if (this.sePuedeAlquilar()){
            this.setFechaAlquiler(LocalDate.now());
            this.setFechaVencimiento(LocalDate.from(LocalDate.now().plusDays(diasAlquiladas)));
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
        return ChronoUnit.DAYS.between(this.getFechaAlquiler(),this.getFechaVencimiento()) > this.getDiasAlquiladas();
    }
}
