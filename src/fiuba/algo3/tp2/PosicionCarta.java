package fiuba.algo3.tp2;

public interface PosicionCarta {

     void recibirAtaque(CartaMonstruo cartaAtacante, CartaMonstruo cartaAtacada, PosicionCarta otraPosicion, int atkAtacante,
                        int atkAtacado, int defAtacado);
}