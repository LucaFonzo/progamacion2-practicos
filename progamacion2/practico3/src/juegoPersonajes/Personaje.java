package juegoPersonajes;

import java.util.ArrayList;

public class Personaje {
    private String nombreReal;
    private String nombreSuperHeroe;

    private ArrayList<Cualidad> cualidades;

    public Personaje(String nombreReal,String nombreSuperHeroe){
        this.nombreReal = nombreReal;
        this.nombreSuperHeroe = nombreSuperHeroe;
        this.cualidades = new ArrayList<>();
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }

    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public Cualidad elegirCualidad(){
        return this.cualidades.get(0);
    } //Tendria que poder retornar cualquiera de sus cualidades

    public ArrayList<Cualidad> getCualidades(){
        return new ArrayList<>(this.cualidades);
    }
}
