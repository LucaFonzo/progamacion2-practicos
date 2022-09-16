package Serie;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean capituloVisto;
    private static int califMin = 1;
    private static int califMax = 5;
    private double calificacion;
    public Episodio(String titulo,String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion = -1;
        this.capituloVisto = false;
    }
    //GETS

    public String getTitulo() {return titulo;}
    public String getDescripcion() {return descripcion;}
    public boolean getCapituloVisto() {
        return capituloVisto;
    }
    public double getCalificacion() {
        return calificacion;
    }

    //SETS
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setCapituloVisto(boolean capituloVisto) {
        this.capituloVisto = capituloVisto;
    }
    /*● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
        no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior
    * */
    public boolean setCalificacion(double calificacion) {
        if (calificacion >= califMin && calificacion <= califMax){
            this.calificacion = calificacion;
            return true;
        }
        return false;
    }
}
