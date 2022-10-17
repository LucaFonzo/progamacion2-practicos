package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FiltroContenido extends  Filtro{
    private String fraseBuscada;

    public FiltroContenido(String fraseBuscada){
        this.fraseBuscada = fraseBuscada;
    }

    @Override
    public boolean cumple(Documento documento){
        return this.fraseBuscada.contains(documento.getContenido());
    }
}
