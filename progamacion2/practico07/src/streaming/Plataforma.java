package streaming;

import streaming.filtros.Filtro;

import java.util.ArrayList;

public class Plataforma {
    private String nombre;
    private Filtro politicas;
    private ArrayList<Pelicula> peliculas;

    public Plataforma(String nombre){
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> buscarPelicula(Filtro fIltro){
        ArrayList<Pelicula> resultado = new ArrayList<>();
        for (int i = 0;i < this.peliculas.size();i++){
            if (fIltro.cumple(this.peliculas.get(i))){
                resultado.add(this.peliculas.get(i));
            }
        }
        return resultado;
    }

    public void addPelicula(Pelicula pelicula){
        if (this.esRentable(pelicula)){
            this.peliculas.add(pelicula);
        }
    }

    public boolean esRentable(Pelicula pelicula){
        return this.politicas.cumple(pelicula);
    }

    public void setPoliticas(Filtro politca){
        this.politicas = politca;
    }
}
