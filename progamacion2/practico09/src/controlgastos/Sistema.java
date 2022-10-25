package controlgastos;

import controlgastos.filtros.Filtro;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Gasto> gastos;

    public Sistema(){
        this.gastos = new ArrayList<>();
    }

    public Double getTotalFiltro(Filtro filtro){
        Double total = 0.0;
        for (int i = 0;i < this.gastos.size();i++){
            if (filtro.cumple(this.gastos.get(i))){
                total += this.gastos.get(i).getMonto();
            }
        }
        return total;
    }

    public ArrayList<Gasto> buscar(Filtro filtro){
        ArrayList<Gasto> resultado = new ArrayList<>();
        for (int i = 0;i < this.gastos.size();i++){
            if(filtro.cumple(this.gastos.get(i))){
                resultado.add(this.gastos.get(i));
            }
        }
        return resultado;
    }
}
