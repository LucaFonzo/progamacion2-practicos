package registroempresa;

public class Main {
    public static void main(String[] args) {
        Empleado e1  = new Empleado("joaco","dadad",30,23023,2000);
        Usuario u1 = new Usuario("luca","dadada",29,"lucaf","12345");
        Jerarquico j1 = new Jerarquico("dadad","dadad",23,3223,4000);
        Empresa empresa = new Empresa("empresa");

        empresa.aniadirAsociado(e1);
        empresa.aniadirAsociado(u1);
        empresa.aniadirAsociado(j1);

        empresa.mostrarAsociados();
    }
}
