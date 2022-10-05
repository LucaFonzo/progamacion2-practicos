package cooperativaAgricultores;

import java.util.ArrayList;

public class Cereal {
    private ArrayList<String> mineralesPrecisa;

    public Cereal(){
        this.mineralesPrecisa = new ArrayList<>();
    }

    public boolean precisaMineral(String mineral){
        return this.mineralesPrecisa.contains(mineral);
    }

    public boolean sirveLote(Lote lote){
        int index = 0;
        if (this.mineralesPrecisa.size() == lote.cantidadMinerales()){
        while (index < this.mineralesPrecisa.size()){
            if (lote.tieneMineral(this.mineralesPrecisa.get(index))){
                    index++;
                }else {
                    return false;
                }
        }
        }else {
            return false;
        }
        return true;
    }
}
