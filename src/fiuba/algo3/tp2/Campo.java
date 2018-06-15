package fiuba.algo3.tp2;

import java.util.Stack;

public class Campo {
	
	private ZonaAtaque zonaAtaque;
	private ZonaDefensa  zonaDefensa;
	private Stack<Carta> cementerio;
	private CartaTerreno terreno;

	
	public Campo() {
		this.zonaDefensa = new ZonaDefensa();
		this.zonaAtaque = new ZonaAtaque();
		this.cementerio = new Stack<>();
	}

	public void agregarCartaMonstruo(CartaMonstruo unaCarta){
		this.zonaAtaque.agregarCarta(unaCarta);
	}

	public void agregarCartaEfecto(CartaEfecto unaCarta){
		this.zonaDefensa.agregarCarta(unaCarta);
	}

	public void agregarCartaCampo(CartaTerreno unaCarta){
		this.terreno = unaCarta;
	}

	public boolean eliminarUnaCarta(){
		return this.zonaAtaque.eliminarUnaCarta();
	}

	public int cantidadDeMonstruos(){
		return zonaAtaque.cantidadDeMonstruos();
	}

	public void eliminarCartasDestruidas(){
		this.zonaAtaque.eliminarCartasDestruidas(cementerio);
	}
}
