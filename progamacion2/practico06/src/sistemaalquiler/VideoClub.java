package sistemaalquiler;

import java.util.ArrayList;

public class VideoClub {
    private String nombre;
    private ArrayList<Item> itemsParaAlquilar;

    private ArrayList<Cliente> clientes;

    public VideoClub(String nombre){
        this.nombre = nombre;
        this.itemsParaAlquilar = new ArrayList<>();
        this.clientes = new ArrayList<>();

    }
    public ArrayList<Cliente> getClientesConAlquilerVencido(){
        ArrayList<Cliente> resultado = new ArrayList<>();
        for (int i = 0;i < this.clientes.size();i++){
            if (this.clientes.get(i).chequearAlquilerVencido()){
                resultado.add(this.clientes.get(i));
            }
        }
        return resultado;
    }
}
