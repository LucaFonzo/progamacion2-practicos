package sistemaelectoral;

import sistemaelectoral.filtro.Filtro;

import java.util.ArrayList;

public class Mesa extends ElementoPadron{
    private ArrayList<Integer> padron;
    private ArrayList<Voto> votos;

    public Mesa(){
        this.padron = new ArrayList<>();
        this.votos = new ArrayList<>();
    }


    public void addVoto(Persona persona){
        if (this.padron.contains(persona.getDni())){
            this.votos.add(persona.getVoto());
        }
    }

    @Override
    public Integer getCantidadFiltro(Filtro filtro) {
        Integer total = 0;
        for (int i = 0;i < this.votos.size();i++){
            if (filtro.cumple(this.votos.get(i))){
                total++;
            }
        }
        return total;
    }

    @Override
    public Double getPorcentajeFiltro(Filtro filtro) {
        Double total = 0.0;
        for (int i = 0;i < this.votos.size();i++){
            if (filtro.cumple(this.votos.get(i))){
                total++;
            }
        }
        return (total / this.votos.size()) * 100;
    }

    @Override
    public Integer getCantidadVotos() {
        return this.votos.size();
    }
}
