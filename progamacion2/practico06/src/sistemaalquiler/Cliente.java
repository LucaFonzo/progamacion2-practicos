package sistemaalquiler;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;

    private ArrayList<Item> itemsAlquilados;


    public Cliente(String nombre,int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.itemsAlquilados = new ArrayList<>();
    }
    public void aniadirItem(Item item){
        this.itemsAlquilados.add(item);
    }


    public boolean chequearAlquilerVencido(){
        for (int i = 0;i < this.itemsAlquilados.size();i++){
            if (this.itemsAlquilados.get(i).isVencido()){
                return true;
            }
        }
        return false;
    }
}
