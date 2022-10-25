package sistemacensos;

import java.util.ArrayList;

public class Territorio extends ElementoRegion{
    private ArrayList<ElementoRegion> elementoRegions;

    public Territorio(String nombre){
        super(nombre);
        this.elementoRegions = new ArrayList<>();
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
