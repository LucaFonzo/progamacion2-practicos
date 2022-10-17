package vivero;

import vivero.filtros.Filtro;
import vivero.filtros.FiltroAnd;
import vivero.filtros.FiltroPorDondeProspera;
import vivero.filtros.FiltroRiegoMenorA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planta p1 = new Planta("auereum","clasificacion1","familia1","clase1",3,5,"interior");
        Planta p2 = new Planta("p2","clasificacion2","familia2","clase2",2,5,"interior");
        Planta p3 = new Planta("p3","clasificacion3","familia3","clase3",1,5,"interior");
        Planta p4 = new Planta("p4","clasificacion4","familia4","clase4",3,5,"interior");

        Vivero v1 = new Vivero("Vivero1");

        v1.addPlanta(p1);
        v1.addPlanta(p2);
        v1.addPlanta(p3);
        v1.addPlanta(p4);

        Filtro f1 = new FiltroRiegoMenorA(3);
        Filtro f2 = new FiltroPorDondeProspera("interior");
        Filtro filtroAnd = new FiltroAnd(f1,f2);
        ArrayList<Planta> resultado = v1.buscarPlantas(filtroAnd);
        System.out.println(resultado);
    }
}
