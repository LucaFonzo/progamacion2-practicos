package navidad;


import navidad.filtros.Filtro;

public abstract class Correo {
    public abstract Double getPorcentajeFiltro(Filtro filtro);
    public abstract Integer getCantidadFiltro(Filtro filtro);
    public abstract Integer getTotalCartas();
}
