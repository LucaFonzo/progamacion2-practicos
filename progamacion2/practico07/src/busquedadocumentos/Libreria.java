package busquedadocumentos;

import javax.print.Doc;
import java.util.ArrayList;

public class Libreria {
    private ArrayList<Documento> documentos;

    public Libreria(){
        this.documentos = new ArrayList<>();
    }

    public void addDocumento(Documento documento){
        this.documentos.add(documento);
    }
}
