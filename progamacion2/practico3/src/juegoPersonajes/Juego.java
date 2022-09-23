package juegoPersonajes;

public class Juego {
    private Personaje p1, p2;

    public Juego(Personaje p1, Personaje p2) {
        this.p1 = p1;
        this.p2 = p2;
    }


    public Personaje jugarRonda() {
        Personaje jugadorElige = decidirTurnoArranque();
        Personaje jugadorResponde;
        if (jugadorElige.equals(this.p1)) {
            jugadorResponde = this.p2;
        } else {
            jugadorResponde = this.p1;
        }
        for (int i = 0; i < this.p1.getCualidades().size(); i++) {
            if (jugadorElige.elegirCualidad().equals(jugadorResponde.getCualidades().get(i))) {
                Personaje ganador = decidirGanador(jugadorElige.elegirCualidad().getPuntuacion(), jugadorResponde.getCualidades().get(i).getPuntuacion(), jugadorElige, jugadorResponde);
                if (jugadorElige.equals(ganador)){
                    jugadorElige.getCualidades().remove(jugadorElige.elegirCualidad());
                    return ganador;
                }else if(ganador == null) {
                    return ganador;
                }else {
                    jugadorResponde.getCualidades().remove(i);
                    return ganador;
                }
            }
        }
        return null;
    }
    public Personaje decidirTurnoArranque() {
        double c = Math.floor(Math.random() * 2);
        if (c == 1) {
            return this.p1;
        }
        return this.p2;
    }

    public Personaje decidirGanador(int cualidadElige, int cualidadResponde, Personaje jugadorElige, Personaje jugadorResponde) {
        if (cualidadElige > cualidadResponde) {
            return jugadorElige;
        } else if (cualidadResponde > cualidadElige) {
            return jugadorResponde;
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
