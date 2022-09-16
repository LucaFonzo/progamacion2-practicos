package AgendaPersonal;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;
    public Agenda(){
        this.reuniones = new ArrayList<Reunion>();
    }
    public boolean aniadirReunion(Reunion r){
        for (int i = 0;i < reuniones.size();i++){
            if (reuniones.get(i).getFecha() == r.getFecha()){
                return false;
            }
        }
        reuniones.add(r);
        return true;
    }
}
