package aseguradora;

import java.time.LocalDate;

public class SeguroTemporal extends Seguro {
    private Seguro seguro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public SeguroTemporal(Seguro seguro,LocalDate fechaInicio,LocalDate fechaFin){
        super(seguro.getDni());
        this.seguro = seguro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public Double getMonto() {
        if (this.fechaInicio.isBefore(LocalDate.now()) || this.fechaFin.isAfter(LocalDate.now())){
            return this.seguro.getMonto();
        }
        return 0.0;
    }

    @Override
    public Integer getPoliza() {
        return seguro.getPoliza();
    }

    @Override
    public boolean tienePalabra(String palabraBuscada) {
        return this.seguro.tienePalabra(palabraBuscada);
    }
}
