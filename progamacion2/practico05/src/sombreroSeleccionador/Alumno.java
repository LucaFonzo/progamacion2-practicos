package sombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Cualidad> cualidades;
    private ArrayList<Alumno> familiaresAsisten;
    private Casa casaPertenece;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiaresAsisten = new ArrayList<>();
        this.casaPertenece = null;
    }
    public ArrayList<Alumno> getFamiliaresAsisten(){return new ArrayList<>(this.familiaresAsisten);}
    public ArrayList<Cualidad> getCualidades(){
        return new ArrayList<>(this.cualidades);
    }
    public Casa getCasaPertenece(){
        return this.casaPertenece;
    }
    public void setCasaPertenece(Casa c){
        this.casaPertenece = c;
    }
}
