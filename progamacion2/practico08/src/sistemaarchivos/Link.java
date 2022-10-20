package sistemaarchivos;

import java.time.LocalDateTime;

public class Link extends ElementoArchivo{
    private ElementoArchivo ref;

    public Link(String nombre, LocalDateTime fechaCreacion, ElementoArchivo ref){
        super(nombre,fechaCreacion);
        this.ref = ref;
    }
    @Override
    public Integer getTamanio() {
        return 1;
    }
}
