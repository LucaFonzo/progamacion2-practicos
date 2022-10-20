package sistemaelectoral.filtro;

import sistemaelectoral.Voto;

import java.time.LocalDate;

public class FiltroHorario extends Filtro{
    private LocalDate horaMin;

    public FiltroHorario(LocalDate horaMin){
        this.horaMin = horaMin;
    }

    @Override
    public boolean cumple(Voto voto) {
        return voto.getHoraEmision().isAfter(this.horaMin);
    }
}
