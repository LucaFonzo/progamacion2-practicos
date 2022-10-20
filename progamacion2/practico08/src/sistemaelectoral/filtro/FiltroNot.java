package sistemaelectoral.filtro;

import sistemaelectoral.Voto;

public class FiltroNot extends Filtro{
    private Filtro filtro;

    public FiltroNot(Filtro filtro){
        this.filtro = filtro;
    }
    @Override
    public boolean cumple(Voto voto){
        return !this.filtro.cumple(voto);
    }
}
