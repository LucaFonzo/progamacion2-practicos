package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public abstract class Filtro {


    public abstract boolean cumple(Documento documento);
}
