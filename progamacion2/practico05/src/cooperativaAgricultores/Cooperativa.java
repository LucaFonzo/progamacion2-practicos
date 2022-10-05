package cooperativaAgricultores;

import java.util.ArrayList;

public class Cooperativa {
    private String nombre;
    private ArrayList<String> mineralesEspeciales;
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;

    public Cooperativa(String nombre){
        this.nombre = nombre;
        this.lotes = new ArrayList<>();
    }
    public ArrayList<Lote> enQueLotesSePuedeSembrar(Cereal cereal){
        ArrayList<Lote> lotesSePuedeSembrar = new ArrayList<>();
        for (int i = 0;i < lotes.size();i++){
            if(lotes.get(i).sePuedeSembrar(cereal)){
                lotesSePuedeSembrar.add(lotes.get(i));
            }
        }
        return lotesSePuedeSembrar;
    }
    public ArrayList<Cereal> cereals(Lote lote){
        ArrayList<Cereal> cerealesParaElLote = new ArrayList<>();
        for (int i = 0;i < this.cereales.size();i++){
            if (this.cereales.get(i).sirveLote(lote)){
                cerealesParaElLote.add(this.cereales.get(i));
            }
        }
        return cerealesParaElLote;
    }

    public void determinarTipoLote(Lote lote){
        int index = 0;
        while (index < this.mineralesEspeciales.size()){
            if (lote.tieneMineral(this.mineralesEspeciales.get(index))){
                index++;
            }else {
                lote.setTipo("comun");
                return;
            }
        }
        lote.setTipo("especial");
    }
}
