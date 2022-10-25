package sistemacensos;

import sistemacensos.filtros.Filtro;

import java.util.ArrayList;

public class Comarca extends ElementoRegion implements Comparable<Comarca> {
    private Double superficie;
    private Integer cantidadHabitantes;
    private Double montoTotalIngresos;

    public Comarca(String nombre,Double superficie,Integer cantidadHabitantes,Double montoTotalIngresos){
        super(nombre);
        this.superficie = superficie;
        this.cantidadHabitantes = cantidadHabitantes;
        this.montoTotalIngresos = montoTotalIngresos;
    }

    public Double getSuperficie() {
        return this.superficie;
    }

    public Integer getCantidadHabitantes() {
        return this.cantidadHabitantes;
    }

    public Double getMontoTotalIngresos() {
        return this.montoTotalIngresos;
    }

    public ArrayList<ElementoRegion> buscar(Filtro filtro){
        ArrayList<ElementoRegion> resultado = new ArrayList<>();
        if(filtro.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public int compareTo(Comarca o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
