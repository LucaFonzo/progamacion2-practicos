package sistemaelectoral.filtro;

import sistemaelectoral.ElementoPadron;
import sistemaelectoral.Voto;

public abstract class Filtro {

     public abstract boolean cumple(Voto voto);
}
