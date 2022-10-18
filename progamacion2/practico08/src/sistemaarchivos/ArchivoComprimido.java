package sistemaarchivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ArchivoComprimido extends ElementoArchivo{
    private Integer factorComprension;
    private ArrayList<ElementoArchivo> elementos;
    public ArchivoComprimido(String nombre, LocalDateTime fechaCreacion,Integer factorComprension){
        super(nombre,fechaCreacion);
        this.factorComprension = factorComprension;
    }

    @Override
    public boolean tieneNombre(String nombreBuscado) {
        for (int i = 0;i < this.elementos.size();i++){
            if (this.elementos.get(i).equals(nombreBuscado)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getTamanio() {
        Integer resultado = 0;
        for (int i = 0;i < this.elementos.size();i++){
            resultado += this.elementos.get(i).getTamanio();
        }

        return resultado / this.factorComprension;
    }
}
