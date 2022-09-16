public class practico01 {
    public static void main(String[] args){
        PuntoGeometrico p1 = new PuntoGeometrico();
        PuntoGeometrico p2 = new PuntoGeometrico();
        PuntoGeometrico p3 = new PuntoGeometrico();
        PuntoGeometrico p4 = new PuntoGeometrico();
        p1.setX('1');
        p1.setY('1');
        p2.setX('2');
        p2.setY('2');
        p3.setX('3');
        p3.setY('3');
        p4.setX('4');
        p4.setY('4');
        Rectangulo rec1 = new Rectangulo(p1,p2,p3,p4);
        Rectangulo rec2 = new Rectangulo(p1,p2,p3,p4);
    }
}
