package sombreroSeleccionador;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int canitdadMaxDeAlumnos;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Cualidad> cualidadesParaEntrar;
    public Casa(String nombre,int canitdadMaxDeAlumnos){
        this.nombre = nombre;
        this.canitdadMaxDeAlumnos = canitdadMaxDeAlumnos;
        this.cualidadesParaEntrar = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }
    public ArrayList<Alumno> getAlumnos(){
        return new ArrayList<>(this.alumnos);
    }
    public void agregarAlumno(Alumno a){
        if (this.verificarAlumno(a) && this.alumnos.size() < this.canitdadMaxDeAlumnos){
            this.alumnos.add(a);
            a.setCasaPertenece(this);
        }
    }
    public boolean verificarAlumno(Alumno a){return this.cualidadesParaEntrar.equals(a.getCualidades()) && a.getCasaPertenece() == null;}
}
