package agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre){
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public boolean productoTrata(ProductoQuimico producto){
        for (int i = 0;i < this.estadosPatologicos.size();i++){
            if (!producto.tieneEstadoPatologico(this.estadosPatologicos.get(i))){
                return false;
            }
        }
        return true;
    }
}
