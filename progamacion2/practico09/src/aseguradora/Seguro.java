package aseguradora;

import java.util.Comparator;

public abstract class Seguro {
    private Integer dni;

    public Seguro(Integer dni){
        this.dni = dni;
    }

    public Integer getDni(){
        return this.dni;
    }

    public abstract Double getMonto();

    public abstract Integer getPoliza();

    public abstract boolean tienePalabra(String palabraBuscada);
}
