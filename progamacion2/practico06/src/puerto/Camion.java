package puerto;

public class Camion extends Vehiculo implements Comparable<Camion>{
    private String patente;
    private int modelo;
    private int fechaCarga;

    public Camion(String patente,int modelo,int fechaCarga){
        this.patente = patente;
        this.modelo = modelo;
        this.fechaCarga = fechaCarga;
    }

    public String getPatente() {
        return this.patente;
    }

    public int getModelo() {
        return this.modelo;
    }

    public int getFechaCarga() {
        return this.fechaCarga;
    }

    public void setFechaCarga(int fechaCarga){
        this.fechaCarga = fechaCarga;
    }

    @Override
    public int compareTo(Camion o) {
        if (this.getFechaCarga() < o.getFechaCarga()){
            return 1;
        }else if (this.getFechaCarga() > o.getFechaCarga()){
            return -1;
        }else {
            return 0;
        }
    }

    public String toString() {
        return this.patente + ", " + this.fechaCarga;
    }
}
