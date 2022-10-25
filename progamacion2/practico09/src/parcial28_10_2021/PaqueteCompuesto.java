package parcial28_10_2021;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteCompuesto extends ElementoViaje{
    private ArrayList<ElementoViaje> paquetes;

    public PaqueteCompuesto(Integer id,Integer cantidadPasajeros){
        super(id,cantidadPasajeros);
        this.paquetes = new ArrayList<>();
    }
    public LocalDate getFechaPago() {
        LocalDate fechaPago = this.paquetes.get(0).getFechaPago();
        for (int i = 1;i < this.paquetes.size();i++){
            if (this.paquetes.get(i).getFechaPago() != null){
                fechaPago = this.paquetes.get(i).getFechaPago();
            }
        }
        return fechaPago;
    }

    @Override
    public String getCiudadOrigen() {
        return this.paquetes.get(0).getCiudadOrigen();
    }

    @Override
    public String getCiudadDestino() {
        return this.paquetes.get(this.paquetes.size() - 1).getCiudadDestino();
    }

    @Override
    public Double getCosto() {
        Double resultado = 0.0;
        for (int i = 0;i < this.paquetes.size();i++){
            resultado += this.paquetes.get(i).getCosto();
        }
        return resultado;
    }
}
