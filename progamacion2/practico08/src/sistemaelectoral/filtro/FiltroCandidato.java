package sistemaelectoral.filtro;

import sistemaelectoral.Candidato;
import sistemaelectoral.Voto;

public class FiltroCandidato extends Filtro{
    private Candidato candidatoBuscado;

    public FiltroCandidato(Candidato candidatoBuscado){
        this.candidatoBuscado = candidatoBuscado;
    }

    @Override
    public boolean cumple(Voto voto) {
        return voto.getCandidato().equals(candidatoBuscado);
    }
}
