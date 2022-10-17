package agroquimicos;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<ProductoQuimico> productoQuimicos;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.productoQuimicos = new ArrayList<>();
    }


    public ArrayList<ProductoQuimico> productosTratan(Enfermedad enfermedad){
        ArrayList<ProductoQuimico> resultado = new ArrayList<>();
        for (int i = 0;i < this.productoQuimicos.size();i++){
            if (enfermedad.productoTrata(this.productoQuimicos.get(i))){
                resultado.add(this.productoQuimicos.get(i));
            }
        }
        return resultado;
    }

    public ArrayList<ProductoQuimico> productosTratanPorCultivoYEnfermedad(Cultivo cultivo,Enfermedad enfermedad){
        ArrayList<ProductoQuimico> resultado = new ArrayList<>();
        for (int i = 0; i < this.productoQuimicos.size();i++){
            if (enfermedad.productoTrata(this.productoQuimicos.get(i)) && !this.productoQuimicos.get(i).seDesaconsejaCultivo(cultivo)){
                resultado.add(this.productoQuimicos.get(i));
            }
        }
        return resultado;
    }
}
