package centrocomputos;

import java.sql.Array;

public class CentroComputos {
    private ColaOrdenada computadoras;
    private ColaOrdenada procesos;

    public CentroComputos(){
        this.computadoras = new ColaOrdenada();
        this.procesos = new ColaOrdenada();
    }

    public void addComputadora(Computadora computadora){
        this.computadoras.add(computadora);
    }

    public Computadora agregarProceso(Proceso p){
        if (computadoras.tieneElementos()){
            Computadora c1=(Computadora) this.computadoras.siguiente();
            c1.ejecutarProceso(p);
            return c1;
        }
        else {
            this.procesos.add(p);
            return null;
        }
    }

    public void imprimirComputadoras(){
        System.out.println(this.computadoras);
    }

    public void imprimirProcesos(){
        System.out.println(this.procesos);
    }
}
