package navidad;

import navidad.filtros.Filtro;

import java.util.ArrayList;

public class Zona extends Correo{
    private ArrayList<Correo> correos;

    public Zona(){
        this.correos = new ArrayList<>();
    }

    public void addCorreo(Correo correo){
        this.correos.add(correo);
    }

    @Override
    public Double getPorcentajeFiltro(Filtro filtro) {
        Double total = 0.0;
        for (int i = 0;i < this.correos.size();i++){
            total += correos.get(i).getCantidadFiltro(filtro);
        }
        return (total / this.getTotalCartas()) * 100;
    }

    @Override
    public Integer getCantidadFiltro(Filtro filtro) {
        Integer total = 0;
        for (int i = 0;i < this.correos.size();i++){
            total += this.correos.get(i).getCantidadFiltro(filtro);
        }
        return total;
    }

    @Override
    public Integer getTotalCartas() {
        Integer total = 0;
        for (int i = 0;i < this.correos.size();i++){
            total += this.correos.get(i).getTotalCartas();
        }
        return total;
    }
}
