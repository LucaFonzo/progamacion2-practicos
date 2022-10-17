package vivero.filtros;

import vivero.Planta;

public class FiltroNombreVulgar extends  Filtro{
    private String nombreVulgarBuscado;

    public FiltroNombreVulgar(String nombreVulgarBuscado){
        this.nombreVulgarBuscado = nombreVulgarBuscado;
    }

    @Override
    public boolean cumple(Planta planta){
        return planta.tieneNombreVulgar(this.nombreVulgarBuscado);
    }
}
