package seleccionFutbol;

import java.time.LocalDateTime;

public class Futbolista extends Integrante{
    private String posicion;
    private String piernaBuena;
    private int golesConvertidos;

    public Futbolista(String nombre, String apellido, int nroPasaporte, LocalDateTime fechaNac,String estado, String posicion,String piernaBuena,int golesConvertidos){
        super(nombre,apellido,nroPasaporte,fechaNac,estado);
        this.posicion = posicion;
        this.piernaBuena = piernaBuena;
        this.golesConvertidos = golesConvertidos;
    }
}
