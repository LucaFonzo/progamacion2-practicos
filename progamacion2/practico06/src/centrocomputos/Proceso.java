package centrocomputos;

public class Proceso implements Comparable<Proceso> {
    private String nombre;
    private int requerimientoMemoria;

    public Proceso(String nombre,int requerimientoMemoria){
        this.nombre = nombre;
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public int getRequerimientoMemoria(){
        return this.requerimientoMemoria;
    }

    @Override
    public int compareTo(Proceso o) {
        if (this.getRequerimientoMemoria() > o.getRequerimientoMemoria()){
            return 1;
        }else if (this.getRequerimientoMemoria() < o.getRequerimientoMemoria()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                ", reqMemoria=" + requerimientoMemoria +
                '}';
    }

}
