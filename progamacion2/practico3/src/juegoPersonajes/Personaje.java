package juegoPersonajes;

import java.util.ArrayList;

public class Personaje {
    private String nombreReal;
    private String nombreSuperHeroe;
    private int visionNocturna;
    private int velocidad;
    private int fuerza;
    private int peso;
    private int altura;
    private int edad;

    public Personaje(String nombreReal,String nombreSuperHeroe,int visionNocturna,int velocidad,int fuerza,int peso,int altura,int edad){
        this.nombreReal = nombreReal;
        this.nombreSuperHeroe = nombreSuperHeroe;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public double getVisionNocturna() {
        return visionNocturna;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }
}
