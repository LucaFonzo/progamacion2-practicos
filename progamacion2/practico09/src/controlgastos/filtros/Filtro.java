package controlgastos.filtros;


import controlgastos.Gasto;

public abstract class Filtro {

    public abstract boolean cumple(Gasto gasto);
}
