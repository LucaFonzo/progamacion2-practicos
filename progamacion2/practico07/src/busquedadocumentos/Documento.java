package busquedadocumentos;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private ArrayList<String> palabrasClave;
    private String contenido;

    public Documento(String titulo,String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getContenido(){
        return this.contenido;
    }

    public boolean tieneAutor(String autor){
        return this.autores.contains(autor);
    }

    public boolean tienePalabra(String palabra){
        return this.palabrasClave.contains(palabra);
    }

    public int getCantidadPalabrasContenido(){
        return this.contenido.split(" ").length;
    }


}
