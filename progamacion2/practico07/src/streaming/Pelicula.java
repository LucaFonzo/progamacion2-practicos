package streaming;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private String director;
    private int anioEstreno;
    private int duracion_minutos;
    private int edadMinimaParaVer;
    private ArrayList<String> generos;
    private ArrayList<String> actores;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracion_minutos, int edadMinimaParaVer) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion_minutos = duracion_minutos;
        this.edadMinimaParaVer = edadMinimaParaVer;
        this.generos = new ArrayList<>();
        this.actores = new ArrayList<>();
    }

    public void addGenero(String genero){
        this.generos.add(genero);
    }

    public void addActor(String actor){
        this.actores.add(actor);
    }

    public boolean tieneGenero(String genero){
        return this.generos.contains(genero);
    }

    public boolean tieneActor(String actor){
        return this.actores.contains(actor);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public int getDuracion_minutos() {
        return duracion_minutos;
    }

    public int getEdadMinimaParaVer() {
        return edadMinimaParaVer;
    }
}
