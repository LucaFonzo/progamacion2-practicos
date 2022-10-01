package juegoPersonajes;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Personaje> jugadores;
    private ArrayList<Cualidad> cualidadesAJugar;
    public Juego() {
        this.jugadores = new ArrayList<>();
        this.cualidadesAJugar = new ArrayList<>();
    }

    public void aniadirCualidad(Cualidad c){
        if (!this.cualidadesAJugar.contains(c)){
            this.cualidadesAJugar.add(c);
        }

    }
    public void aniadirJugador(Personaje p){
        if (this.cualidadesAJugar.equals(p.getCualidades()) && !this.jugadores.contains(p)){
            this.jugadores.add(p);
        }
    }


    //Este podria ser un metodo solo para jugar una ronda y que el juego se base en jugar rondas hasta quedarse sin cualidades a comparar
    public Personaje jugar() {
        Cualidad cualidadAJugar = this.cualidadesAJugar.get(0); //La cualidad podria ser una cualidad random
        Personaje ganador = null;
        double puntajeMasAlto = 0;
        for (int i = 0;i < this.jugadores.size();i++){
            for (int j = 0;j < this.jugadores.get(i).getCualidades().size();i++){
                if (cualidadAJugar.equals(this.jugadores.get(i).getCualidades().get(j)) && this.jugadores.get(i).getCualidades().get(j).getPuntuacion() > puntajeMasAlto){
                    puntajeMasAlto = this.jugadores.get(i).getCualidades().get(j).getPuntuacion();
                    ganador = this.jugadores.get(i);
                }
            }
        }
        return ganador;
    }

}
