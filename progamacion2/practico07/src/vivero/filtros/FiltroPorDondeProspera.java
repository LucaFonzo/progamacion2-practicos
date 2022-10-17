package vivero.filtros;

import vivero.Planta;

public class FiltroPorDondeProspera extends Filtro{
    private String dondeProsperaBuscado;

    public FiltroPorDondeProspera(String dondeProsperaBuscado){
        this.dondeProsperaBuscado = dondeProsperaBuscado;
    }

    @Override
    public boolean cumple(Planta planta){
        return this.dondeProsperaBuscado.equals(planta.getDondeProspera());
    }
}
