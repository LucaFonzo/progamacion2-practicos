package companiaenvios;

public class Carta extends ElementoEnviable{
    private Persona destinatario;
    private Persona remitente;
    private boolean retiraEnSucursal;
    private int peso;

    public Carta(int nroTracking,Persona destinatario,Persona remitente,boolean retiraEnSucursal,int peso){
        super(nroTracking);
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.retiraEnSucursal = retiraEnSucursal;
        this.peso = peso;
    }

    @Override
    public int getPeso() {
        return this.peso;
    }

    @Override
    public Persona getRemitente() {
        return this.remitente;
    }

    @Override
    public Persona getDestinatario() {
        return this.destinatario;
    }
}
