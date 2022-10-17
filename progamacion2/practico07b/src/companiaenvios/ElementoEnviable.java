package companiaenvios;

public abstract class ElementoEnviable {
    private int nroTracking;

    public ElementoEnviable(int nroTracking){
        this.nroTracking = nroTracking;
    }

    public int getNroTracking(){
        return this.nroTracking;
    }
    public void setNroTracking(int nroTracking){
        this.nroTracking = nroTracking;
    }

    public String getCiudadDestino(){
        Persona destinatario = this.getDestinatario();
        return destinatario.getCiudad();
    }


    public abstract int getPeso();

    public abstract Persona getRemitente();

    public abstract Persona getDestinatario();


}
