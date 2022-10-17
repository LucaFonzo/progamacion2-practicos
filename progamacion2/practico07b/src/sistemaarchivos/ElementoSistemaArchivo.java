package sistemaarchivos;

import java.util.ArrayList;

public abstract class ElementoSistemaArchivo {
    private String nombre;

    public ElementoSistemaArchivo(String nombre){
        this.nombre = nombre;
    }

    public abstract int getTamanio();

    public abstract int getCantElementos(); //Se hacen estos metodos abstractos para obligar a los hijos a implementarlos

}
