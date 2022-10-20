package sistemaelectoral;

import sistemaelectoral.filtro.Filtro;

import java.util.ArrayList;

public class Zona extends ElementoPadron{
    private ArrayList<ElementoPadron> elementosPadron;

    public Zona(){
        this.elementosPadron = new ArrayList<>();
    }

    @Override
    public Integer getCantidadFiltro(Filtro filtro) {
        Integer total = 0;
        for (int i = 0;i < this.elementosPadron.size();i++){
            total += this.elementosPadron.get(i).getCantidadFiltro(filtro);
        }
        return total;
    }

    @Override
    public Double getPorcentajeFiltro(Filtro filtro) {
        Double total = 0.0;
        for (int i = 0;i < this.elementosPadron.size();i++){
            total += this.elementosPadron.get(i).getCantidadFiltro(filtro);
        }

        return (total / this.getCantidadVotos()) * 100;
    }

    @Override
    public Integer getCantidadVotos() {
        Integer total = 0;
        for (int i = 0;i < this.elementosPadron.size();i++){
            total += this.elementosPadron.get(i).getCantidadVotos();
        }
        return total;
    }
}
