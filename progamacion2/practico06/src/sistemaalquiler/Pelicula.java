package sistemaalquiler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;
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
    public void alquilar(Cliente cliente, long diasAlquilada) {
        if (this.sePuedeAlquilar()){
            this.peliculas.get(0).setFechaAlquiler(LocalDate.now());
            this.peliculas.get(0).setFechaVencimiento(LocalDate.now().plusDays(diasAlquilada));
            cliente.aniadirItem(this.peliculas.get(0));
        }
    }
    @Override
    public boolean isVencido(){
        return ChronoUnit.DAYS.between(this.getFechaAlquiler(),this.getFechaVencimiento()) > this.getDiasAlquiladas();
    }
}
