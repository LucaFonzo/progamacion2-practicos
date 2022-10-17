package centrocomputos;

import java.util.ArrayList;

public class ColaOrdenada {
    private ArrayList<Comparable> elementos;

    public ColaOrdenada(){
        this.elementos = new ArrayList<>();
    }


    public void add(Comparable objNuevo){
        int index = 0;
        boolean encontrado = false;

        while (!encontrado && index < this.elementos.size()){
            Comparable aux = this.elementos.get(index);
            if (aux.compareTo(objNuevo) > 0){
                index++;
            }else {
                encontrado = true;
            }
        }

        if (encontrado){
            this.elementos.add(index,objNuevo);
        }
        this.elementos.add(objNuevo);
    }

    public boolean tieneElementos() {
        return !this.elementos.isEmpty();
    }

    public Comparable siguiente(){
        Comparable sig = elementos.get(0);
        elementos.remove(0);
        return sig;
    }

    @Override
    public String toString(){
        return elementos.toString();
    }

}
