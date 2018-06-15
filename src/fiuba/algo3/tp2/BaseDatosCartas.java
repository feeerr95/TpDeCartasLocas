package fiuba.algo3.tp2;

import java.util.HashMap;

public class BaseDatosCartas {
	
	private HashMap<String, Carta> cartas;
	
	public BaseDatosCartas() {
		this.cartas = new HashMap<>();
		CartaMonstruo huevoMonstruoso = new CartaMonstruo("Huevo Monstruoso", 600, 900, new NivelBasico());
		this.cartas.putIfAbsent("Huevo Monstruoso", huevoMonstruoso);
		CartaMonstruo insectoComeHombre = new CartaMonstruo("Insecto Come-Hombres", 450, 600, new NivelBasico());
		this.cartas.putIfAbsent("Insecto Come-Hombres", insectoComeHombre);

		CartaTrampa cilindroMagico = new CartaTrampa("Cilindro Magico");
		this.cartas.putIfAbsent("Cilindro Magico",cilindroMagico);
		CartaMagica agujeroNegro = new CartaMagica("Agujero Negro");
		this.cartas.putIfAbsent("Agujero Negro",agujeroNegro);
	}

	private boolean estaLaCarta(String nombreCarta){
		return this.cartas.containsKey(nombreCarta);
	}

	public Carta buscarCarta(String nombreCarta) {
		if(!this.estaLaCarta(nombreCarta)){
			//LANZAR EXCEPCION DE QUE NO EXISTE LA CARTA
		}
		Carta carta = this.cartas.get(nombreCarta);
		return carta;
	}
}
