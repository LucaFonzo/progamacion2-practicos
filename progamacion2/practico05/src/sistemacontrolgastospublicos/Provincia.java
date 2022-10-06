package sistemacontrolgastospublicos;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre){
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public boolean tieneMasDeLaMitadEnDeficit(){
        int total = 0;
        for (int i = 0;i < this.ciudades.size();i++){
            if (this.ciudades.get(i).estaEnDeficit()){
                total += 1;
            }
        }
        if (total > this.ciudades.size() / 2){
            return true;
        }
        return false;
    }
}
