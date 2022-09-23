package juegoPersonajes;

public class Cualidad {
    private String nombre;
    private int puntuacion;

    public Cualidad(String nombre,int puntuacion){
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getPuntuacion() {
        return this.puntuacion;
    }
    @Override
    public boolean equals(Object o){
        try {
            Cualidad c = (Cualidad) o;

            return c.getNombre() == this.nombre;
        }catch (Exception e){
            return false;
        }
    }
}
