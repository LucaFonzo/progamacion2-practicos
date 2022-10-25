package sistemadecomunicados.filtros;

import sistemadecomunicados.ElementoEmpleado;
import sistemadecomunicados.Empleado;
import sistemadecomunicados.Notificacion;

public abstract class Filtro {

    public abstract boolean cumple(Notificacion notificacion);
}
