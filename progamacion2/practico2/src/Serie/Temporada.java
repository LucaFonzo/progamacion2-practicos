package Serie;

import java.util.ArrayList;

public class Temporada {
    private int numDeTemporada;
    private ArrayList<Episodio> episodios;
    public Temporada( int numDeTemporada){
        this.numDeTemporada = numDeTemporada;
        this.episodios = new ArrayList<Episodio>();
    }
    //GETS
    public int getNumDeTemporada() {
        return this.numDeTemporada;
    }
    public ArrayList<Episodio> getEpisodios() {
        return this.episodios;
    }
    public int getCantidadEpisodios(){return this.episodios.size();}
    /*● Obtener el total episodios vistos de una temporada particular.*/
    public int getCantidadDeEpisodiosVistos(){
        int cantidadCapVistos = 0;
        for (int i = 0;i < this.episodios.size();i++){
            if (this.episodios.get(i).getCapituloVisto()){
                cantidadCapVistos++;
            }
        }
        return cantidadCapVistos;
    }
    /*Obtener el promedio de las calificaciones dadas para una temporada particular.*/
    public double getPromedioCalificaciones(){
        double promedioCalificaciones = 0;
        for (int i = 0;i < episodios.size();i++){
            if (episodios.get(i).getCapituloVisto()){
                promedioCalificaciones += episodios.get(i).getCalificacion();
            }
        }
        promedioCalificaciones /= this.getCantidadDeEpisodiosVistos();
        return promedioCalificaciones;
    }
    //SETS
    public void setNumDeTemporada(int numDeTemporada) {this.numDeTemporada = numDeTemporada;}
    public void agregarEpisodio(Episodio episodioNuevo){
        this.episodios.add(episodioNuevo);
    }
    public void eliminarEpisodio(Episodio episodioAEliminar){this.episodios.remove(episodioAEliminar);}
}
