package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FiltroAutor extends  Filtro{
    private String autorBusacado;

    public FiltroAutor(String autorBusacado){
        this.autorBusacado = autorBusacado;
    }

    @Override
    public boolean cumple(Documento documento){
        return documento.tieneAutor(this.autorBusacado);
    }
}
