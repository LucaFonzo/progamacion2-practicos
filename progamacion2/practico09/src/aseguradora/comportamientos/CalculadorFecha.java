package aseguradora.comportamientos;

import aseguradora.Seguro;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculadorFecha extends CalculadorMonto{
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;


    public CalculadorFecha(LocalDateTime fechaInicio,LocalDateTime fechaFin){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public Double calcularMonto(Seguro seguro) {
        if (LocalDateTime.now().isAfter(fechaFin) || LocalDateTime.now().isBefore(fechaFin)){
            return 0.0;
        }
        return seguro.getMonto();
    }
}
