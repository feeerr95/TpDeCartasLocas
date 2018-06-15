package fiuba.algo3.tp2;

public class NivelBasico extends Nivel {

    @Override
    public void colocarEnCampo(Campo campo, CartaMonstruo carta) {
        campo.agregarCartaMonstruo(carta);
    }
}
