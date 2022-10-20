package sistemaelectoral;

public class Candidato {
    private String nombre;
    private String partidoPolitico;
    private String agrupacion;

    public Candidato(String nombre,String partidoPolitico,String agrupacion){
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    @Override
    public boolean equals(Object o){
        try {
            Candidato otroCandidato = (Candidato) o;
            return this.nombre.equals(otroCandidato.getNombre()) && this.partidoPolitico.equals(otroCandidato.getPartidoPolitico());
        }catch (Exception e){
            return false;
        }
    }
}
