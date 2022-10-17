package sistemaarchivos;

import java.util.ArrayList;

public class Archivo extends ElementoSistemaArchivo {
    private ArrayList<ElementoSistemaArchivo> elementos;
    private int tamanio;

    public Archivo(String nombre,int tamanio){
        super(nombre);
        this.tamanio = tamanio;
        this.elementos = new ArrayList<>();
    }

    @Override
    public int getTamanio() {
        return this.tamanio;
    }

    @Override
    public int getCantElementos() {
        return 0;
    }
}
