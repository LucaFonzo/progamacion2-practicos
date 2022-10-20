package navidad;

import navidad.filtros.FiltroRegalo;

public class Main {
    public static void main(String[] args) {
        Buzon BuzonAA = new Buzon();
        Buzon BuzonBB = new Buzon();


        Ninio Juan = new Ninio("Juan",  1);
        Ninio Pedro = new Ninio("Pedro",  2);
        Ninio JM = new Ninio("Juan", 3);
        Ninio Anibal = new Ninio("Anibal", 4);

        Ninio Hector = new Ninio("Hector",5);
        Ninio Tomas = new Ninio("Tomas",6);
        Ninio JR = new Ninio("Juan",7);
        Ninio AJ = new Ninio("Anibal",8);

        Carta a = new Carta(Juan);
        Carta b = new Carta(Pedro);
        Carta c = new Carta(JM);
        Carta d = new Carta(Anibal);
        Carta e = new Carta(Hector);
        Carta f = new Carta(Tomas);
        Carta g = new Carta(JR);
        Carta h = new Carta(AJ);


        BuzonAA.addNinio(1);
        BuzonAA.addNinio(2);
        //AA.addNinioBueno(3);
        BuzonAA.addNinio(4);

        BuzonBB.addNinio(5);
        BuzonBB.addNinio(7);

        a.addRegalo("Bicicleta");
        a.addRegalo("Play");
        a.addRegalo("Dados");
        b.addRegalo("Bicicleta");
        b.addRegalo("Play");
        b.addRegalo("Domino");
        c.addRegalo("PC");
        c.addRegalo("Camion");
        d.addRegalo("Triciclo");
        d.addRegalo("Auto");
        d.addRegalo("Camion");

        e.addRegalo("Bicicleta");
        e.addRegalo("Play");
        f.addRegalo("Dados");
        f.addRegalo("Bicicleta");
        f.addRegalo("Play");
        g.addRegalo("Domino");
        g.addRegalo("PC");
        g.addRegalo("Camion");
        h.addRegalo("Triciclo");
        h.addRegalo("Auto");
        h.addRegalo("Camion");


        BuzonAA.addCarta(a);
        BuzonAA.addCarta(b);
        BuzonAA.addCarta(c);
        BuzonAA.addCarta(d);

        BuzonBB.addCarta(e);
        BuzonBB.addCarta(f);
        BuzonBB.addCarta(g);
        BuzonBB.addCarta(h);


        FiltroRegalo bici = new FiltroRegalo("Bicicleta");
        System.out.println("Cartas recibidas: " + BuzonAA.getTotalCartas());
        System.out.println("Porcentaje regalo pedido: " + BuzonAA.getPorcentajeFiltro(bici));
        System.out.println("Cant regalo pedido: " + BuzonAA.getCantidadFiltro(bici));
        FiltroRegalo carbon = new FiltroRegalo("Trozo de carbon");
        System.out.println("Ni�os malos que enviaron carta: "+ BuzonAA.getCantidadFiltro(carbon));

        Zona Sierra = new Zona();

        Sierra.addCorreo(BuzonAA);
        Sierra.addCorreo(BuzonBB);

        System.out.println("Zona Sierra porc regalo pedido bicicleta: " + Sierra.getPorcentajeFiltro(bici));
        System.out.println("Zona Sierra cant cartas recibidas: " + Sierra.getTotalCartas());
        System.out.println("Zona Sierra ninios malos con cartas: " + Sierra.getPorcentajeFiltro(carbon));
        System.out.println("Zona Sierra cant regalos pedidos: " + Sierra.getCantidadFiltro(bici));
    }
}
