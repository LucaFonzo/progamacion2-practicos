package navidad;

import java.util.ArrayList;

public class Carta {
    private Ninio remitente;
    private ArrayList<String> regalos;

    public Carta(Ninio remitente){
        this.remitente = remitente;
        this.regalos = new ArrayList<>();
    }

    public Ninio getRemitente(){
        return this.remitente;
    }

    public void addCarbon(){
        this.regalos.clear();
        this.regalos.add("Trozo De Carbon");
    }

    public void addRegalo(String regalo){
        this.regalos.add(regalo);
    }

    public boolean tieneRegalo(String regalo){
        return this.regalos.contains(regalo);
    }
}
