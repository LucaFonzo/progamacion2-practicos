package companiaenvios;

import java.util.ArrayList;

public class ComboPostal extends ElementoEnviable{
    private ArrayList<ElementoEnviable> envios;

    public ComboPostal(int nroTracking){
        super(nroTracking);
        this.envios = new ArrayList<>();
    }

    public void addEnvio(ElementoEnviable elementoEnviable){
        if (this.envios.isEmpty() || elementoEnviable.getCiudadDestino().equals(this.getCiudadDestino())){
            this.envios.add(elementoEnviable);
            elementoEnviable.setNroTracking(this.getNroTracking());
        }
    }

    @Override
    public void setNroTracking(int nroTracking){
        super.setNroTracking(nroTracking);

        for (int i = 0;i < this.envios.size();i++){
            this.envios.get(i).setNroTracking(nroTracking);
        }
    }

    @Override
    public int getPeso() {
        int resultado = 0;
        for (int i = 0;i < this.envios.size();i++){
            resultado += this.envios.get(i).getPeso();
        }
        return resultado;
    }

    @Override
    public Persona getRemitente() {
        return this.envios.get(0).getRemitente();
    }

    @Override
    public Persona getDestinatario() {
        return this.envios.get(0).getDestinatario();
    }
}
