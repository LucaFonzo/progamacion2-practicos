public class Rectangulo {
    private PuntoGeometrico vertice1,vertice2,vertice3,vertice4;
    public Rectangulo(PuntoGeometrico vertice1,PuntoGeometrico vertice2,PuntoGeometrico vertice3,PuntoGeometrico vertice4){
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }
    public Rectangulo(PuntoGeometrico vertice1,double longitudBase,double longitudAltura){

    }
    public void desplazarRectangulo(double desplazamientoX,double desplazamientoY){
        this.vertice1.setX(desplazamientoX);
        this.vertice1.setY(desplazamientoY);
        this.vertice2.setX(desplazamientoX);
        this.vertice2.setY(desplazamientoY);
        this.vertice3.setX(desplazamientoX);
        this.vertice3.setY(desplazamientoY);
        this.vertice4.setX(desplazamientoX);
        this.vertice4.setY(desplazamientoY);
    }
    public double calcAreRectangulo(){
        double base = 0;
        double altura = 0;
        base = calcBaseRectangulo(this.vertice1,this.vertice2);
        if (base == 0){
            base = calcBaseRectangulo(this.vertice1,this.vertice3);
            altura = calcAlturaRectangulo(this.vertice1,this.vertice2);
        }else {
            altura = calcAlturaRectangulo(this.vertice1,this.vertice3);
            if (altura == 0){
                altura = calcAlturaRectangulo(this.vertice1,this.vertice4);
            }
        }

        return base * altura;
    }
    public double calcBaseRectangulo(PuntoGeometrico v1,PuntoGeometrico v2){
        double base = 0;
        if (v1.getX() > v2.getX()){
            base = v1.getX() - v2.getX();
        }else if (v1.getX() < v2.getX()){
            base = v2.getX() - v1.getX();
        }
        return base;
    }
    public double calcAlturaRectangulo(PuntoGeometrico v1,PuntoGeometrico v2){
        double altura = 0;
        if (v1.getY() > v2.getY()){
            altura = v1.getY() - v2.getY();
        }else if (v1.getY() < v2.getY()){
            altura = v2.getY() - v1.getY();
        }
        return altura;
    }

    public int itsEqual(Rectangulo otroRectangulo){
        if (this.calcAreRectangulo() > otroRectangulo.calcAreRectangulo()){
            return 1;
        }else if (this.calcAreRectangulo() < otroRectangulo.calcAreRectangulo()){
            return -1;
        }else {
            return 0;
        }
    }
    public boolean esUnCuadrado(){
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;
        double lado4 = 0;
        lado1 = calcBaseRectangulo(this.vertice1,this.vertice2);
        lado2 = calcBaseRectangulo(this.vertice3,this.vertice4);
        if (lado1 == 0 && lado2 == 0){
            lado1 = calcBaseRectangulo(this.vertice1,this.vertice3);
            lado2 = calcBaseRectangulo(this.vertice2,this.vertice4);
            if (lado1 == 0 && lado2 == 0){
                lado1 = calcBaseRectangulo(this.vertice1,this.vertice4);
                lado2 = calcBaseRectangulo(this.vertice2,this.vertice3);
                lado3 = calcAlturaRectangulo(this.vertice1,this.vertice2);
                lado4 = calcAlturaRectangulo(this.vertice3,this.vertice4);
                if (lado3 == 0 && lado4 == 0){
                    lado3 = calcAlturaRectangulo(this.vertice1,this.vertice3);
                    lado4 = calcAlturaRectangulo(this.vertice2,this.vertice4);
                }
            }
            lado3 = calcAlturaRectangulo(this.vertice1,this.vertice2);
            lado4 = calcAlturaRectangulo(this.vertice3,this.vertice4);
            if (lado3 == 0 && lado4 == 0){
                lado3 = calcAlturaRectangulo(this.vertice1,this.vertice4);
                lado4 = calcAlturaRectangulo(this.vertice3,this.vertice2);
            }
        }
        if (lado1 == lado2 && lado1 == lado3 && lado1 == lado4){
            return true;
        }
        return false;
    }

    public double determinarLargoSuperior(){
        double ladoSuperior = calcBaseRectangulo(this.vertice1,this.vertice2);
        if (ladoSuperior == 0){
            ladoSuperior = calcBaseRectangulo(this.vertice1,this.vertice3);
            if (ladoSuperior == 0){
                ladoSuperior = calcBaseRectangulo(this.vertice1,this.vertice4);
            }
        }
        return ladoSuperior;
    }
    public boolean estaAcostado(){
        double base = 0;
        double altura = 0;
        base = calcBaseRectangulo(this.vertice1,this.vertice2);
        if (base == 0){
            base = calcBaseRectangulo(this.vertice1,this.vertice3);
            altura = calcAlturaRectangulo(this.vertice1,this.vertice2);
        }else {
            altura = calcAlturaRectangulo(this.vertice1,this.vertice3);
            if (altura == 0){
                altura = calcAlturaRectangulo(this.vertice1,this.vertice4);
            }
        }
        if (altura > base){
            return true;
        }
        return false;
    }
}
