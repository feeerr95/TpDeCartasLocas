package fiuba.algo3.tp2;

public class CartaTerreno extends Carta{
	
	public CartaTerreno(){
	}

	@Override
	protected void colocarEnCampo(Campo campo) {
		campo.agregarCartaCampo(this);
	}
}
