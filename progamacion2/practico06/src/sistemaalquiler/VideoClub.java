package sistemaalquiler;

import java.util.ArrayList;

public class VideoClub {
    private String nombre;
    private ArrayList<Item> itemsParaAlquilar;

    public VideoClub(String nombre){
        this.nombre = nombre;
        this.itemsParaAlquilar = new ArrayList<>();
    }
}
