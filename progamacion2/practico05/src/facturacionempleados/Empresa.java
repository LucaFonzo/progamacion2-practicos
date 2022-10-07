package facturacionempleados;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
}
