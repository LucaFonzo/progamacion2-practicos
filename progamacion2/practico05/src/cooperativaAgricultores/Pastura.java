package cooperativaAgricultores;

public class Pastura extends Cereal{
    private double superficieNecesaria;

    public Pastura(double superficieNecesaria){
        super();
        this.superficieNecesaria = superficieNecesaria;
    }

    @Override
    public boolean sirveLote(Lote lote){
        return super.sirveLote(lote) && this.superficieNecesaria <= lote.getSuperficie();
    }
}
