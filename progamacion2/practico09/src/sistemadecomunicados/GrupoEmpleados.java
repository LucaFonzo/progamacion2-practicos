package sistemadecomunicados;

import sistemadecomunicados.filtros.Filtro;

import java.util.ArrayList;

public class GrupoEmpleados extends ElementoEmpleado{
    private ArrayList<ElementoEmpleado> grupos;
    private Filtro politicaNotificaciones;
    public GrupoEmpleados(String nombre,Filtro politicaNotificaciones){
        super(nombre);
        this.grupos = new ArrayList<>();
        this.politicaNotificaciones = politicaNotificaciones;
    }

    public void addNotificacion(Notificacion notificacion){
        if (this.politicaNotificaciones.cumple(notificacion)){
            for (int i = 0;i < this.grupos.size();i++){
                this.grupos.get(i).addNotificacion(notificacion);
            }
        }

    }

    @Override
    public Integer getCantidadNotificaciones() {
        Integer total = 0;
        for (int i = 0;i < this.grupos.size();i++){
            total += this.grupos.get(i).getCantidadNotificaciones();
        }
        return total;
    }

    @Override
    public ArrayList<ElementoEmpleado> buscar(Filtro filtro) {
        ArrayList<ElementoEmpleado> resultado = new ArrayList<>();
        for (int i = 0;i < this.grupos.size();i++){
            ArrayList<ElementoEmpleado> resultadoHijo = this.grupos.get(i).buscar(filtro);
            for (int j = 0;i < resultadoHijo.size();j++){
                if (!resultado.contains(resultadoHijo.get(j))){
                    resultado.add(resultadoHijo.get(j));
                }
            }
        }
        return resultado;
    }
}
