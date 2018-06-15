package fiuba.algo3.tp2;

import java.util.ArrayList;
import java.util.Stack;

public class ZonaAtaque implements ZonaDeJuego {

    private ArrayList<CartaMonstruo> casilleros;

    public ZonaAtaque(){
        this.casilleros = new ArrayList<>();
    }
    @Override
    public void eliminarCartasDestruidas(Stack cementerio) {
        for(CartaMonstruo carta: casilleros){
            carta.mandarAlCementerio(cementerio);
        }
    }

    public void agregarCarta(CartaMonstruo unaCarta) {
        if(casilleros.size() < 5) {
            casilleros.add(unaCarta);
        }
        else{
            //EXCEPCION NO SE PUEDE PONER MAS
        }
    }

    public boolean eliminarUnaCarta(){
        if(casilleros.isEmpty()) return false;
        Carta cartaEliminada = casilleros.remove( casilleros.size() - 1 );
        cartaEliminada.destruir();
        return true;
    }

    public int cantidadDeMonstruos(){
        return casilleros.size();
    }

}
