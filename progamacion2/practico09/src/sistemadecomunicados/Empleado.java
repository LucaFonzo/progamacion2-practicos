package sistemadecomunicados;

import sistemadecomunicados.filtros.Filtro;

import java.util.ArrayList;

public class Empleado extends ElementoEmpleado {
    private String apellido;
    private Integer nroLegajo;
    private ArrayList<Notificacion> notificaciones;


    public Empleado(String nombre,String apellido,Integer nroLegajo){
        super(nombre);
        this.apellido = apellido;
        this.nroLegajo = nroLegajo;
    }


    @Override
    public void addNotificacion(Notificacion notificacion) {
        if (!this.notificaciones.contains(notificacion)){
            this.notificaciones.add(notificacion);
        }
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNroLegajo() {
        return nroLegajo;
    }

    @Override
    public Integer getCantidadNotificaciones() {
        return this.notificaciones.size();
    }

    @Override
    public ArrayList<ElementoEmpleado> buscar(Filtro filtro) {
        ArrayList<ElementoEmpleado> resultado = new ArrayList<>();
        for (int i = 0;i < this.notificaciones.size();i++){
            if (filtro.cumple(this.notificaciones.get(i))){
                Empleado copiaEmpleado = this.copiar();
                resultado.add(copiaEmpleado);
                return resultado;
            }
        }
        return resultado;
    }

    public Empleado copiar(){
        Empleado copiaEmpleado = new Empleado(this.getNombre(),this.getApellido(),this.getNroLegajo());
        for (int i = 0;i < this.notificaciones.size();i++){
            copiaEmpleado.addNotificacion(this.notificaciones.get(i));
        }
        return copiaEmpleado;
    }
}
