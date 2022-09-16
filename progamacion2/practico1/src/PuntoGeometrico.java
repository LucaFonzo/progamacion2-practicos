public class PuntoGeometrico {
    private double x;
    private double y;
    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }
    public void desplazarPunto(double desplazamientoX,double desplazamientoY){
        this.x += desplazamientoX;
        this.y += desplazamientoY;
    }
    //SETTERS
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    //GETTERS
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double calcDistEuclidea(PuntoGeometrico otroPunto){
        double distancia2 = Math.pow(this.getX() - otroPunto.getX(),2) + Math.pow(this.getY() - otroPunto.getY(),2);
        double dist = Math.sqrt(distancia2);
        return dist;
    }
}
