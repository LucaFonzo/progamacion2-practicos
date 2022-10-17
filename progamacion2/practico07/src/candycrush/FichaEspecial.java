package candycrush;

public class FichaEspecial extends Ficha{

    public FichaEspecial(int fortaleza,int casillerosOcupa){
        super(fortaleza,casillerosOcupa);
    }

    public int getPoderDestruccion(){
        return this.getFortaleza() / this.getCasillerosOcupa();
    }
}
