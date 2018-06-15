package fiuba.algo3.tp2;

public abstract class CartaEfecto extends Carta {

    protected void colocarEnCampo(Campo campo){
        campo.agregarCartaEfecto(this);
    }
}