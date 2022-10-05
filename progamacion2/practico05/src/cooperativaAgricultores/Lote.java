package cooperativaAgricultores;

import java.util.ArrayList;

public class Lote {
    private double superficie;
    private ArrayList<String> mineralesContiene;
    private String tipo;

    public Lote(double superficie,String tipo){
        this.superficie = superficie;
        this.mineralesContiene = new ArrayList<>();
        this.tipo = tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public double getSuperficie(){
        return this.superficie;
    }

    public boolean tieneMineral(String mineral){
        return this.mineralesContiene.contains(mineral);
    }

    public int cantidadMinerales(){
        return this.mineralesContiene.size();
    }

    public boolean sePuedeSembrar(Cereal cereal){
        for (int i = 0;i < this.mineralesContiene.size();i++){
            if (!cereal.precisaMineral(this.mineralesContiene.get(i))){
                return false;
            }
        }
        return true;
    }
}
