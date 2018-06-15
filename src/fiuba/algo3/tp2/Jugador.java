package fiuba.algo3.tp2;

public class Jugador {

	private int puntosDeVida;
	private Campo campoDeJuego;

	public Jugador(Campo campo) {

		this.campoDeJuego = campo;
		this.puntosDeVida = 8000;
		this.campoDeJuego = new Campo();
	}

	public void restarPuntosDeVida(int cantidad){
		this.puntosDeVida -= cantidad;
	}

	public int puntosDeVida(){
		return this.puntosDeVida;
	}
}
