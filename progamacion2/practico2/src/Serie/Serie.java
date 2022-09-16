package Serie;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String nomCreador;
    private String genero;
    private ArrayList<Temporada> temporadas;
    public Serie(String titulo, String descripcion, String nomCreador, String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nomCreador = nomCreador;
        this.genero = genero;
    }
    //GET
    public String getTitulo() {
        return this.titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public String getNomCreador() {
        return this.nomCreador;
    }
    public String getGenero() {
        return this.genero;
    }
    public ArrayList<Temporada> getTemporadas() {
        return this.temporadas;
    }
    //SET
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNomCreador(String nomCreador) {
        this.nomCreador = nomCreador;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /*Obtener el total de episodios vistos de una serie*/
    public int obtenerCapVistosSerie(){
        int cantidadCapVistos = 0;
        for (int i = 0;i < temporadas.size();i++){
            cantidadCapVistos += temporadas.get(i).getCantidadDeEpisodiosVistos();
        }
        return cantidadCapVistos;
    }
    /*Obtener el promedio de las calificaciones dadas para una serie.*/
    public double obtenerPromedioCalifSerie(){
        double promedioCalifSerie = 0;
        for (int i = 0;i < temporadas.size();i++){
            promedioCalifSerie += temporadas.get(i).getPromedioCalificaciones();
        }
        return promedioCalifSerie;
    }
    public boolean seVieronTodosLosCapts(){
        boolean serieVista = false;
        for (int i = 0;i < temporadas.size();i++){
            if (temporadas.get(i).getCantidadDeEpisodiosVistos() == temporadas.get(i).getCantidadEpisodios()){
                serieVista = true;
            }else {
                return false;
            }
        }
        return serieVista;
    }
}
