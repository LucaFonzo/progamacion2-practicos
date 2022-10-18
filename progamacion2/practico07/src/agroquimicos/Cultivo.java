package agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesPuedenAfectar;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedadesPuedenAfectar = new ArrayList<>();
    }

    public void addEnfermedad(Enfermedad enfermedad){
        this.enfermedadesPuedenAfectar.add(enfermedad);
    }

    public boolean isUtil(ProductoQuimico productoQuimico){
        for (int i = 0;i < this.enfermedadesPuedenAfectar.size();i++){
            if (this.enfermedadesPuedenAfectar.get(i).productoTrata(productoQuimico)){
                return true;
            }
        }
        return false;
    }
}
