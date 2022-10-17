package vivero.filtros;
import vivero.Planta;

public class FiltroNombreCientifico extends Filtro {
    private String nombreCientificoBuscado;

    public FiltroNombreCientifico(String nombreCientificoBuscado){
        this.nombreCientificoBuscado = nombreCientificoBuscado;
    }

    @Override
    public boolean cumple(Planta planta){
        return this.nombreCientificoBuscado.equals(planta.getNombreCientifico());
    }
}
