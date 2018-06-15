package fiuba.algo3.tp2;

public class CartaMonstruo extends Carta{

	private int atk;
	private int def;
	private Nivel nivel;

	public CartaMonstruo(String unNombre, int unAtaque, int unaDefensa, Nivel nivelDeLaCarta) {
		nivel = nivelDeLaCarta;
		nombreCarta = unNombre;
		atk = unAtaque;
		def = unaDefensa;
	}

	public void atacarOtraCarta(CartaMonstruo otraCarta){
		otraCarta.recibirAtaque(this, this.duenio, this.posicion, this.atk);
	}

	private void recibirAtaque(CartaMonstruo otraCarta, Jugador jugadorAtacante, PosicionCarta posicionAtacante, int ataqueAtacante){
		this.posicion.recibirAtaque(otraCarta, this, posicionAtacante, ataqueAtacante, this.atk, this.def);
	}

	public void restarPuntosDeVida(int cantidad){
		this.duenio.restarPuntosDeVida(cantidad);
	}

	protected void colocarEnCampo(Campo campo){
		nivel.colocarEnCampo(campo, this);
	}
}
