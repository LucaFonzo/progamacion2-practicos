package agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosSeDesaconseja;
    private ArrayList<String> estadosPatologicos;

    public ProductoQuimico(String nombre){
        this.nombre = nombre;
        this.cultivosSeDesaconseja = new ArrayList<>();
        this.estadosPatologicos = new ArrayList<>();
    }
    public boolean seDesaconsejaCultivo (Cultivo cultivo){
        return this.cultivosSeDesaconseja.contains(cultivo);
    }
    public boolean tieneEstadoPatologico(String estadoPatologico){return this.estadosPatologicos.contains(estadoPatologico);}
}
