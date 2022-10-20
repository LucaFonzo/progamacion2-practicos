package sistemaarchivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Directorio extends  ElementoArchivo{
    private ArrayList<ElementoArchivo> elementos;


    public Directorio(String nombre, LocalDateTime fechaCreacion){
        super(nombre,fechaCreacion);
        this.elementos = new ArrayList<>();
    }

    @Override
    public Integer getTamanio() {
        int resultado = 0;
        for (int i = 0;i < this.elementos.size();i++){
            resultado += this.elementos.get(i).getTamanio();
        }
        return resultado;
    }
}
