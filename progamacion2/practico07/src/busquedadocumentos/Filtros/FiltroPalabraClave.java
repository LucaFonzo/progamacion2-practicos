package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FiltroPalabraClave extends  Filtro{
    private String palabraBuscada;

    public FiltroPalabraClave(String palabraBuscada){
        this.palabraBuscada = palabraBuscada;
    }

    public boolean cumple(Documento documento){
        return documento.tienePalabra(this.palabraBuscada);
    }
}
