package aseguradora;

import java.util.ArrayList;

public class SeguroIntegrador extends Seguro{
    private ArrayList<Seguro> seguros;

    public SeguroIntegrador(Integer dni){
        super(dni);
        this.seguros = new ArrayList<>();
    }

    @Override
    public Double getMonto() {
        Double total = 0.0;
        for (int i = 0;i < this.seguros.size();i++){
            total += this.seguros.get(i).getMonto();
        }
        return total;
    }

    @Override
    public Integer getPoliza() {
        Integer resultado = 0;
        for (int i = 0;i < this.seguros.size();i++){
            if (this.seguros.get(i).getPoliza() > resultado){
                resultado = this.seguros.get(i).getPoliza();
            }
        }
        return resultado;
    }

    @Override
    public boolean tienePalabra(String palabraBuscada) {
        for (int i = 0;i < this.seguros.size();i++){
            if (this.seguros.get(i).tienePalabra(palabraBuscada)){
                return true;
            }
        }
        return false;
    }


}
