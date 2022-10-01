package sombreroSeleccionador;

import java.util.ArrayList;

public class CasaExigente extends Casa{

    public CasaExigente(String nombre,int canitdadMaxDeAlumnos){
        super(nombre,canitdadMaxDeAlumnos);
    }
    @Override
    public boolean verificarAlumno(Alumno a){
        return super.verificarAlumno(a) && this.verificarFamiliar(a.getFamiliaresAsisten());
    }
   public boolean verificarFamiliar(ArrayList<Alumno> a){
        for (int i = 0;i < a.size();i++){
            if (super.getAlumnos().contains(a.get(i))){
                return true;
            }
        }
        return false;
    }
}
