package juegoPersonajes;

public class Cualidad {
    private String nombre;
    private int puntuacion;

    public Cualidad(String nombre,int puntuacion){
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public boolean equals(Object o){
        try {
            Cualidad c = (Cualidad) o;
            return this.nombre == c.getNombre();
        }catch (Exception e){
            return false;
        }
    }
}
