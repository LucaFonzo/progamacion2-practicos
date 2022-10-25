package sistemadecomunicados;

import java.time.LocalDate;
import java.util.ArrayList;

public class Notificacion {
    private Empleado empleadoEnvio;
    private ArrayList<String> palabras;
    private LocalDate fechaEvio;

    public Notificacion(Empleado empleadoEnvio,LocalDate fechaEvio){
        this.empleadoEnvio = empleadoEnvio;
        this.fechaEvio = fechaEvio;
        this.palabras = new ArrayList<>();
    }

    public Empleado getEmpleadoEnvio() {
        return empleadoEnvio;
    }

    public LocalDate getFechaEvio() {
        return fechaEvio;
    }

    public boolean tienePalabra(String palabraBuscada){
        return this.palabras.contains(palabraBuscada);
    }
}
