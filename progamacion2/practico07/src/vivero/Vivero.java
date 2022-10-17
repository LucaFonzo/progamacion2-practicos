package vivero;

import vivero.filtros.Filtro;

import java.util.ArrayList;

public class Vivero {
    private String nombre;
    private ArrayList<Planta> plantas;

    public Vivero(String nombre){
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public void addPlanta(Planta planta){
        this.plantas.add(planta);
    }

    public ArrayList<Planta> buscarPlantas(Filtro filtro){
        ArrayList<Planta> resultado = new ArrayList<>();
        for (int i = 0;i < this.plantas.size();i++){
            if (filtro.cumple(this.plantas.get(i))){
                resultado.add(this.plantas.get(i));
            }
        }
        return resultado;
    }

}
