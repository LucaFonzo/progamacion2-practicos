package seleccionFutbol;

import java.time.LocalDateTime;

public class Masajista extends Integrante{
    private int aniosExperiencia;
    private String titulo;

    public Masajista(String nombre,String apellido,int nroPasaporte,LocalDateTime fechaNac,String estado,int aniosExperiencia,String titulo){
        super(nombre,apellido,nroPasaporte,fechaNac,estado);
        this.aniosExperiencia = aniosExperiencia;
        this.titulo = titulo;
    }

}
