package sistemacontrolgastospublicos;

import java.util.ArrayList;

public class Ciudad {

    private String nombre;

    private ArrayList<ContribuyenteSimple> contribuyentes;

    public Ciudad(String nombre){
        this.nombre = nombre;
        this.contribuyentes = new ArrayList<>();
    }
}
