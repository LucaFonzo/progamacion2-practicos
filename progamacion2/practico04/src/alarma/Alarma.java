package alarma;

public class Alarma {
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean ventanaAbierta;
    public Alarma(){
        this.vidrioRoto = false;
        this.puertaAbierta = false;
        this.ventanaAbierta = false;
    }
    public boolean comprobar(){
        if (this.vidrioRoto || this.puertaAbierta || this.ventanaAbierta){
            senialSonora();
            return true;
        }
        return false;
    }
    public void senialSonora(){
        System.out.printf("Señal sonora");
    }
}
