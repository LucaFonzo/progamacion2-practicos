package registroempresa;

import java.util.ArrayList;

public class Jerarquico extends Empleado{
    private ArrayList<Empleado> empleadosACargo;

    public Jerarquico(String nombre,String apellido,int edad,int nroLegajo,double sueldo){
        super(nombre,apellido,edad,nroLegajo,sueldo);
        this.empleadosACargo = new ArrayList<>();
    }

    @Override
    public String getInfo(){
        return "Tipo: Jerarquico" + super.getInfo();
    }
}
