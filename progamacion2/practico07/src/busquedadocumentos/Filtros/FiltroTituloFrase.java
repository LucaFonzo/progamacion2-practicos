package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FiltroTituloFrase extends Filtro{

    private String fraseBuscada;

    public FiltroTituloFrase(String fraseBuscada){
        this.fraseBuscada = fraseBuscada;
    }


    public boolean cumple(Documento documento){
        return this.fraseBuscada.contains(documento.getTitulo());
    }
}
