package sistemaelectoral;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Voto {
    private Candidato candidato;
    private LocalDate horaEmision;

    public Voto(Candidato candidato,LocalDate horaEmision){
        this.candidato = candidato;
        this.horaEmision = horaEmision;
    }

    public Candidato getCandidato() {
        return this.candidato;
    }

    public LocalDate getHoraEmision() {
        return this.horaEmision;
    }
}


