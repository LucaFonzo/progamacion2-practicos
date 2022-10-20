package navidad.filtros;

import navidad.Carta;

public class FiltroRegalo extends Filtro {
    private String regaloBuscado;

    public FiltroRegalo(String regaloBuscado){
        this.regaloBuscado = regaloBuscado;
    }
    @Override
    public boolean cumple(Carta carta) {
        return carta.tieneRegalo(this.regaloBuscado);
    }
}
