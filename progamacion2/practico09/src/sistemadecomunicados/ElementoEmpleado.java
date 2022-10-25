package sistemadecomunicados;

import sistemadecomunicados.filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoEmpleado {
    private String nombre;

    public ElementoEmpleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void addNotificacion(Notificacion notificacion);

    public abstract Integer getCantidadNotificaciones();


    public abstract ArrayList<ElementoEmpleado> buscar(Filtro filtro);
}
