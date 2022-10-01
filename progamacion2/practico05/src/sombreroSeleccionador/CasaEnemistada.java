package sombreroSeleccionador;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {
    private ArrayList<Casa> casasEnemigas;

    public CasaEnemistada(String nombre,int cantidadMaxAlumnos){
        super(nombre,cantidadMaxAlumnos);
        this.casasEnemigas = new ArrayList<>();
    }
    @Override
    public boolean verificarAlumno(Alumno a){
        return super.verificarAlumno(a) && this.verificarNoEntreACasaEnemiga(a);
    }
    public boolean verificarNoEntreACasaEnemiga(Alumno a){
        for (int i = 0;i < this.casasEnemigas.size();i++){
            if (this.casasEnemigas.get(i).verificarAlumno(a)){
                return false;
            }
        }
        return true;
    }
}
