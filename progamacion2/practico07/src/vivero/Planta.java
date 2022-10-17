package vivero;

import vivero.filtros.Filtro;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familiaPertenece;
    private String clase;
    private int riegoNecesita;
    private int solNecesita;
    private String dondeProspera;

    public Planta(String nombreCientifico,String clasificacionSuperior,String familiaPertenece,String clase,int riegoNecesita,int solNecesita,String dondeProspera){
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familiaPertenece = familiaPertenece;
        this.clase = clase;
        this.riegoNecesita = riegoNecesita;
        this.solNecesita = solNecesita;
        this.dondeProspera = dondeProspera;
        this.nombresVulgares = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return this.nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return this.clasificacionSuperior;
    }

    public String getFamiliaPertenece() {
        return this.familiaPertenece;
    }

    public String getClase() {
        return this.clase;
    }

    public int getRiegoNecesita() {
        return this.riegoNecesita;
    }

    public int getSolNecesita() {
        return this.solNecesita;
    }

    public String getDondeProspera() {
        return this.dondeProspera;
    }

    public boolean tieneNombreVulgar(String nombreVulgar){
        return this.nombresVulgares.contains(nombreVulgar);
    }



    @Override
    public String toString(){
        return "Nombre Cientifico: " + this.getNombreCientifico() + " Sol necesita: " + this.getSolNecesita() + " Riego Necesita: " + this.getRiegoNecesita();
    }
}
