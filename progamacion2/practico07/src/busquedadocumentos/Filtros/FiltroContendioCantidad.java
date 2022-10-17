package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FiltroContendioCantidad extends Filtro{
    private int cantidadMinima;

    public FiltroContendioCantidad(int cantidadMinima){
        this.cantidadMinima = cantidadMinima;
    }


    @Override
    public boolean cumple(Documento documento){
        return this.cantidadMinima < documento.getCantidadPalabrasContenido();
    }
}
