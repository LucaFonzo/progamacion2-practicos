package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FiltroNoContienePalabraClave extends Filtro{
    private String palabraNoBuscada;

    public FiltroNoContienePalabraClave(String palabraNoBuscada){
        this.palabraNoBuscada = palabraNoBuscada;
    }

    @Override
    public boolean cumple(Documento documento){
        return !documento.tienePalabra(palabraNoBuscada);
    }
}
