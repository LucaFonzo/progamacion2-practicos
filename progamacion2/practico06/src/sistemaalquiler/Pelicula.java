package sistemaalquiler;

import java.util.ArrayList;

public class Pelicula extends Item{

    private String informacion;

    private ArrayList<Pelicula> peliculas;

    public Pelicula(String informacion){
        super();
        this.informacion = informacion;
        this.peliculas = new ArrayList<>();
    }

    public void aniadirPelicula(Pelicula p){
        this.peliculas.add(p);
    }
    @Override
    public boolean sePuedeAlquilar(){
        if (this.peliculas.size() != 0){
            return true;
        }
        return false;
    }
    @Override
    public void alquilar(Cliente cliente,int fechaAlquiler,int fechaVencimiento     ) {
        if (this.sePuedeAlquilar()){
            this.peliculas.get(0).setFechaAlquiler(fechaAlquiler);
            this.peliculas.get(0).setFechaVencimiento(fechaVencimiento);
            cliente.aniadirItem(this.peliculas.get(0));
        }
    }
    @Override
    public boolean isVencido(){
        return this.getFechaVencimiento() > this.getFechaAlquiler();
    }
}
