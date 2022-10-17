package candycrush;

import candycrush.filtros.Filtro;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    private ArrayList<Ficha> fichas;


    public Tablero(int puntajeMinimo){
        this.puntajeMinimo = puntajeMinimo;
        this.fichas = new ArrayList<>();
    }

    public void aniadirFicha(Ficha ficha){
        this.fichas.add(ficha);
    }

    public int getDificultad(){
        int fortalezas = 0;
        int poderDestruccion = 0;
        for (int i = 0;i < this.fichas.size();i++){
            fortalezas += this.fichas.get(i).getFortaleza();
            poderDestruccion += this.fichas.get(i).getPoderDestruccion();
        }
        return fortalezas / poderDestruccion;
    }


    public ArrayList<Ficha> buscarFichas(Filtro filtro){
        ArrayList<Ficha> resultado = new ArrayList<>();
        for (int i = 0;i < this.fichas.size();i++){
            if (filtro.cumple(this.fichas.get(i))){
                resultado.add(this.fichas.get(i));
            }
        }
        return resultado;
    }
}
