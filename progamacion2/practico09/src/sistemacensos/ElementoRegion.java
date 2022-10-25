package sistemacensos;

import sistemacensos.filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoRegion {
    private String nombre;

    public ElementoRegion(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract Integer getCantidadHabitantes();
    public abstract Double getSuperficie();
    public abstract Double getMontoTotalIngresos();

    public abstract ArrayList<ElementoRegion> buscar(Filtro filtro);

    public Double getIngresosPerCapita(){
        return this.getMontoTotalIngresos() / this.getCantidadHabitantes();
    }
    public Double getDensidadPoblacion(){
        return this.getCantidadHabitantes() / this.getSuperficie();
    }
}
