package fiuba.algo3.tp2;

public class PosicionHorizontal implements PosicionCarta {

	@Override
	public void recibirAtaque(CartaMonstruo cartaAtacante, CartaMonstruo cartaAtacada, PosicionCarta otraPosicion, int atkAtacante, int atkAtacado, int defAtacado) {

		int diferenciaDeAtaque = defAtacado - atkAtacante;

		if(diferenciaDeAtaque < 0 ){
			cartaAtacada.destruir();
		}
		else if(diferenciaDeAtaque > 0){
			cartaAtacante.restarPuntosDeVida( Math.abs(diferenciaDeAtaque) );
			cartaAtacante.destruir();
		}
	}

}
