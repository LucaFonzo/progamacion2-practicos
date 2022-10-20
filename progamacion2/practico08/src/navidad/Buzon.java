package navidad;

import navidad.filtros.Filtro;

import java.util.ArrayList;
import java.util.Iterator;

public class Buzon extends Correo{
    private ArrayList<Integer> dniNinios;
    private ArrayList<Carta> cartas;

    public Buzon(){
        this.dniNinios = new ArrayList<>();
        this.cartas = new ArrayList<>();
    }

    public void addNinio(Integer ninio){
        this.dniNinios.add(ninio);
    }

    public void addCarta(Carta carta){
        if (!this.dniNinios.contains(carta.getRemitente().getDni())){
            carta.addCarbon();
        }
        this.cartas.add(carta);
    }

    @Override
    public Double getPorcentajeFiltro(Filtro filtro) {
        Double total = 0.0;
        for (int i = 0;i < this.cartas.size();i++){
            if (filtro.cumple(this.cartas.get(i))){
                total++;
            }
        }
        return (total / this.getTotalCartas()) * 100;
    }

    @Override
    public Integer getCantidadFiltro(Filtro filtro) {
        Integer total = 0;
        for (int i = 0;i < this.cartas.size();i++){
            if (filtro.cumple(this.cartas.get(i))){
                total++;
            }
        }
        return total;
    }

    @Override
    public Integer getTotalCartas() {
        return this.cartas.size();
    }
}
