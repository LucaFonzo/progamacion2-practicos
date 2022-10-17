package busquedadocumentos.Filtros;

import busquedadocumentos.Documento;

public class FiltroTitulo extends Filtro {
    private String tituloBuscado;


    public FiltroTitulo(String tituloBuscado){
        this.tituloBuscado = tituloBuscado;
    }


    @Override
    public boolean cumple(Documento documento){
        return this.tituloBuscado.equals(documento.getTitulo());
    }

}
