package pilaelementos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Pila {
    private ArrayList<Objects> elementos;
    public Pila(){
        this.elementos = new ArrayList<>();
    }
    public void push(Objects o){
        this.elementos.add(o);
    }
    public void pop(){
        this.elementos.remove(this.elementos.size() - 1);
    }
    public Object top(){
        return this.elementos.get(this.elementos.size() - 1);
    }
    public int size(){
        return this.elementos.size();
    }
    public ArrayList<Objects> copy(){
        return new ArrayList<>(this.elementos);
    }
    public ArrayList<Objects> reverse(){
        ArrayList<Objects> arrayReversed = new ArrayList<>(this.elementos);
        Collections.reverse(arrayReversed);
        return arrayReversed;
    }
}
