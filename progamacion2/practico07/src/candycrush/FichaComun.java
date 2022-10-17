package candycrush;

public class FichaComun extends Ficha{
    private int poderDestruccion;

    public FichaComun(int fortaleza,int casillerosOcupa,int poderDestruccion){
        super(fortaleza,casillerosOcupa);
        this.poderDestruccion = poderDestruccion;
    }


    @Override
    public int getPoderDestruccion(){
        return this.poderDestruccion;
    }
}
