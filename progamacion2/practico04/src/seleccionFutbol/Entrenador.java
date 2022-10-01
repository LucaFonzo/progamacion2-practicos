package seleccionFutbol;

import java.time.LocalDateTime;

public class Entrenador extends  Integrante{
    private String identificador;

    public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDateTime fechaNac,String estado,String identificador){
        super(nombre,apellido,nroPasaporte,fechaNac,estado);
        this.identificador = identificador;
    }
}
