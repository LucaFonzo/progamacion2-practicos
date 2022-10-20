package sistemaelectoral;

public class Persona {
    private String nombre;
    private Integer dni;
    private Voto voto;

    public Persona(String nombre,Integer dni){
        this.nombre = nombre;
        this.dni = dni;
        this.voto = null;
    }

    public Integer getDni(){
        return this.dni;
    }

    public void setVoto(Voto voto){
        this.voto = voto;
    }

    public Voto getVoto(){
        return this.voto;
    }
}
