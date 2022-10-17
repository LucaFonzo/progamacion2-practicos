package candycrush;

public abstract class Ficha {
    private int fortaleza;
    private int casillerosOcupa;


    public Ficha(int fortaleza,int casillerosOcupa){
        this.fortaleza = fortaleza;
        this.casillerosOcupa = casillerosOcupa;
    }

    public abstract int getPoderDestruccion();

    public int getFortaleza() {
        return this.fortaleza;
    }

    public int getCasillerosOcupa() {
        return this.casillerosOcupa;
    }
}
