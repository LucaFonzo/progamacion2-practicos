package sistemacensos;

import sistemacensos.filtros.Filtro;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Territorio extends ElementoRegion{
    private ArrayList<ElementoRegion> elementoRegions;

    public Territorio(String nombre){
        super(nombre);
        this.elementoRegions = new ArrayList<>();
    }

    public ArrayList<ElementoRegion> buscar(Filtro filtro){
        ArrayList<ElementoRegion> resultado = new ArrayList<>();
        for (int i = 0;i < this.elementoRegions.size();i++){
            if (filtro.cumple(this.elementoRegions.get(i))){
                ArrayList<ElementoRegion> resultadoHijo = this.elementoRegions.get(i).buscar(filtro);
                resultado.addAll(resultadoHijo);
            }
        }
        return resultado;
    }

    @Override
    public Integer getCantidadHabitantes() {
        Integer total = 0;
        for (int i = 0;i < this.elementoRegions.size();i++){
            total += this.elementoRegions.get(i).getCantidadHabitantes();
        }
        return total;
    }

    @Override
    public Double getSuperficie() {
        Double total = 0.0;
        for (int i = 0;i < this.elementoRegions.size();i++){
            total += this.elementoRegions.get(i).getSuperficie();
        }
        return total;
    }

    @Override
    public Double getMontoTotalIngresos() {
        Double total = 0.0;
        for (int i = 0;i < this.elementoRegions.size();i++){
            total += this.elementoRegions.get(i).getMontoTotalIngresos();
        }
        return total;
    }
}
