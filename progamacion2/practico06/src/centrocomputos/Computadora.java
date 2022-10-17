package centrocomputos;

public class Computadora implements Comparable<Computadora>{
    private String nombre;
    private double velocidad;

    public Computadora(String nombre,double velocidad){
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public int compareTo(Computadora o) {
        if (this.getVelocidad() > o.getVelocidad()){
            return 1;
        }else if (this.getVelocidad() < o.getVelocidad()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    public void ejecutarProceso(Proceso p) {
        System.out.println("Ejecutando "+p);
    }
}
