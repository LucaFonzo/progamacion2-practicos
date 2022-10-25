package aseguradora.filtros;

import aseguradora.Seguro;

public class FiltroDescripcion extends Filtro{
    private String palabraBuscada;

    public FiltroDescripcion(String palabraBuscada){
        this.palabraBuscada = palabraBuscada;
    }
    @Override
    public boolean cumple(Seguro seguro){
        return seguro.tienePalabra(palabraBuscada);
    }
}
