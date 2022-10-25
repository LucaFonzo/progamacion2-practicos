package aseguradora.filtros;

import aseguradora.Seguro;

public class FiltroDni extends Filtro{
    private Integer dniBuscado;

    public FiltroDni(Integer dniBuscado){
        this.dniBuscado = dniBuscado;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDni().equals(this.dniBuscado);
    }
}
