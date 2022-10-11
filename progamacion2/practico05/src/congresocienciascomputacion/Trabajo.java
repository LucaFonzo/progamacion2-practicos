package congresocienciascomputacion;

import java.util.ArrayList;

public class Trabajo {
    private Evaluador evaluador;
    private ArrayList<String> temasTratados;

    public Trabajo(){
        this.evaluador = null;
        this.temasTratados = new ArrayList<String>();
    }


    public boolean sirveEvaluador(Evaluador evaluador){
        if (evaluador.getCantidadDeTemas() == this.temasTratados.size()){
            for (int i = 0;i < this.temasTratados.size();i++){
                if (!evaluador.trataTema(this.temasTratados.get(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void setEvaluador(Evaluador e){
        this.evaluador = e;
    }


    public int getCantidadDeTemas(){
        return this.temasTratados.size();
    }

    public boolean tieneTema(String tema){
        return this.temasTratados.contains(tema);
    }


}
