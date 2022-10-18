package futbol5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class Socio{
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Cuota> cuotasPagadas;
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotasPagadas = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public boolean tienePaga() {
        Cuota ultimaCuota = this.cuotasPagadas.get(this.cuotasPagadas.size() - 1);
        if (ultimaCuota.getFechaPago().getMonth().equals(LocalDateTime.now().getMonth())){
            return true;
        }
        return false;
    }

    public boolean tieneAlquiler(Alquiler alquiler){
        return this.alquileres.contains(alquiler);
    }

    public boolean alquiloCancha(Cancha cancha){
        for (int i = 0;i < this.alquileres.size();i++){
            if (this.alquileres.get(i).getId_cancha() == cancha.getId_cancha()){
                return true;
            }
        }
        return false;
    }

    public boolean pagoMonto(int monto){
        for (int i = 0;i < this.alquileres.size();i++){
            if (this.alquileres.get(i).getMonto() == monto){
                return true;
            }
        }
        return false;
    }
    public int getCantidadAlquileresCancha(Cancha cancha){
        int resultado = 0;
        if (this.alquiloCancha(cancha)){
            for (int i = 0;i < this.alquileres.size();i++){
                if (this.alquileres.get(i).getId_cancha() == cancha.getId_cancha()){
                    resultado++;
                }
            }
        }
        return resultado;
    }
}
