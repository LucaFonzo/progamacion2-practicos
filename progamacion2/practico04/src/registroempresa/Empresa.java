package registroempresa;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Asociativo> personasAsociadas;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.personasAsociadas = new ArrayList<>();
    }

    public void aniadirAsociado(Asociativo a){
        personasAsociadas.add(a);
    }

    public void mostrarAsociados(){
        for (int i = 0;i < personasAsociadas.size();i++){
            System.out.println(personasAsociadas.get(i).getInfo() + "\n");
        }
    }
}
