package sistemaelectoral.comparadores;

import sistemaelectoral.Candidato;
import sistemaelectoral.Voto;

import java.util.Comparator;

public class ComparadorPartidoPolitico implements Comparator<Candidato> {


    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getPartidoPolitico().compareTo(o2.getPartidoPolitico());
    }
}
