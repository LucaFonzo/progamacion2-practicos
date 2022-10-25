package controlgastos;

import controlgastos.filtros.Filtro;
import sistemacensos.ElementoRegion;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Gasto {
    private String descripcion;
    private LocalDate fecha;
    private ArrayList<String> caracteristicas;

    public Gasto(String descripcion,LocalDate fecha){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.caracteristicas = new ArrayList<>();
    }

    public boolean tieneCaracteristica(String caracteristica){
        return this.caracteristicas.contains(caracteristica);
    }

    public abstract Double getMonto();

    public void addCaracteristica(String caracteristica){
        this.caracteristicas.add(caracteristica);
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public abstract ArrayList<Gasto> buscar(Filtro filtro);

}
