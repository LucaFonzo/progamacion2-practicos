package alarma;

public class AlarmaLuminosa extends Alarma{
    private Timbre timbre;
    private Luz luz;

    public AlarmaLuminosa(Timbre timbre,Luz luz){
        super();
        this.timbre = timbre;
        this.luz = luz;
    }

    public boolean comprobar(){
        if(super.comprobar()){
            super.senialSonora();
            luz.encender();
            return true;
        }
        return false;
    }
}
