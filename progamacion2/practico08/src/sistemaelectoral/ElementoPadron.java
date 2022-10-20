package sistemaelectoral;


import sistemaelectoral.filtro.Filtro;

public abstract class ElementoPadron {

    public abstract Integer getCantidadFiltro(Filtro filtro);
    public abstract Double getPorcentajeFiltro(Filtro filtro);
    public abstract Integer getCantidadVotos();
}
