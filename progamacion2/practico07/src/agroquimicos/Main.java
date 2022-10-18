package agroquimicos;

public class Main {
    public static void main(String[] args) {
        Enfermedad e1 = new Enfermedad("e1");
        Enfermedad e2 = new Enfermedad("e2");
        Enfermedad e3 = new Enfermedad("e3");

        String estado1 = "estado1";
        String estado2 = "estado2";
        String estado3 = "estado3";

        e1.addEstado(estado1);
        e2.addEstado(estado1);
        e1.addEstado(estado2);


        Cultivo c1 = new Cultivo("c1");
        Cultivo c2 = new Cultivo("c2");
        Cultivo c3 = new Cultivo("c3");
        Cultivo c4 = new Cultivo("c4");
        Cultivo c5 = new Cultivo("c5");
        Cultivo c6 = new Cultivo("c6");


        ProductoQuimico p1 = new ProductoQuimico("p1");
        ProductoQuimico p2 = new ProductoQuimico("p2");
        ProductoQuimico p3 = new ProductoQuimico("p3");


    }
}
